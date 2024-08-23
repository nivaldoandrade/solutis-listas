package heranca_exercicio.src.questao_4;

import heranca_exercicio.src.questao_3.Empregado;

public class Administrador extends Empregado {
    private final double ajudaDeCusto;

    public Administrador(int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Administrador(String nome, String endereco, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }


    @Override
    public double calcularSalario() {
        double salarioComAjudaDeCusto = getSalarioBase() + ajudaDeCusto;
        return salarioComAjudaDeCusto - calcularImposto(salarioComAjudaDeCusto);
    }
}
