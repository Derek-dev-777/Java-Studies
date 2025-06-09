package Entities;

public class Aluno {

    private double nota1;
    private double nota2;
    private String nome;
    private double media;

    public Aluno(String nome, double nota1, double nota2){

        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nome = nome;
        this.media = (nota1 + nota2) / 2;
    }

    public String getNome(){
        return nome;
    }

    public double getNota1(){
        return nota1;
    }

    public double getNota2(){
        return nota2;
    }

    public double getMedia(){
        return media;
    }


}
