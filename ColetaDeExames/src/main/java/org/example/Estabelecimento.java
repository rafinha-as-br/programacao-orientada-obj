package org.example;

public class Estabelecimento {
    String nome;
    String rua;
    String numero;
    String estado;
    String cep;
    String telefone;
    String responsavelCF;

    public Estabelecimento(String nome, String rua, String numero, String estado, String cep, String telefone, String responsavelCF) {
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
        this.responsavelCF = responsavelCF;
    }
}
