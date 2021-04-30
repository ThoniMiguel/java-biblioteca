/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.BooksDao;
import dao.DaoFactory;
import dao.PublishersDao;
import java.util.List;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.Book;
import model.Publisher;
import utils.StringFormatter;

/**
 *
 * @author thoni
 */
public class PublisherController {

    PublishersDao pubDao = DaoFactory.createPublisherDao();

    public List<Publisher> findAll() {
        List<Publisher> list = pubDao.findAll();
        return list;
    }

    public boolean verificaNome(String nome) {
        String regex = "[-a-zA-Z'& ]{3,30}";
        boolean verifica = Pattern.matches(regex, nome);
        if (verifica && !(nome.isBlank())) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Campos preenchidos incorretamente.", "Tente Novamente!", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    public boolean verificaUrl(String url) {
        String regex = "[-\\w]{1,20}\\.[-\\w]{1,50}.[-\\w]{1,6}";
        boolean verifica = Pattern.matches(regex, url);
        if (verifica && !(url.isBlank())) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "URL não reconhecida!", "Tente Novamente!", JOptionPane.ERROR_MESSAGE);
            return false;

        }
    }

    public Publisher search(String nome) {
        if (nome.isBlank()) {
            JOptionPane.showMessageDialog(null, "Campos em branco não são permitidos.", "Tente Novamente!", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        nome = StringFormatter.capitalizeWord(nome);
        boolean situacao = verificaNome(nome);
        Publisher p;
        if (situacao) {
            p = pubDao.search(nome);
            return p;
        } else {
            return null;
        }
    }

    public boolean update(String nome, String url, Publisher oldPublisher) {
        nome = StringFormatter.capitalizeWord(nome);
        url = url.toLowerCase();
        Publisher p = new Publisher();
        if (verificaNome(nome) && verificaUrl(url)) {
            p.setName(nome);
            p.setUrl(url);
            p.setId(oldPublisher.getId());
            pubDao.update(p);
            return true;
        } else {
            return false;
        }
    }

    public boolean insert(String nome, String url) {
        if ((nome.isBlank()) || (url.isBlank())) {
            JOptionPane.showMessageDialog(null, "Os campos devem ser preenchidos!", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        nome = StringFormatter.capitalizeWord(nome);
        url = url.toLowerCase();
        if (verificaNome(nome) && verificaUrl(url)) {
            Publisher p = new Publisher(nome, url);
            pubDao.insert(p);
            return true;
        } else {
            return false;
        }
    }

    public void delete(Publisher pub, List<String> isbns) {
        BooksDao booksDao = DaoFactory.createBookDao();
        if (pub != null && !(isbns.isEmpty())) {
            Book arrayBooks[] = new Book[isbns.size()];
            String listToArray[] = new String[isbns.size()];
            listToArray = isbns.toArray(listToArray);
            for (int i = 0; i < arrayBooks.length; i++) {
                arrayBooks[i] = booksDao.searchIsbn(listToArray[i]);
            }
            String livros = "";
            for (Book b : arrayBooks) {
                livros += b.getTitle() + "*";
            }
            int answer = JOptionPane.showConfirmDialog(null, "Esta editora possui os seguintes livros:\n\n" + livros.replace("*", "\n") + "\nExcluindo esta editora, os livros tambem serão perdidos!\nDeseja prosseguir?", "Confirmação", JOptionPane.YES_NO_OPTION);
            if (answer == JOptionPane.YES_OPTION) {
                for (int i = 0; i < arrayBooks.length; i++) {
                    booksDao.delete(arrayBooks[i]);
                }
                pubDao.delete(pub);
                JOptionPane.showMessageDialog(null, "Excluido com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {

            int escolha = JOptionPane.showConfirmDialog(null, "Esta editora nao possui livros, portanto somente ela será excluida!", "Aviso", JOptionPane.YES_NO_OPTION);
            if (escolha == JOptionPane.YES_OPTION) {
                pubDao.delete(pub);
                JOptionPane.showMessageDialog(null, "Excluido com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);

            }
        }
    }
}
