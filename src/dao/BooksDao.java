/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Author;
import model.Book;
import model.Publisher;

/**
 *
 * @author thoni
 */
public interface BooksDao {

    Book search(String name);
    
    Book searchIsbn(String isbn);
    
    List<String> searchBookFromPublisher(Publisher pub);
    
    List<Book> findAll();

    void update(Book b);

    void insert(Book b, Author a);
    
    void delete(Book b);
}
