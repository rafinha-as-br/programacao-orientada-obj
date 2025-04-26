package org.edu.ifsc.atividade3;
import java.util.ArrayList;
import java.util.Scanner;

public class DezNumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        ArrayList<Integer> lista = new ArrayList<>();
        int pares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
            lista.add(numeros[i]);
            if (numeros[i] % 2 == 0) {
                pares++;
            }
        }

        System.out.println("Quantidade de pares (array): " + pares);

        long paresLista = lista.stream().filter(n -> n % 2 == 0).count();
        System.out.println("Quantidade de pares (ArrayList): " + paresLista);

        sc.close();
    }
}
