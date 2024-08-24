package heranca_polimorfismo_exercicio.src.questao_11;



public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    private final String ensinoMedio;

    public FuncionarioEnsinoMedio(
            String nome,
            int funcional,
            String ensinoBasico,
            String ensinoMedio,
            Comissao comissao
    ) {
        super(nome, funcional, ensinoBasico, comissao);
        this.ensinoMedio = ensinoMedio;
    }

    @Override
    public double calcularRendaTotal() {
        double comissao = getComissao().getAdicional();
        double rendaAnterior = super.calcularRendaTotal() - comissao;

        return  comissao + rendaAnterior * 1.50; //10%
    }

}
