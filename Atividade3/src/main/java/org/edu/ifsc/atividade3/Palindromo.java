package org.edu.ifsc.atividade3;
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        String alterada = frase.replace("a", "@").replace("A", "@");
        System.out.println("Frase alterada: " + alterada);
        sc.close();
    }
}
