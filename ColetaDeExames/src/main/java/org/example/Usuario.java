package org.example;

import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;

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

    public static String gerarUsuario(String nome, Date nascimento) {
        String primeiroNome = nome.split(" ")[0].toUpperCase();
        SimpleDateFormat sdfDia = new SimpleDateFormat("dd");
        String dia = sdfDia.format(nascimento);

        return primeiroNome.substring(0, 2) + dia;
    }

    public static String gerarSenha(Date nascimento) {
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        return sdf.format(nascimento);
    }
}
