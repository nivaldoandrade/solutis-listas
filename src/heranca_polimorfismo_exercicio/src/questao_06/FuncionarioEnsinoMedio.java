package heranca_polimorfismo_exercicio.src.questao_06;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    private final String ensinoMedio;

    public FuncionarioEnsinoMedio(String nome, int funcional, String ensinoBasico, String ensinoMedio) {
        super(nome, funcional, ensinoBasico);
        this.ensinoMedio = ensinoMedio;
    }

    @Override
    public double rendaTotal() {

        return super.rendaTotal() * 1.5; // 50%
    }
}
