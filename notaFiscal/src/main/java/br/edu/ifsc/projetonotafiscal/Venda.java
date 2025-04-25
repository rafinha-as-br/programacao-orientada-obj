package br.edu.ifsc.projetonotafiscal;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Venda {
    private Date dataHora;
    private ArrayList <ItemVenda> itens = new ArrayList<>();
    private ArrayList <Pagamento> pagamentos = new ArrayList<>();
    public static  void main(String[] args){
        System.out.println(new SimpleDateFormat("dd/MM/yyyy HH:mm").format(new Date()));

    }
}
