package heranca_polimorfismo_exercicio.src.questao_11;


public class FuncionarioEnsinoBasico extends FuncionarioSemEstudo {
    private final String ensinoBasico;

    public FuncionarioEnsinoBasico(String nome, int funcional, String ensinoBasico, Comissao comissao) {
        super(nome, funcional, comissao);
        this.ensinoBasico = ensinoBasico;
    }

    @Override
    public double calcularRendaTotal() {
        double comissao = getComissao().getAdicional();
        double rendaAnterior = super.calcularRendaTotal() - comissao;

        return  comissao + rendaAnterior * 1.10; //10%
    }

}
