import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AulaList {

    public static void main(String[] args){

        // Como criar uma lista
        List<String> list = new ArrayList<String>();

        //Adicionando elementos na lista, se é do tipo string, ela vai receber strings.
        list.add("Maria");
        list.add("Derek");
        list.add("Vitoria");
        list.add("Jacqueline");
        // Adicionei o marcos na posição 2 da lista, sem afetar o resto da lista.
        list.add(2, "marcos");

        // Checar tamanho da lista
        System.out.println(list.size());

        // Removendo itens da lista, podemos colocar o index do que quer ser removido
        // ou digitar exatamente o que queremos que seja deletado
        list.remove(1); // remove oq estiver no index 1
        list.remove("Vitoria"); // Remove o nome Vitoria da lista

        // Remoção predicado, removeIf, removeremos todos os X se tal coisa for true exemplo:
        // No exemplo abaixo, removemos todos aqueles itens que começarem com M na lista
        list.removeIf(x -> x.charAt(0) == 'M');


        // Como encontrar o index de algum item:
        list.lastIndexOf("Jacqueline"); // essa função ira retornar em qual index esta a jacqueline.

        // Utilizando um for each, utilizado para percorrer listas e arrays
        // se le assim:
        // para ( tipo do objeto, nome dos objetos dentro : nome do array ou lista )
        // ele ira percorrer todos os X de dentro da lista, é um for diferente.
        for (String x : list){
            System.out.println(x);
        }

        // Criando uma outra lista, com apenas os nomes que começam com A, da lista principal
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        // Criamos uma outra lista, depois fazemos o filtro lambda, depois transformamos em lista de novo

        // por ultimo, como saber qual é o primeiro nome que aparece na lista com a letra J?
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        // criamos a variavel name, convertemos a lista para.stream e adicionamos um filtro
        // esse filtro diz, ( para x dentro da lista, me mostre o que começar com a letra J
        // caso encontre, usamos o findFirst(), que irá atribuir a variavel name o primeiro que encontrar
        // se não achar, a variavel name vai ser nulla.
    }
}
