/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.BooksDao;
import dao.DaoFactory;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.xml.datatype.DatatypeFactory;
import model.Author;
import model.Book;
import model.Publisher;

/**
 *
 * @author thoni
 */
public class BookController {

    BooksDao bookDao = DaoFactory.createBookDao();

    private boolean verificaTitulo(String palavra) {
        String regex = "[\\w ]{3,60}";
        boolean verifica = Pattern.matches(regex, palavra);
        if (verifica && !(palavra.isBlank())) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "O campo TITULO esta preenchido incorretamente!", "Tente Novamente!", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    private boolean verificaPrice(String price) {
        String regex = "^\\d{1,5}((\\.|,)\\d{1,2})?$";
        boolean verifica = Pattern.matches(regex, price);
        if (verifica && !(price.isBlank())) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "O campo PREÇO esta preenchido incorretamente!", "Tente Novamente!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private boolean verificaIsbn(String isbn) {

        String regex = "^\\d{1}-\\d{3}-\\d{5}-\\d{1}";
        boolean verifica = Pattern.matches(regex, isbn);
        if (verifica && !(isbn.isBlank())) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "O campo ISBN esta preenchido incorretamente! Modelo: #-###-#####-#", "Tente Novamente!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private boolean verificaExistenciaIsbn(String isbn) {
        List<Book> list = findAll();
        boolean existeIsbn = list.stream().anyMatch(obj -> obj.getIsbn().contains(isbn));
        if (!(existeIsbn) && !(isbn.isBlank())) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "O campo ISBN já existe no banco de dados!", "Tente Novamente!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public Book search(String titulo) {
        Book b;
        if (titulo.isBlank()) {
            JOptionPane.showMessageDialog(null, "O campo não pode ficar em branco!", "Tente novamente", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        if (verificaTitulo(titulo)) {
            b = bookDao.search(titulo);
            return b;
        } else {
            return null;
        }
    }

    public List<Book> findAll() {
        return bookDao.findAll();
    }

    public boolean update(String titulo, String price, Object p, Book oldBook) {
        double newPrice;
        Book b = new Book();
        PublisherController pubC = new PublisherController();
        Publisher pub = pubC.search((String) p);
        if ((verificaPrice(price)) && (verificaTitulo(titulo))) {
            newPrice = Double.parseDouble(price.replace(",", "."));
            b.setTitle(titulo);
            b.setPrice(newPrice);
            b.setIsbn(oldBook.getIsbn());
            b.setPublisher(pub);
            
            bookDao.update(b);
            return true;
            
        }else{
            return false;
        }

    }
    
    
    public boolean insert(String titulo, String price, String isbn, Object p, Object a){
        PublisherController pubC = new PublisherController();
        AuthorController authC = new AuthorController();
        String[] temp = a.toString().split(" ");
        Author aut = authC.buscarAutores(temp[0], temp[1]);
        
        Publisher pub = pubC.search((String) p);
        Book b = new Book();
        double newPrice;
        
        if((verificaTitulo(titulo) && (verificaPrice(price)) && verificaIsbn(isbn) && verificaExistenciaIsbn(isbn))){
            newPrice = Double.parseDouble(price.replace(",","."));
            b.setTitle(titulo);
            b.setIsbn(isbn);
            b.setPrice(newPrice);
            b.setPublisher(pub);
            
            bookDao.insert(b, aut);
            
            return true;
        }else{
            return false;
        }
        
    }
    
    public boolean delete(Book b){
        if(b != null){
            bookDao.delete(b);
            return true;
        }else{
            return false;
        }
    }
    
    
    public List<String> searchBookFromPublisher(Publisher pub){
        return bookDao.searchBookFromPublisher(pub);
    }

}
