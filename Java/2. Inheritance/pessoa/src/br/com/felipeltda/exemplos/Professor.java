package br.com.felipeltda.exemplos;

public class Professor extends Pessoa{
    public Professor(String nome, int idade){
        super(nome,idade);
    }

    public void darAula(){
        System.out.println("Estou dando aula!");
    }
}
