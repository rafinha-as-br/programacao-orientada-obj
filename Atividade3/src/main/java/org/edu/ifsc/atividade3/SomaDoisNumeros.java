package org.edu.ifsc.atividade3;
import  java.util.Scanner;


public class SomaDoisNumeros {
    Scanner scanner = new Scanner(System.in);
    private int numero1;
    private int numero2;

    void obterCalculareExibir(){
        System.out.println("Informe um número: ");
        this.numero1 = scanner.nextInt();
        System.out.println("Informe outro número: ");
        this.numero2 = scanner.nextInt();
        int soma = somar(this.numero1, this.numero2);
        System.out.printf("A soma dos dois numeros é %", soma);
    }

    int somar(int num1, int num2){
        int resultado;
        resultado = num1 + num2;
        return  resultado;
    }




}
