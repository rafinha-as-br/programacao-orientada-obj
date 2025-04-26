package org.edu.ifsc.atividade3;
import java.util.Scanner;


public class VogaisFrase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine().toLowerCase();
        int vogais = 0;

        for (char c : frase.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vogais++;
            }
        }

        System.out.println("Quantidade de vogais: " + vogais);
        sc.close();
    }
}
