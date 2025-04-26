package org.edu.ifsc.atividade3;
import java.util.Scanner;

public class Numeros0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int soma = 0;

        do {
            System.out.print("Digite um número (0 para sair): ");
            numero = sc.nextInt();
            soma += numero;
        } while (numero != 0);

        System.out.println("Soma dos números: " + soma);
        sc.close();
    }
}
