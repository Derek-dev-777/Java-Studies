import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program1 {

    public static void main(String[] args){

        // Criando as palavras que iremos adicionar no nosso arquivo
        String[] lines = new String[] {"Good morning", "Good Afternoon", "Good night"};

        // Caminho do arquivo
        String path = "C:\\Windows\\Temp\\Teste.txt";

        // Iniciando um try que fecha automaticamente os objetos instanciados
        // O principal é o fileWriter onde passamos o arquivo
        // o BufferedWriter serve para aumentar a perfomance de escrita/leitura do arquivo


        // OBS: se colocar um true ao lado do path do FileWriter,
        // ao inves de recriar o arquivo ele irá escrever novas linhas no arquivo ja criado
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            // um for pelo vetor lines, escrevendo cada linha dentro do vetor, no arquivo.
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e){

        }

    }
}
