package heranca_polimorfismo_exercicio.src.questao_06;

public class FuncionarioEnsinoBasico extends FuncionarioSemEstudo {
    private final String ensinoBasico;

    public FuncionarioEnsinoBasico(String nome, int funcional, String ensinoBasico) {
        super(nome, funcional);
        this.ensinoBasico = ensinoBasico;
    }

    @Override
    public double rendaTotal() {
        return super.rendaTotal() * 1.10; // 10%
    }
}
