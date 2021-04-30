/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.AuthorsDao;
import db.DB;
import db.DbException;
import model.Author;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author thoni
 */
public class AuthorsDaoImpl implements AuthorsDao {

    private Connection conn;

    public AuthorsDaoImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Author author) {
        PreparedStatement st = null;
        String sql = "INSERT INTO authors (name, fname) VALUES (?, ?)";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, author.getName());
            st.setString(2, author.getfName());
            st.executeUpdate();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }

    public List<Author> findAll() {
        List<Author> list = new ArrayList<>();

        PreparedStatement st = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM authors";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                Author author = instantiateAuthor(rs);
                list.add(author);
            }
            return list;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
        }
    }

    @Override
    public void update(Author author) {
        PreparedStatement st = null;
        String sql = "UPDATE authors SET name = ?, fname = ? WHERE author_id = ?";
        try {
            st = conn.prepareStatement(sql);
            st.setString(1, author.getName());
            st.setString(2, author.getfName());
            st.setInt(3, author.getId());
            st.executeUpdate();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

    @Override
    public Author search(String name) {
        List<Author> allAuthors = findAll();
        Author authorBasedOnName = allAuthors.stream().filter(obj -> StringUtils.contains(obj.getName(), name) || StringUtils.contains(obj.getfName(), name)).findAny().orElse(null);
        return authorBasedOnName;
    }

    @Override
    public Author search(String nome, String sobrenome) {
        List<Author> allAuthors = findAll();
        Author authorBasedOnName = allAuthors.stream().filter(obj -> StringUtils.contains(obj.getName(), nome) || StringUtils.contains(obj.getfName(), sobrenome)).findAny().orElse(null);
        return authorBasedOnName;

    }

    private Author instantiateAuthor(ResultSet rs) throws SQLException {
        Author author = new Author();
        author.setId(rs.getInt("author_id"));
        author.setName(rs.getString("name"));
        author.setfName(rs.getString("fname"));
        return author;
    }

    public List<String> returnNames() { //retorna um array a partir de uma coluna da tabela Authors;

        PreparedStatement st = null;
        ResultSet rs = null;
        String sqlQuery = "SELECT concat(name,' ',fname) FROM authors";
        List<String> values = new ArrayList<>();
        try {

            st = conn.prepareStatement(sqlQuery);
            rs = st.executeQuery();
            while (rs.next()) {
                values.add(rs.getString("concat"));
            }
            return values;

        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }

    }

    @Override
    public void delete(Author author) {
        PreparedStatement st = null;
        int key = author.getId();
        String sqlQuery = "DELETE FROM authors WHERE author_id = ?";
        try {
            st = conn.prepareStatement(sqlQuery);
            st.setInt(1, author.getId());
            st.executeUpdate();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

//    public void consultaDelete(Author author) {
//        PreparedStatement st = null;
//        ResultSet rs = null;
//        int key = author.getId();
//        String sqlQuery = "COUNT * FROM authors WHERE author_id = ?";
//    }

}
