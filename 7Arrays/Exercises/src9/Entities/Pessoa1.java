package Entities;

public class Pessoa1 {

    private String nome;
    private int idade;

    public Pessoa1(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }

    public int getIdade(){
        return idade;
    }
    public String getNome(){
        return nome;
    }

}

