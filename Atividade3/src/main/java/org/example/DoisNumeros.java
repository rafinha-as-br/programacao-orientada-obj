package org.example;
import java.util.List;
import  java.util.Scanner;


public class DoisNumeros {
    Scanner scanner = new Scanner(System.in);
    private double numero1;
    private double numero2;

    //pegar numeros com o
    void pegarNumeros(){
        System.out.println("Informe o primeiro número: ");
        double numeroinformado = scanner.nextDouble();
        setNumero1(numeroinformado);
        System.out.println("Informe o segundo número: ");
        numeroinformado = scanner.nextDouble();
        setNumero2(numeroinformado);
    }

    //printar os números
    void printarNumeros(){
        System.out.println();
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
}




