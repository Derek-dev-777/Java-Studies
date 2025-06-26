import java.io.File;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // Pedindo para que o usuario digite o caminho da pasta
        System.out.println("Enter the folder path: ");
        String strPath = sc.nextLine();

        // transcrevendo o caminho que o usuario nos passou para o objeto File
        File path = new File(strPath);

        // Cria um vetor de folders, a partir dos arquivos que são um diretorio dentro do PATH
        // Fazendo um for dentro do vetor onde está as pastas, e então printando seus nomes.
        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");

        for ( File folder : folders){
            System.out.println(folder);
        }

        // Cria um vetor de arquivos da mesma forma que criamos o de cima para pastas
        // a diferença é que o de cima armazena apenas "isDirectory" e esse "isFile"
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");

        for(File file : files){
            System.out.println(file);
        }



    }
}
