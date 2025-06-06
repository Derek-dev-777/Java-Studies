
public class Aula1VariaveisEPrint {

    public static void main(String[] args) {

        System.out.println("Ola mundo");

        // Declarando variaveis
        int numerointeiro = 25;
        double numero_float = 30.5;
        char letraF = 'f';

        // Exibindo o valor de uma variavel
        System.out.println(numerointeiro);
        System.out.println(letraF);
        System.out.println("valor do numero float: " + numero_float);

        // Formatando uma variavel do tipo float
        System.out.printf("%.2f%n", numero_float); // 2 numeros apos a virgula, %n para quebrar linha

        // Colocando varias variaveis na mesma frase
        String nome = "Derek";
        int idade = 31;
        double renda = 4000.0;

        System.out.printf("O %s tem %d anos e sua renda é de %.2f %n", nome, idade, renda);
    }
}
