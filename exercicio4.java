package aplication;

import java.util.Locale;
import java.util.Scanner;
import entity.account;

public class exercicio4 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o numero da conta:");
        int accNumber = sc.nextInt();
        System.out.println("Insira o nome:");
        String holder = sc.next();
        System.out.println("Havera deposito inicial ?");
        char initial = sc.next().charAt(0);
        account acc = new account(accNumber, holder);
        double amount;

        if (initial == 'y'){
            System.out.println("Insira o deposito inicial:");
            amount = sc.nextDouble();
        }
        else {
            amount = 0;
        }
        account acc2 = new account(amount);

        System.out.printf("Informaçoes da conta:%nConta:" + acc.getAccNumber() +
        ", Nome:" + acc.getHolder() + ", Saldo: R$" + acc2.getAmount());

        System.out.println();
        System.out.println("Insira o valor de deposito:");
        double deposit = sc.nextDouble();
        acc.deposit(deposit);

        System.out.printf("Informaçoes da conta:%nConta:" + acc.getAccNumber() +
        ", Nome:" + acc.getHolder() + ", Saldo: R$" + acc2.getAmount());

        System.out.println();
        System.out.println("Insira o valor de retirada:");
        double withdraw = sc.nextDouble();
        acc.withdraw(withdraw);

        System.out.printf("Informaçoes da conta:%nConta:" + acc.getAccNumber() +
        ", Nome:" + acc.getHolder() + ", Saldo: R$" + acc2.getAmount());

        sc.close();
    }
}
