package Program;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        // Criando o arquivo e o scanner null
        File file = new File("C:\\Windows\\Temp\\Teste.txt");
        Scanner sc = null;

        // Checando se o arquivo existe e está tudo correto no path
        System.out.println("Existe? " + file.exists());
        System.out.println("É arquivo? " + file.isFile());
        System.out.println("Tamanho: " + file.length() + " bytes");

        // iniciando o try, tentando ler linha por linha
        try {
            sc = new Scanner(file); // fazendo com que o scanner leia o file
            while (sc.hasNextLine()) { // enquanto tiver uma proxima linha no arquivo
                System.out.println(sc.nextLine()); // print a proxima linha
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } finally {
            if (sc != null) { // se o arquivo não for nullo ( ou seja, deu tudo certo )
                sc.close(); //fechamos o scanner
            }
        }
    }
}