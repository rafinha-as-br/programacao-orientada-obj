package br.edu.ifsc.projetonotafiscal;

public class Pagamento {
    public enum Tipo {
        Dinheiro, Pix, Cheque, Credito, Debito
    }
    private Tipo tipo;
    private Double valor;


}
