/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Publisher;

/**
 *
 * @author thoni
 */
public interface PublishersDao {
    
    Publisher search(String name);
    List<Publisher> findAll();
    void update(Publisher p);
    void insert(Publisher p);
    void delete(Publisher p);
                                    
}
