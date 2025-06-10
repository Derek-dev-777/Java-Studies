package Application;

import Entities.Room;
import java.util.Scanner;

public class Program11 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Room[] rooms = new Room[10];
        int estudantes;

        System.out.println("Digite o numero de estudantes que alugarão os quartos: ");
        estudantes = sc.nextInt();

        for( int i =0; i< estudantes; i++){
            System.out.printf("Rent#%d%n", i+1);
            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Room: ");
            int room = sc.nextInt();

            rooms[room] = new Room(nome,email,room);

        }
        System.out.println("Busy rooms:");

        for (int i = 0; i < 10; i++) {
            if (rooms[i] != null) {
                System.out.println(rooms[i]);
            }
        }

    }
}
