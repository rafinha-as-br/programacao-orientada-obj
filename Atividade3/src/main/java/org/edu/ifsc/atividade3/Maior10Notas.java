package org.edu.ifsc.atividade3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Maior10Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10];
        ArrayList<Double> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            lista.add(notas[i]);
        }

        double maior = notas[0];
        for (double nota : notas) {
            if (nota > maior) maior = nota;
        }

        System.out.println("Maior nota (array): " + maior);
        System.out.println("Maior nota (ArrayList): " + Collections.max(lista));

        sc.close();
    }
}
