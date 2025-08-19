@echo off
REM -------------------------------
REM Rodar Biblioteca Básica (Java)
REM -------------------------------

REM Criar pasta bin se não existir
if not exist bin (
    mkdir bin
)

REM Compilar todas as classes
javac -d bin src\main\*.java src\dao\*.java src\model\*.java

REM Executar o programa
java -cp bin main.Main

pause
