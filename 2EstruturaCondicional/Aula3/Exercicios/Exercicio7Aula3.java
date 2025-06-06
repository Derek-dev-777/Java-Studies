import java.util.Scanner;

// Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
// de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
// ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
// Se o ponto estiver na origem, escreva a mensagem “Origem”.
// Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
// situação.
public class Exercicio7Aula3 {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        double x, y;

        System.out.println("Digite o valor de X e Y");
        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x > 0 && y > 0){
            System.out.println("O ponto pertence ao bloco Q1");
        }
        else if ( x > 0 && y < 0){
            System.out.println("O ponto pertence ao bloco Q4");
        }
        else if (x < 0 && y > 0){
            System.out.println("O ponto pertence ao bloco Q2");
        }
        else if (x < 0 && y < 0){
            System.out.println("O ponto pertence ao bloco Q3");
        }
        else{
            System.out.println("O ponto esta na origem do plano cartesiano");
        }

    }
}