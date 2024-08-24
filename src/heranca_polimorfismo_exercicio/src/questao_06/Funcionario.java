package heranca_polimorfismo_exercicio.src.questao_06;

public abstract class Funcionario {
    private final String nome;

    private final int funcional;

    private final double rendaBasica = 1000;

    public Funcionario(String nome, int funcional) {
        this.nome = nome;
        this.funcional = funcional;
    }

    public double getRendaBasica() {
        return rendaBasica;
    }

    public abstract double rendaTotal();

}
