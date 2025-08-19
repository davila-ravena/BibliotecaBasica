package model;

public class Book {
    private String isbn;
    private String titulo;
    private String autores;
    private String editora;
    private int ano;
    private double preco;

    public Book(String isbn, String titulo, String autores, String editora, int ano, double preco) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autores = autores;
        this.editora = editora;
        this.ano = ano;
        this.preco = preco;
    }

    // Getters e setters
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutores() {
        return autores;
    }

    public String getEditora() {
        return editora;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return isbn + " | " + titulo + " | " + autores + " | " + editora + " | " + ano + " | " + preco;
    }
}
