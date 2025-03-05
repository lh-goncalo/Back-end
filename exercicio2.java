package aplication;

import java.util.Locale;
import java.util.Scanner;

import entity.aluno1;

public class exercicio2 {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        aluno1 aluno = new aluno1();

        System.out.println("Nome do aluno:");
        aluno.name = sc.nextLine();
        System.out.println("nota 1 trimestre:");
        aluno.notaA = sc.nextDouble();
        System.out.println("nota 2 trimestre:");
        aluno.notaB = sc.nextDouble();
        System.out.println("nota 3 trimestre:");
        aluno.notaC = sc.nextDouble();

        if(aluno.aproved() >= 60){
            System.out.println(aluno + "\n Passou");
        }
        else{
            System.out.println(aluno + "\n Reprovou");
            double miss = aluno.aproved() - 60;
            miss = Math.abs(miss);
            System.out.println("Faltou:" + miss + "pontos.");
        }
        sc.close();
    }
    
}
