## 📚 Biblioteca Básica (Java)

## Descrição

Projeto simples em Java que simula um sistema de gerenciamento de biblioteca.
Permite cadastrar, listar, buscar, atualizar e remover livros diretamente no terminal, sem precisar de banco de dados externo.

---

## Funcionalidades

📝 Cadastrar livro (ISBN, título, autores, editora, ano, preço)

📖 Listar todos os livros cadastrados

🔍 Buscar livro pelo ISBN

✏️ Atualizar dados de um livro existente

❌ Remover livro pelo ISBN

✅ Mensagens de sucesso confirmam cada operação.

---

## Tecnologias

- Java 8 ou superior

- Estrutura de pastas organizada: src/ para código-fonte e bin/ para compilação

- Programação Orientada a Objetos (POO)

- Operações CRUD em memória usando ArrayList

---

## Estrutura do Projeto

BibliotecaBasica/
 ├── src/
 │    ├── main/Main.java        --> Menu e interação com o usuário
 │    ├── model/Book.java       --> Classe que representa o livro
 │    └── dao/BookDAO.java      --> Gerenciamento da lista de livros (CRUD)
 └── bin/                       --> Pasta onde serão compiladas as classes

---

## Como Executar

1️⃣ Pelo terminal
cd BibliotecaBasica
javac -d bin src\main\*.java src\dao\*.java src\model\*.java
java -cp bin main.Main

2️⃣ Com o arquivo .bat (Windows)
Clique duas vezes no arquivo rodarBibliotecaBasica.bat
O terminal abrirá, compilando e exibindo o menu do programa

---

## Exemplo de Uso

--- Biblioteca Básica ---

1 - Cadastrar livro

2 - Listar livros

3 - Buscar livro

4 - Atualizar livro

5 - Remover livro

0 - Sair

Escolha uma opção: 1

ISBN: 1234

Titulo: Java Básico

Autores: Ravena

Editora: TechBooks

Ano: 2025

Preco: 49.90

Livro cadastrado com sucesso!

---

## Skills Demonstradas

💻 Java básico e POO

📂 Estrutura de projetos organizada

🛠 Operações CRUD em memória

📋 Manipulação de listas (ArrayList)

🖥 Interação via terminal
