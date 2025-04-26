package br.edu.ifsc.projetonotafiscal;

import org.apache.commons.lang3.StringUtils;

public class Main {
    //classes wrappers
    public  static void print (double d){
        System.out.println(d);
    }

    public static void main(String[] args) {
        String nomeSupermercado = "TEM SUPERMERCADO";
        System.out.println(StringUtils.center(nomeSupermercado, 60));
        System.out.println(StringUtils.leftPad("123", 10));
        Double total = 10.23;
        System.out.println(String.format("%2f", total));
        String nomeProduto = "Nescafe 500g = Selecao especial";
        System.out.printf(StringUtils.abbreviate(nomeProduto, 30));

    }


}