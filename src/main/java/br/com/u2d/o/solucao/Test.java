package br.com.u2d.o.solucao;

public class Test {

    public static void main(String[] args) {
        ContratoClt clt = new ContratoClt();
        ContratoEstag estag = new ContratoEstag();
        ContratoPj pj = new ContratoPj();

        FolhaPagamento.calcular(clt);
        FolhaPagamento.calcular(estag);
        FolhaPagamento.calcular(pj);
    }
}
