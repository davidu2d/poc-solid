package br.com.u2d.s.problema;

public class Fatura {
    /*
    * Princípio da Responsabilidade Única — Uma classe deve ter um, e somente um, motivo para mudar.
    * Esse princípio declara que uma classe deve ser especializada em um único assunto e possuir apenas uma responsabilidade dentro do software,
    * ou seja, a classe deve ter uma única tarefa ou ação para executar
    * Como vemos nesse exemplo essa classe tem 3 motivos para mudar.
    * 1- Se quisermos mudar o tamanho da folha.
    * 2- Se quisermos salvar em banco de dados
    * */
    private long quantidade;
    private double valor;

    public Double calcularValorTotal() {
        return valor * quantidade;
    }

    public void imprimeFaturaA4() {
        System.out.println("------Fatura------");
        System.out.println("------------------");
        System.out.println("Quantidade:   "+quantidade);
        System.out.println("Preço:        "+valor);
        System.out.println("------------------");
        System.out.println("Valor Total:  "+calcularValorTotal());
    }

    public void salvaFaturaArquivo(String nomeArquivo){
        System.out.println("Salvando arquivo: "+nomeArquivo);
    }
}
