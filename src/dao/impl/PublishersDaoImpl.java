/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.PublishersDao;
import db.DB;
import db.DbException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Publisher;
import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author thoni
 */
public class PublishersDaoImpl implements PublishersDao {

    private Connection conn;

    public PublishersDaoImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public Publisher search(String name) {
        List<Publisher> list = findAll();
        Publisher p = list.stream().filter(obj -> StringUtils.containsIgnoreCase(obj.getName(), name)).findAny().orElse(null);
        return p;
    }

    @Override
    public List<Publisher> findAll() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List<Publisher> list = new ArrayList<>();
        String sqlQueue = "SELECT * FROM publishers";
        try {
            st = conn.prepareStatement(sqlQueue);
            rs = st.executeQuery();
            while (rs.next()) {
                Publisher pub = instantiatePublisher(rs);
                list.add(pub);
            }
            return list;
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

    private Publisher instantiatePublisher(ResultSet rs) throws SQLException {
        Publisher p = new Publisher();
        p.setId(rs.getInt("publisher_id"));
        p.setName(rs.getString("name"));
        p.setUrl(rs.getString("url"));
        return p;
    }

    @Override
    public void update(Publisher p) {
        PreparedStatement st = null;
        String sqlQueue = "UPDATE publishers SET name = ?, url = ? WHERE publisher_id = ?";

        try {
            st = conn.prepareStatement(sqlQueue);

            st.setString(1, p.getName());
            st.setString(2, p.getUrl());
            st.setInt(3, p.getId());
            st.executeUpdate();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

    @Override
    public void insert(Publisher p) {
        PreparedStatement st = null;
        String sqlQueue = "INSERT INTO publishers (name, url) VALUES (?, ?)";
        try {
            st = conn.prepareStatement(sqlQueue);
            st.setString(1, p.getName());
            st.setString(2, p.getUrl());
            st.executeUpdate();
        } catch (SQLException e) {
            throw new DbException(e.getMessage());
        } finally {
            DB.closeStatement(st);
        }
    }
    
    @Override
    public void delete(Publisher p){
        PreparedStatement st = null;
        String query = "DELETE FROM publishers WHERE publisher_id = ?";
        try{
            st = conn.prepareStatement(query);
            
            st.setInt(1, p.getId());
            st.executeUpdate();
        }catch (SQLException e) {
            throw new DbException(e.getMessage());
        }
    }

}
