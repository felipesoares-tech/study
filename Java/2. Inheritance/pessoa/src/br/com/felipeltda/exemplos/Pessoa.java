package br.com.felipeltda.exemplos;

public class Pessoa {
    private final String nome;
    private final int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    private String getNome() {
        return nome;
    }
    private int getIdade() {
        return idade;
    }

    public void andar(){
        System.out.println("Estou andando");
    }
    public void falarNome(){
        System.out.println("O meu nome e "+getNome());
    }

    public void falarIdade(){
        System.out.println("Eu tenho "+getIdade()+" anos");
    }

}
