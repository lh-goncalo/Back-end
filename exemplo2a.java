package aplication;

import java.util.Locale;
import java.util.Scanner;

import entity.exemplo2;

public class exemplo2a {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        exemplo2 x, y;
        x = new exemplo2();
        y = new exemplo2();

        System.out.println("insira o valor do triangulos X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("insira o valor do triangulos Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        
        double areaY = y.area();

        System.out.printf("Triangulo x area: %.4f%n", areaX);
        System.out.printf("Triangulo y area: %.4f%n", areaY);

        if (areaX > areaY){
            System.out.println("A maior area é : X");
        }

        else {
            System.out.println("A maior area é : Y");
        }

        sc.close();
}
}
