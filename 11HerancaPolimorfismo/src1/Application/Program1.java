package Application;

import Entities.ImportedProduct;
import Entities.Product;
import Entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        System.out.print("Digite o numero de produtos: ");
        int n = sc.nextInt();

        for(int i = 1; i <=  n; i++){
            System.out.printf("Dados do produto #%d: %n", i);
            System.out.print("Comum, Importado ou usado (c/i/u): ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nomeProduto = sc.nextLine();
            System.out.print("Preço: ");
            double precoProduto = sc.nextDouble();

            if(ch == 'i'){
                System.out.print("Valor da taxa: ");
                double fee = sc.nextDouble();

                Product product = new ImportedProduct(nomeProduto,precoProduto,fee);
                list.add(product);

            }
            else if(ch == 'u'){
                System.out.print("Data de fabricação (DD/MM/YYYY): ");
                sc.nextLine();
                String data = sc.nextLine();
                Product product = new UsedProduct(nomeProduto,precoProduto,sdf.parse(data));
                list.add(product);
            }
            else {
                Product product = new Product(nomeProduto, precoProduto);
                list.add(product);
            }

        }
        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product product : list){
            System.out.println(product.priceTag());
        }
    }
}
