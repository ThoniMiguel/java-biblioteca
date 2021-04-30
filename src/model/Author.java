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
public class Author {

    private Integer id;
    private String name, fName;

    public Author() {
    }

    public Author(String name, String fName) {
        this.name = name;
        this.fName = fName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    @Override
    public String toString() {
//        return "Author{" + "id=" + id + ", name=" + name + ", fName=" + fName + '}';
        return "ID = " + id + " | Nome: " + name + " | Sobrenome: " + fName;
    }
}
