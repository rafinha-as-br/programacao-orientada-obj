package org.example;

import java.util.Date;
import java.util.List;

public class Usuario {
    String nome;
    String idade;
    String sexo;
    Date dataNascimento;
    String senhaUser;
    List<Exame> listaExames;
    String matricula;
    String prontuario;

    public Usuario(String nome, String idade, String sexo, Date dataNascimento, String senhaUser, List<Exame> listaExames, String matricula, String prontuario) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.senhaUser = senhaUser;
        this.listaExames = listaExames;
        this.matricula = matricula;
        this.prontuario = prontuario;
    }
}
