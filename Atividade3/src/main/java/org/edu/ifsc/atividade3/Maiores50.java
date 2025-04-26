package org.edu.ifsc.atividade3;
import java.util.ArrayList;
import java.util.Scanner;
public class Maiores50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        ArrayList<Integer> lista = new ArrayList<>();
        int contador = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = sc.nextInt();
            lista.add(numeros[i]);
            if (numeros[i] > 50) contador++;
        }

        System.out.println("Maiores que 50 (array): " + contador);

        long maiores = lista.stream().filter(n -> n > 50).count();
        System.out.println("Maiores que 50 (ArrayList): " + maiores);

        sc.close();
    }
}
