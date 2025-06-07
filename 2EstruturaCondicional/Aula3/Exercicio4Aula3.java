
import java.util.Scanner;

// Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
// começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas
public class Exercicio4Aula3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int horaInicial, horaFinal, duracaoJogo;

        System.out.println("Digite a hora inicial e final do jogo");
        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
            duracaoJogo = horaFinal - horaInicial;
        } else {
            duracaoJogo = (24 - horaInicial) + horaFinal;
        }

        if (duracaoJogo >= 1 && duracaoJogo <= 24) {
            System.out.printf("A duração do jogo foi de: %d", duracaoJogo);
        } else {
            System.out.printf("O jogo ultrapassou 24 horas ou teve menos de 1 horas.");
        }

    }
}
