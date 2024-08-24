package heranca_polimorfismo_exercicio.src.questao_09;

import heranca_polimorfismo_exercicio.src.questao_08.Comissao;

public abstract class Funcionario {
    private final String nome;

    private final int funcional;

    private final double rendaBasica = 1000;

    private Comissao comissao;

    public Funcionario(String nome, int funcional, Comissao comissao) {
        this.nome = nome;
        this.funcional = funcional;
        this.comissao = comissao;
    }

    public double getRendaBasica() {
        return rendaBasica;
    }

    public Comissao getComissao() {
        return comissao;
    }

   public abstract double rendaTotal();

}
