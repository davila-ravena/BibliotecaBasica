package dao;

import model.Book;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    private List<Book> livros = new ArrayList<>();

    public void adicionarBook(Book book) {
        livros.add(book);
    }

    public List<Book> listarBooks() {
        return livros;
    }

    public Book buscarBook(String isbn) {
        for (Book b : livros) {
            if (b.getIsbn().equals(isbn)) {
                return b;
            }
        }
        return null;
    }

    public boolean atualizarBook(String isbn, Book novoBook) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getIsbn().equals(isbn)) {
                livros.set(i, novoBook);
                return true;
            }
        }
        return false;
    }

    public boolean removerBook(String isbn) {
        return livros.removeIf(b -> b.getIsbn().equals(isbn));
    }
}
