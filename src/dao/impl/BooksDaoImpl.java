/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import controller.PublisherController;
import dao.BooksDao;
import db.DB;
import db.DbException;
import java.util.List;
import model.Book;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import model.Author;
import model.Publisher;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author thoni
 */
public class BooksDaoImpl implements BooksDao {

    private Connection conn;

    public BooksDaoImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public Book search(String name) {
        //todo: talvez implementar uma lista ao inves de um objeto apenas!
        List<Book> list = findAll();
        Book b = list.stream().filter(obj -> StringUtils.containsIgnoreCase(obj.getTitle(), name)).findAny().orElse(null);
        return b;
    }

    @Override
    public Book searchIsbn(String isbn) {
        //todo: talvez implementar uma lista ao inves de um objeto apenas!
        List<Book> list = findAll();
        Book b = list.stream().filter(obj -> StringUtils.containsIgnoreCase(obj.getIsbn(), isbn)).findAny().orElse(null);
        return b;
    }

    @Override
    public List<String> searchBookFromPublisher(Publisher pub) {
        PreparedStatement st = null;
        ResultSet rs = null;
        String query = "SELECT * FROM books WHERE publisher_id = ?";
        List<String> list = new ArrayList<>();
        try{
            st = conn.prepareStatement(query);
            
            st.setInt(1, pub.getId());
            rs = st.executeQuery();
            while(rs.next()){
                list.add(rs.getString("isbn"));
            }
            return list;
        }catch(SQLException e){
            throw new DbException(e.getMessage());
        }finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    @Override
    public List<Book> findAll() {
        PreparedStatement st = null;
        ResultSet rs = null;
        String sql = "SELECT books.*, publishers.name, publishers.url "
                + "FROM books "
                + "INNER JOIN publishers ON books.publisher_id = publishers.publisher_id "
                + "ORDER BY title;";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();

            List<Book> list = new ArrayList<>();
            Map<Integer, Publisher> map = new HashMap<>();

            while (rs.next()) {
                Publisher pub = map.get(rs.getInt("publisher_id"));

                if (pub == null) {
                    pub = instantiatePublisher(rs);
                    map.put(rs.getInt("publisher_id"), pub);
                }

                Book obj = instantiateBook(rs, pub);
                list.add(obj);
            }
            return list;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }

    @Override
    public void update(Book b) {
        PreparedStatement st = null;
        String stringSql = "UPDATE books SET title = ?, publisher_id = ?, price = ? WHERE isbn = ?";
        try {
            st = conn.prepareStatement(stringSql);
            st.setString(1, b.getTitle());
            st.setInt(2, b.getPublisher().getId());
            st.setDouble(3, b.getPrice());
            st.setString(4, b.getIsbn());

            st.executeUpdate();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }

    @Override
    public void insert(Book b, Author a) {
        PreparedStatement st1 = null;
        PreparedStatement st2 = null;
        String sql = "INSERT INTO books (title, isbn, publisher_id, price) VALUES (?, ?, ?, ?)";
        String sql2 = "INSERT INTO booksauthors (isbn, author_id, seq_no) VALUES (?, ?, ?)";
        try {
            st1 = conn.prepareStatement(sql);

            st1.setString(1, b.getTitle());
            st1.setString(2, b.getIsbn());
            st1.setInt(3, b.getPublisher().getId());
            st1.setDouble(4, b.getPrice());
            st1.executeUpdate();

            st2 = conn.prepareStatement(sql2);
            st2.setString(1, b.getIsbn());
            st2.setInt(2, a.getId());
            st2.setInt(3, randomNumber());
            st2.executeUpdate();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st1);
            DB.closeStatement(st2);
        }
    }

    private Publisher instantiatePublisher(ResultSet rs) throws SQLException {
        Publisher p = new Publisher();
        p.setId(rs.getInt("publisher_id"));
        p.setName(rs.getString("name"));
        p.setUrl(rs.getString("url"));
        return p;
    }

    private Book instantiateBook(ResultSet rs, Publisher pub) throws SQLException {
        Book b = new Book();
        b.setIsbn(rs.getString("isbn"));
        b.setTitle(rs.getString("title"));
        b.setPrice(rs.getDouble("price"));
        b.setPublisher(pub);
        return b;
    }

    private int randomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(9 + 1 - 1) + 1;
        return randomNumber;
    }

    @Override
    public void delete(Book b) {
        String key = b.getIsbn();
        String sql = "DELETE FROM booksauthors WHERE isbn = ?;"
                + "DELETE FROM books WHERE isbn = ?;";

        PreparedStatement st = null;

        try {
            st = conn.prepareStatement(sql);

            st.setString(1, key);
            st.setString(2, key);
            st.executeUpdate();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }

    public void delete(String isbn) {

    }
}
