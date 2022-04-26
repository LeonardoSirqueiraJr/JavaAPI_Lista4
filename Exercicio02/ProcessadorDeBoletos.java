package javaapi.src.Exercicio02;

import java.util.ArrayList;

public class ProcessadorDeBoletos {

    protected float pagamento;
    ArrayList<Boleto> boletos = new ArrayList<Boleto>();
    Boleto novoBoleto = new Boleto();
    Pagamento novoPagamento = new Pagamento();
    Fatura novaFatura = new Fatura ();

    public void processarBoletos(){
        for (int i=0; i<boletos.size(); i++){
            novoBoleto = boletos.get(i);
            novoPagamento.valorPago = novoPagamento.valorPago + novoBoleto.valorPago;
        }
        novaFatura.foiPago = novoPagamento.valorPago == novaFatura.valorTotal;
        }

    public ArrayList<Boleto> getBoletos() {
        return this.boletos;
    }
}
