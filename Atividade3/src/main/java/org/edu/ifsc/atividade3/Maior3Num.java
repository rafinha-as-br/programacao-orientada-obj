package org.edu.ifsc.atividade3;
import java.util.Scanner;

public class Maior3Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        int c = sc.nextInt();

        int maior = a;

        if (b > maior) maior = b;
        if (c > maior) maior = c;

        System.out.println("Maior número: " + maior);
        sc.close();
    }
}
