package Entities3;

public class Student {

    public double nota1;
    public double nota2;
    public double nota3;
    public double notaFinal;
    public String name;

    public double calcularNotaFinal(){

        return notaFinal += nota1 + nota2 + nota3;
    }

    public String PassouOuNao(){

        if (notaFinal >= 60.0){
            return "Passou";
        }
        else{
            double quantoFalta = 60.0 - notaFinal;
            return String.format("Failed, faltam %.2f pontos", quantoFalta);
        }
    }

    public String toString(){
        return String.format("Nome: %s, Nota: %.2f", name, notaFinal);
    }
}
