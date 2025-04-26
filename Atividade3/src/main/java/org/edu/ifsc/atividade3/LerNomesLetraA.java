package org.edu.ifsc.atividade3;
import java.util.ArrayList;
import java.util.Scanner;
public class LerNomesLetraA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        ArrayList<String> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = sc.nextLine();
            lista.add(nomes[i]);
        }

        System.out.println("Nomes que começam com 'A' (array):");
        for (String nome : nomes) {
            if (nome.toLowerCase().startsWith("a")) {
                System.out.println(nome);
            }
        }

        System.out.println("Nomes que começam com 'A' (ArrayList):");
        lista.stream()
                .filter(n -> n.toLowerCase().startsWith("a"))
                .forEach(System.out::println);

        sc.close();
    }
}
