/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.AuthorsDao;
import dao.BooksDao;
import dao.DaoFactory;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentListener;
import javax.xml.datatype.DatatypeFactory;
import model.Author;
import model.Book;
import org.apache.commons.lang3.ArrayUtils;
import utils.StringFormatter;
import view.TelaAlterarAuthor2;
import view.TelaBuscarAuthor;

/**
 *
 * @author thoni
 */
public class AuthorController {

    AuthorsDao authorsDao = DaoFactory.createAuthorDao();

    public boolean incluirAuthor(String name, String fName) {

        if (verificaNomes(name, fName)) { // checa se name,fname estao de acordo com o regex passado;
            name = StringFormatter.capitalizeWord(name);
            fName = StringFormatter.capitalizeWord(fName);
            Author author = new Author(name, fName);
//            author.incluirAuthor(author);
            authorsDao.insert(author);
            return true;
        }
        return false;
    }

    public boolean updateAuthor(Author obj, Author oldObj) {
        String name = obj.getName();
        String fname = obj.getfName();
        if (verificaNomes(name, fname)) {
            name = StringFormatter.capitalizeWord(name);
            fname = StringFormatter.capitalizeWord(fname);
            obj.setName(name);
            obj.setfName(fname);
            obj.setId(oldObj.getId());
            authorsDao.update(obj);
            return true;
        } else {
            return false;
        }
    }

    private boolean verificaNomes(String name, String fName) {
        String regex = "[a-zA-Z ]{3,25}";
        boolean verificaNome = Pattern.matches(regex, name);
        boolean verificaSobrenome = Pattern.matches(regex, fName);
        if ((verificaNome && verificaSobrenome) && !(name.isBlank() && fName.isBlank())) {
            return true;
        } else {
            return false;
        }
    }

    private boolean verificaNomes(String palavra) {
        String regex = "[a-zA-Z. ]{1,25}";
        boolean verificaPalavra = Pattern.matches(regex, palavra);
        if (verificaPalavra) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Campos preenchidos incorretamente. Tente novamente!");
            return false;
        }
    }

    public Author buscarAutores(String nome, String sobrenome) {
        if (nome.isBlank() && sobrenome.isBlank()) {
            JOptionPane.showMessageDialog(null, "Pelo menos um campo deve ser preenchido");
        }
        if (sobrenome.isBlank()) { //se sobrenome estiver vazio, pesquisarei apenas por nome;
            if (verificaNomes(nome)) {    //conferir se o campo nome foi preenchido corretamente
                nome = StringFormatter.capitalizeWord(nome);

                Author temp = authorsDao.search(nome);

                return temp;
            }
        } else if (nome.isBlank()) {   //se nome estiver vazio, pesquisarei apenas por sobrenome
            if (verificaNomes(sobrenome)) { //usa sobrecarga do metodo verificaNomes para saber se ta dentro do padrao
                sobrenome = StringFormatter.capitalizeWord(sobrenome);

                Author temp = authorsDao.search(sobrenome);

                return temp;
            }
        } else { //se chegar aqui é pq foram preenchidos os dois campos
            if (verificaNomes(nome, sobrenome)) {
                nome = StringFormatter.capitalizeWord(nome);
                sobrenome = StringFormatter.capitalizeWord(sobrenome);

                Author auth = authorsDao.search(nome, sobrenome);

                return auth;
            } else {
                JOptionPane.showMessageDialog(null, "Campos preenchidos incorretamente. Tente novamente!");

            }

        }
        return null;
//        authorsDao.search(busca);
    }

    public List<Author> findAll() {
        List<Author> list = authorsDao.findAll();
        return list;
    }

    public void delete(Author a, List<String> list) {
        BooksDao booksDao = DaoFactory.createBookDao();
        if (a != null && !(list.isEmpty())) {
            Book arrayBooks[] = new Book[list.size()];
            String listToString[] = new String[list.size()];
            listToString = list.toArray(listToString);
            for (int i = 0; i < arrayBooks.length; i++) {
                arrayBooks[i] = booksDao.searchIsbn(listToString[i]);
            }
            String livros = "";
            for (Book b : arrayBooks) {
                livros += b.getTitle() + "*";
            }
            int answer = JOptionPane.showConfirmDialog(null, "Este autor possui os seguintes livros:\n\n" + livros.replace("*", "\n") + "\nExcluindo este autor, os livros tambem serão perdidos!\nDeseja prosseguir?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (answer == JOptionPane.YES_OPTION) {
                for (int i = 0; i < arrayBooks.length; i++) {
                    booksDao.delete(arrayBooks[i]);
                }
                authorsDao.delete(a);
            }

        } else {

            int escolha = JOptionPane.showConfirmDialog(null, "Esse autor nao possui livros, portanto somente ele será excluido!", "Aviso", JOptionPane.YES_NO_OPTION);
            if (escolha == JOptionPane.YES_OPTION) {
                authorsDao.delete(a);

            }

        }
    }

}
