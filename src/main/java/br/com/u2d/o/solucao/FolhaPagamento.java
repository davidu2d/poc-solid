package br.com.u2d.o.solucao;

public class FolhaPagamento {

    /*
    Alterar uma classe já existente para adicionar um novo comportamento, corremos um sério risco de introduzir bugs em algo que já estava funcionando
    com o uso de interface ou classes asbtratas adicionamos um comportamento generico para quando hover evolução não precisarmos modificar o codigo sem bugs
    * */
    private static double salario;

    public static void calcular(Remuneravel remuneravel) {
        salario = remuneravel.salario();
    }
}
