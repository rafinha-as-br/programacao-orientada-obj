package org.example;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.lang3.StringUtils;


public class Main {
    void imprimirProtocolo(Protocolo protocolo){
        // cabeçalho
    }

    public static void main(String[] args){


        try {

            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dataAgora = new Date();
            // instancia estabelecimento
            Estabelecimento estabelecimento = new Estabelecimento(
                    "Hospital Universitário de Gaspar",
                    "Rua das Flores",
                    "123",
                    "Gaspar",
                    "SP",
                    "01234-567",
                    "(11) 99999-0000",
                    "CRF 12345 - Ana Paula da Silva"
            );
            //lista de exames
            Date dataColeta = sdf.parse("25/05/2025");
            Exame exame1 = new Exame("EX123", "Hemograma Completo", dataColeta);
            Exame exame2 = new Exame("EX456", "Glicemia de Jejum", dataColeta);

            List<Exame> exames = new ArrayList<>();
            exames.add(exame1);
            exames.add(exame2);

            //instancia de usuario
            Date dataNascimento = sdf.parse("10/04/1990");
            String nomePaciente = "Carlos Souza";
            String senha = Usuario.gerarSenha(dataNascimento);
            String matricula = "20251234";
            String prontuario = "PRT987654";
            String idade = "34"; // você pode também calcular isso com base nas datas

            Usuario usuario = new Usuario(
                    nomePaciente,
                    idade,
                    "Masculino",
                    dataNascimento,
                    senha,
                    exames,
                    matricula,
                    prontuario
            );

            Medico medico = new Medico("Rafael Souza");


            Protocolo protocoloTeste = new Protocolo(usuario, estabelecimento, medico);

            //imprimindo tudo
            System.out.println("IMAGEM IMAGEM" + StringUtils.leftPad(protocoloTeste.estabelecimento.nome.toUpperCase(), 38) + StringUtils.leftPad("Sistema de apoio", 33));
            System.out.println("IMAGEM IMAGEM" + StringUtils.leftPad(protocoloTeste.estabelecimento.rua, 20) + ", " + protocoloTeste.estabelecimento.numero + " - " + protocoloTeste.estabelecimento.cidade + StringUtils.leftPad ("Protocolo de coleta", 40));
            System.out.println("IMAGEM IMAGEM" + StringUtils.leftPad(protocoloTeste.estabelecimento.estado, 8) + " - CEP: " + protocoloTeste.estabelecimento.cep + " - " + protocoloTeste.estabelecimento.telefone + StringUtils.leftPad(dataAgora.toString(), 46));
            System.out.println(StringUtils.center("", 110, "-"));
            System.out.println(StringUtils.center("Protocolo de coleta", 110, ""));
            System.out.println(StringUtils.center("", 110, "-"));




        } catch (Exception e){
            e.printStackTrace();
        }



    }
}