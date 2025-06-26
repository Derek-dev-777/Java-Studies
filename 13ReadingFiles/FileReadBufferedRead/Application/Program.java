import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class Program {

    public static void main(String[] args)  {

        // Path do arquivo
        String path = "C:\\Windows\\Temp\\Teste.txt";

        // Declaramos os objetos dentro do try, para que ele feche-os automaticamente
        // Evitando assim um programa mais verboso, sem um finally, sem declaração de nulls antes
        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            // Caso não tenha linha para ler, ele retornara null, então faremos um while para verificar
            String line = br.readLine();

            while (line != null){
                // se não for null, eu quero que ele me mostre o texto dessa linha
                System.out.println(line);
                line = br.readLine(); // e então eu já vou para a proxima linha, até vir o null da linha 20
            }
        }
        // para que o programa rode, é necessario adicionar essa exception
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }
}
