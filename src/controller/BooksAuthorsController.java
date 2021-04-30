/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.BooksAuthorsDao;
import dao.DaoFactory;
import java.util.List;
import model.Author;

/**
 *
 * @author thoni
 */
public class BooksAuthorsController {
        BooksAuthorsDao booksAuthorsDao = DaoFactory.createBooksAuthorsDao();
        
        public List<String> returnIsbn(Author author){
            List<String> isbns = booksAuthorsDao.search(author);
            return isbns;
        }
        
}
