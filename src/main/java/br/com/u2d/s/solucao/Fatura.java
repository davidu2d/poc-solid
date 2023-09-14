package br.com.u2d.s.solucao;

public class Fatura {
    /*
    * Princípio da Responsabilidade Única — Uma classe deve ter um, e somente um, motivo para mudar.
    * Esse princípio declara que uma classe deve ser especializada em um único assunto e possuir apenas uma responsabilidade dentro do software,
    * ou seja, a classe deve ter uma única tarefa ou ação para executar
    * Criamos classes separadas para a impressão e persistencia da fatura
    * */
    private long quantidade;
    private double valor;

    public Double calcularValorTotal() {
        return valor * quantidade;
    }

}
