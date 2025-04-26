package org.edu.ifsc.atividade3;
import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota do aluno: ");
        double nota = sc.nextDouble();

        if (nota >= 6) {
            System.out.println("Aprovado");
        } else if (nota >= 4) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}

