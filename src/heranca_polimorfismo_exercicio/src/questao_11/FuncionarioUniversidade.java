package heranca_polimorfismo_exercicio.src.questao_11;


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
    public double calcularRendaTotal() {
        double comissao = getComissao().getAdicional();
        double rendaAnterior = super.calcularRendaTotal() - comissao;

        return  comissao + rendaAnterior * 2; // 100&
    }
}
