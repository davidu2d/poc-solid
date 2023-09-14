package br.com.u2d.s.solucao;

public class ImpressaoFatura {

    public void imprimeFaturaA4(long quantidade, double valor, double valorTotal) {
        System.out.println("------Fatura------");
        System.out.println("------------------");
        System.out.println("Quantidade:   "+quantidade);
        System.out.println("Preço:        "+valor);
        System.out.println("------------------");
        System.out.println("Valor Total:  "+valorTotal);
    }
}
