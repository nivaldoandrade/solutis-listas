package heranca_polimorfismo_exercicio.src.questao_05;

public abstract class Funcionario {
    private final String nome;

    private final int funcional;

    public Funcionario(String nome, int funcional) {
        this.nome = nome;
        this.funcional = funcional;
    }

    @Override
    public String toString() {
        return String.format(
                "Nome do funcionário: %s%n" +
                "Código funcional : %d",
                nome, funcional
        );
    }


}
