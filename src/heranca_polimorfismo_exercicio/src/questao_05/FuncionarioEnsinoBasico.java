package heranca_polimorfismo_exercicio.src.questao_05;

public class FuncionarioEnsinoBasico extends FuncionarioSemEstudo {
    private final String ensinoBasico;

    public FuncionarioEnsinoBasico(String nome, int funcional, String ensinoBasico) {
        super(nome, funcional);
        this.ensinoBasico = ensinoBasico;
    }

    public String getEnsinoBasico() {
        return ensinoBasico;
    }

    @Override
    public String toString() {
        String t =  String.format("%nFuncionário conclui o ensino básico na escola: %s%n", ensinoBasico);
        return super.toString() + t;
    }
}
