package org.edu.ifsc.atividade3;

public class NumerosPares0100 {
    public static void main(String[] args) {
        for (int i = 100; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
