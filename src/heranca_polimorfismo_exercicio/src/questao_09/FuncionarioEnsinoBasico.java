package heranca_polimorfismo_exercicio.src.questao_09;

import heranca_polimorfismo_exercicio.src.questao_08.Comissao;

public class FuncionarioEnsinoBasico extends FuncionarioSemEstudo {
    private final String ensinoBasico;

    public FuncionarioEnsinoBasico(String nome, int funcional, String ensinoBasico, Comissao comissao) {
        super(nome, funcional, comissao);
        this.ensinoBasico = ensinoBasico;
    }

    @Override
    public double rendaTotal() {
        double comissao = getComissao().getAdicional();
        double rendaAnterior = super.rendaTotal() - comissao;

        return  comissao + rendaAnterior * 1.10; //10%
    }

}
