package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class exercicio3 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o preço do dólar ?");
        CurrencyConverter.price = sc.nextDouble();
        System.out.println("Qual valor a ser comprado ?");
        CurrencyConverter.buy = sc.nextDouble();

        System.out.println("Valor a ser pago em reais: R$:" + CurrencyConverter.converter());

        sc.close();
    }
    
}
