package heranca_polimorfismo_exercicio.src.questao_05;

public class FuncionarioUniversidade extends FuncionarioEnsinoMedio {
    private final String universidade;

    public FuncionarioUniversidade(String nome, int funcional, String ensinoBasico, String ensinoMedio, String universidade) {
        super(nome, funcional, ensinoBasico, ensinoMedio);
        this.universidade = universidade;
    }


    @Override
    public String toString() {
        String t =  String.format("Funcionário conclui a graduação na universidade: %s", universidade);
        return super.toString() + t;
    }
}
