package aplication;

import java.util.Locale;
import java.util.Scanner;

import entity.funcionario1;

public class exercicio1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        funcionario1 func = new funcionario1();

        System.out.println("Insira o nome do funcionaario:");
        func.name = sc.nextLine();
        System.out.println("Insira o salario bruto:");
        func.grossSalary = sc.nextDouble();
        System.out.println("Insira o imposto");
        func.tax = sc.nextDouble();

        System.out.println(func);

        System.out.println("Acrescentar porcentagem:");
        double percent = sc.nextDouble();
        func.increaseSalary(percent);

        System.out.println(func);

        sc.close();
        
    }
    
}
