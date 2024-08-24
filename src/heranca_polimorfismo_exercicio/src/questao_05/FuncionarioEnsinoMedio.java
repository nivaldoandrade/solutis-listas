package heranca_polimorfismo_exercicio.src.questao_05;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
    private final String ensinoMedio;

    public FuncionarioEnsinoMedio(String nome, int funcional, String ensinoBasico, String ensinoMedio) {
        super(nome, funcional, ensinoBasico);
        this.ensinoMedio = ensinoMedio;
    }

    @Override
    public String toString() {
        String t =  String.format("Funcionário conclui o ensino médio na escola: %s%n", ensinoMedio);
        return super.toString() + t;
    }
}
