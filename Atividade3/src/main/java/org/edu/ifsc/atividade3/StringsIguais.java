package org.edu.ifsc.atividade3;
import java.util.Scanner;

public class StringsIguais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a primeira string: ");
        String s1 = sc.nextLine();
        System.out.print("Digite a segunda string: ");
        String s2 = sc.nextLine();

        if (s1.equals(s2)) {
            System.out.println("As strings são iguais.");
        } else {
            System.out.println("As strings são diferentes.");
        }

        sc.close();
    }

}
