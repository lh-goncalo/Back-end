package aplication;

import java.util.Locale;
import java.util.Scanner;

import entity.Product;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira os dados do produto:");
        System.out.println("Nome:");
        String name = sc.nextLine();
        System.out.println("Preço:");
        double price = sc.nextDouble();
        Product product = new Product(name, price);

        product.setName("Computer");
        System.out.println("Atualizacao:" + product.getName());
        
        System.out.println();
        System.out.println("Informações do Produto:" + product);

        System.out.println();
        System.out.println("Entrando no estoque:");
        int quantity = sc.nextInt();
        product.AddProducts(quantity);

        System.out.println();
        System.out.println("Informaçoes atualizadas:" + product);

        System.out.println();
        System.out.println("Saindo do estoque:");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Informaçoes atualizadas:" + product);

        sc.close();
    }
}
