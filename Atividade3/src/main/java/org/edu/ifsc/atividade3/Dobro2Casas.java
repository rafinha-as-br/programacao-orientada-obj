package org.edu.ifsc.atividade3;
import  java.util.Scanner;


public class Dobro2Casas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número real: ");
        double numero = sc.nextDouble();
        double dobro = numero * 2;
        System.out.printf("Dobro: %.2f%n", dobro);
        sc.close();
    }
}
