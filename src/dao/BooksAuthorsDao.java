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
public interface BooksAuthorsDao {
    
    List<String> search(Author author);
}
