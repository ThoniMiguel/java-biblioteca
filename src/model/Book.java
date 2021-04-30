/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author thoni
 */
public class Book {
    private String title;
    private String isbn;
    private Double price;
    private Publisher publisher; 
    
    public Book(){}

    public Book(String title, String isbn, Double price, Publisher publisher) {
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
//        return "Book{" + "title=" + title + ", isbn=" + isbn + ", price=" + price + ", publisher=" + publisher + '}';
        return "Title: " + title + "| ISBN: " + isbn + "| Price: " + price + "| Publisher " + publisher;
    }
    
    
    
}
