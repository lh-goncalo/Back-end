package aplication;
import java.util.Locale;
import java.util.Scanner;

public class exemplo1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC;

        System.out.println("insira o valor do triangulos X:");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("insira o valor do triangulos Y:");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        
        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

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
