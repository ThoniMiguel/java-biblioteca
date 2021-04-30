/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.BooksAuthorsDao;
import db.DB;
import db.DbException;
import java.sql.Connection;
import model.Author;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Publisher;

/**
 *
 * @author thoni
 */
public class BooksAuthorsImpl implements BooksAuthorsDao {

    private Connection conn;

    public BooksAuthorsImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<String> search(Author author) {
        PreparedStatement st = null;
        ResultSet rs = null;
        List<String> isbns = new ArrayList<>();
        try {
            st = conn.prepareStatement("SELECT * FROM booksauthors WHERE author_id = ?");
            st.setInt(1, author.getId());
            rs = st.executeQuery();

            while (rs.next()) {
                isbns.add(rs.getString("isbn"));
            }

            return isbns;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeResultSet(rs);
            DB.closeStatement(st);
        }
    }

}
