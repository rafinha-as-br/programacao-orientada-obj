package org.example;

public class Estabelecimento {
    String nome;
    String rua;
    String numero;
    String cidade;
    String estado;
    String cep;
    String telefone;
    String responsavelCF;

    public Estabelecimento(String nome, String rua, String numero, String cidade, String estado, String cep, String telefone, String responsavelCF) {
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
        this.responsavelCF = responsavelCF;
    }
}
