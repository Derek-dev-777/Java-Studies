package Application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String path = "C:\\Windows\\Temp\\teste.csv";
        sc.close();

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){

        }
        catch ( IOException e){


        }

    }
}
