package org.edu.ifsc.atividade3;
import java.util.Scanner;

public class media10Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            soma += sc.nextDouble();
        }

        double media = soma / 10;
        System.out.println("Média: " + media);
        sc.close();
    }
}
