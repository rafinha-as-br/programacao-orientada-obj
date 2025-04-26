package org.edu.ifsc.atividade3;
import  java.util.Scanner;


public class ImprimirDoisNumeros {
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

    //imprimir os números
    void printarNumeros(){
        double num1 = getNumero1();
        double num2 = getNumero2();

        System.out.printf("%.2f%n", num1);
        System.out.printf("%.2f%n", num2);
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }
}




