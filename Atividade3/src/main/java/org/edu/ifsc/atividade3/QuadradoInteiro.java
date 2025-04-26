package org.edu.ifsc.atividade3;
import java.util.Scanner;

public class QuadradoInteiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        int quadrado = numero * numero;
        System.out.println("Quadrado: " + quadrado);
        sc.close();
    }
}
