package org.example;

public class Protocolo {

    //informações do usuário, estabelecimento e médico
    Usuario usuario;
    Estabelecimento estabelecimento;
    Medico medico;

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Protocolo(Usuario usuario, Estabelecimento estabelecimento, Medico medico) {
        this.usuario = usuario;
        this.estabelecimento = estabelecimento;
        this.medico = medico;
    }
}

