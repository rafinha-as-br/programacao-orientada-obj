package org.example;
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
            // instancia estabelecimento
            Estabelecimento estabelecimento = new Estabelecimento(
                    "Hospital Universitário de Gaspar",
                    "Rua das Flores",
                    "123",
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


            //função de imprimir TESE
            System.out.println("IMAGEM IMAGEM " + StringUtils.left(protocoloTeste.estabelecimento.nome.toUpperCase(), 80) + StringUtils.rightPad("Sistema de apoio", 80));



        } catch (Exception e){
            e.printStackTrace();
        }



    }
}