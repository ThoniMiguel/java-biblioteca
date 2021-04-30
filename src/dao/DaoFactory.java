/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.impl.*;
import db.DB;

/**
 *
 * @author thoni
 */
public class DaoFactory {

    public static AuthorsDao createAuthorDao() {
        return new AuthorsDaoImpl(DB.getConnection());
    }

    public static PublishersDao createPublisherDao() {
        return new PublishersDaoImpl(DB.getConnection());
    }

    public static BooksDao createBookDao() {
        return new BooksDaoImpl(DB.getConnection());
    }

    public static BooksAuthorsDao createBooksAuthorsDao() {
        return new BooksAuthorsImpl(DB.getConnection());
    }
}
