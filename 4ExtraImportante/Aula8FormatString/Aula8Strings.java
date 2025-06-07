
public class Aula8Strings {

    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG   ";

        // Deixando uma string toda em minusculo
        String originalMinusculo = original.toLowerCase(); // .toLowerCase
        System.out.println(originalMinusculo); // toLowerCase()

        // Deixando uma string toda em maiusculo
        String originalMaiusculo = original.toUpperCase(); // .toUpperCase
        System.out.println(originalMaiusculo); // .toUpperCase

        // Removendo os espaços nos CANTOS da string
        String originalEspaços = original.trim(); // .trim
        System.out.println(originalEspaços);

        // Com substring ele imprimirá a string A PARTIR do caracter especifico, que colocarmos no index
        String originalSubString = original.substring(2); // Nesse caso a partir do 2 caracter
        System.out.println(originalSubString);

        // O replace, nos informamos qual caracter queremos substituir, e pelo o que
        // pode ser mais de um caracter tambem
        String originalReplace = original.replace("a", "x"); // .replace
        System.out.println(originalReplace);
    }
}
