import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program {

    public static void main(String[] args)  {

        // Instanciando mos objetos nulos
        String path = "C:\\Windows\\Temp\\Teste.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try{
            // criamos um objeto filereader passando o path, e depois para aumentar a performace
            // nos atribuimos ao buffered reader o objeto fr
            fr = new FileReader(path);
            br = new BufferedReader(fr);

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
        finally{
            // e no fim, nos fazemos um try para tentar fechar os arquivos
            try{
                if (br != null){
                    br.close();
                }
                if (fr != null){
                    fr.close();
                }
            }
            // se não der, ele só mostrará a stack do erro e cabo
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
