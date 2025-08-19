package main;

import dao.BookDAO;
import model.Book;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookDAO dao = new BookDAO();
        int opc;

        do {
            System.out.println("\n--- Biblioteca Básica ---");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Buscar livro");
            System.out.println("4 - Atualizar livro");
            System.out.println("5 - Remover livro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opc = sc.nextInt();
            sc.nextLine(); // consumir quebra de linha

            switch (opc) {
                case 1:
                    System.out.print("ISBN: ");
                    String isbn = sc.nextLine();
                    System.out.print("Titulo: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autores: ");
                    String autores = sc.nextLine();
                    System.out.print("Editora: ");
                    String editora = sc.nextLine();
                    System.out.print("Ano: ");
                    int ano = sc.nextInt();
                    System.out.print("Preco: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();
                    dao.adicionarBook(new Book(isbn, titulo, autores, editora, ano, preco));
                    System.out.println("Livro cadastrado com sucesso!");
                    break;
                case 2:
                    if (dao.listarBooks().isEmpty()) {
                        System.out.println("Nenhum livro cadastrado.");
                    } else {
                        for (Book b : dao.listarBooks()) {
                            System.out.println(b);
                        }
                    }
                    break;
                case 3:
                    System.out.print("ISBN para buscar: ");
                    String isbnBusca = sc.nextLine();
                    Book bBusca = dao.buscarBook(isbnBusca);
                    System.out.println(bBusca != null ? bBusca : "Livro não encontrado!");
                    break;
                case 4:
                    System.out.print("ISBN do livro a atualizar: ");
                    String isbnAtualiza = sc.nextLine();
                    System.out.print("Novo Titulo: ");
                    String novoTitulo = sc.nextLine();
                    System.out.print("Novos Autores: ");
                    String novosAutores = sc.nextLine();
                    System.out.print("Nova Editora: ");
                    String novaEditora = sc.nextLine();
                    System.out.print("Novo Ano: ");
                    int novoAno = sc.nextInt();
                    System.out.print("Novo Preco: ");
                    double novoPreco = sc.nextDouble();
                    sc.nextLine();
                    boolean atualizado = dao.atualizarBook(isbnAtualiza,
                            new Book(isbnAtualiza, novoTitulo, novosAutores, novaEditora, novoAno, novoPreco));
                    System.out.println(atualizado ? "Livro atualizado com sucesso!" : "Livro não encontrado!");
                    break;
                case 5:
                    System.out.print("ISBN do livro a remover: ");
                    String isbnRemove = sc.nextLine();
                    boolean removido = dao.removerBook(isbnRemove);
                    System.out.println(removido ? "Livro removido com sucesso!" : "Livro não encontrado!");
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opc != 0);

        sc.close();
    }
}
