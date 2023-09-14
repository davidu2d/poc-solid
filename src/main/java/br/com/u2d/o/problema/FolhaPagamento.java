package br.com.u2d.o.problema;

public class FolhaPagamento {

    /*
    *Princípio Aberto-Fechado — Objetos ou entidades devem estar abertos para extensão, mas fechados para modificação,
    * ou seja, quando novos comportamentos e recursos precisam ser adicionados no software, devemos estender e não alterar o código fonte original.
    * nesse caso se houver a necessidade de incluir um novo contrato teremoas que acrescentar um else if para contemplar esse novo caso
    * */

    private double salario;

    public void calcular() {
        TipoContrato tp = TipoContrato.CLT;

        if(tp.equals(TipoContrato.CLT)){
            ContratoClt contratoClt = new ContratoClt();
            salario = contratoClt.salario();
        } else {
            ContratoEstag contratoEstag = new ContratoEstag();
            salario = contratoEstag.bolsa();
        }
    }
}
