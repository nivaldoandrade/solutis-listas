package heranca_polimorfismo_exercicio.src.questao_09;

import heranca_polimorfismo_exercicio.src.questao_08.Comissao;

public class FuncionarioUniversidade extends FuncionarioEnsinoMedio {
    private final String universidade;

    public FuncionarioUniversidade(
            String nome,
            int funcional,
            String ensinoBasico,
            String ensinoMedio,
            String universidade,
            Comissao comissao
    ) {
        super(nome, funcional, ensinoBasico, ensinoMedio, comissao);
        this.universidade = universidade;
    }

    @Override
    public double rendaTotal() {
        double comissao = getComissao().getAdicional();
        double rendaAnterior = super.rendaTotal() - comissao;

        return  comissao + rendaAnterior * 2; // 100&
    }
}
