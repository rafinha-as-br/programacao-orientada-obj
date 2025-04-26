package org.edu.ifsc.atividade3;
import java.util.Scanner;


public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para ver a tabuada: ");
        double numero = sc.nextDouble();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d + %.1f = %.1f%n", i, numero, i + numero);
            System.out.printf("%d - %.1f = %.1f%n", i, numero, i - numero);
            System.out.printf("%d * %.1f = %.1f%n", i, numero, i * numero);
            System.out.printf("%d / %.1f = %.2f%n", i, numero, i / numero);
            System.out.println();
        }

        sc.close();
    }
}
