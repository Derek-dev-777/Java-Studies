package Entities;

public class Product {

    // INICIAMOS  OS ATRIBUTOS DA NOSSA CLASSE, ELES DEVEM SER PRIVATES PARA PROTEÇÃO
    // PARA EDITA-LOS E ATRIBUIR VALORES A ELES DEVEMOS USAR GET AND SETS APÓS OS CONSTRUTORES.
    private String name;
    private double price;
    private int quantity;

    // --------------------------------------------------------------------------------------------------
    // CRIAMOS O CONSTRUTOR ( QUANDO FOR INSTANCIADA NO MAIN, DEVE SE PASSAR OS PARÂMETROS REQUISITADOS,
    // POIS A CLASSE NAO DEVE INICIAR SEM VALORES )

    public Product (String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    // SOBRECARGA, CASO TENHA UM PARÂMETRO QUE SEJA OPCIONAL, VOCÊ PODE INSTANCIAR 2 CONSTRUTORES IGUAIS,
    // MAS CUSTOMIZADOS, QUE IRÁ FUNCIONAR NORMALMENTE
    // NESSE CASO, DIFERENTE DO CONSTRUTOR DE CIMA, A QUANTIDADE É OPCIONAL, SE NÃO FOR PASSADA SERÁ 0.

    public Product (String name, double price){
        this.name = name;
        this.price = price;

    }
    // --------------------------------------------------------------------------------------------------

    // ENCAPSULAMENTO, ABAIXO UTILIZAMOS GET AND SET PARA ACESSAR OS ATRIBUTOS QUE ESTÃO PRIVADOS
    // ASSIM PODEMOS ESCOLHER O QUE PODE SER MOSTRADO E ALTERADO, POR QUESTÃO DE PROTEÇÃO E CONSISTENCIA.
    // ENTÃO PRIMEIRO CRIAMOS UM GET, E DEPOIS UM SET, GET E SET, GET E SET.
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }
    // não iremos criar um set para quantidade, pq não queremos que façam um set manualmente
    // na classe existe metodos para adicionar quantidade e remover quantidade.
    // e ai esta a utilidade do encapsulamento, definir oq pode ou nao ser alterado e mostrado.

    // --------------------------------------------------------------------------------------------------

    // METODOS ABAIXO ( CALCULAR VALOR DO ESTOQUE, ADICIONAR QUANTIDADE, REMOVER QUANTIDADE
    public double totalValueInStock(){
        return price * quantity;
    }

    public void addQuantity(int quantity){

        this.quantity += quantity;

    }

    public void removeQuantity(int quantity){

        this.quantity -= quantity;
    }

    // FORMATAR PARA STRING A CLASSE, PARA PODERMOS CHAMAR NO MAIN SEM PROBLEMAS
    public String toString(){

        return name + ", $ " + price + ", " + quantity + " units, Total: $ " + totalValueInStock();
    }
}
