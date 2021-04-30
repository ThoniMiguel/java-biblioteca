/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Author;

/**
 *
 * @author thoni
 */
public interface AuthorsDao {
    
    void insert(Author author);
    List<Author> findAll();
    Author search(String name);
    Author search(String nome, String sobrenome);
    void update(Author author);
    void delete(Author author);
//    List<String> returnArray(String fieldName);
}
