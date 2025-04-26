package org.edu.ifsc.atividade3;

import java.util.ArrayList;
import java.util.Scanner;

public class NumerosInversos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
            lista.add(numeros[i]);
        }

        System.out.println("Ordem inversa (array):");
        for (int i = 4; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nOrdem inversa (ArrayList):");
        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.print(lista.get(i) + " ");
        }

        sc.close();
    }
}
