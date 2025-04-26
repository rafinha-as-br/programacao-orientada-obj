package org.edu.ifsc.atividade3;
import java.util.Scanner;


public class NumeroMaior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Maior: " + a);
        } else if (b > a) {
            System.out.println("Maior: " + b);
        } else {
            System.out.println("São iguais.");
        }

        sc.close();
    }
}
