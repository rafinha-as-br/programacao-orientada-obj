package org.edu.ifsc.atividade3;
import java.util.Scanner;

public class NomeCompleto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = sc.nextLine().trim();

        String primeiroNome = nomeCompleto.split(" ")[0];
        System.out.println("Primeiro nome: " + primeiroNome);
        sc.close();
    }
}
