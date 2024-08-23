package heranca_exercicio.src.questao_5;


import heranca_exercicio.src.questao_3.Empregado;

public class Operario extends Empregado {
    private final double valorProducao;

    private final double comissao;

    public Operario(int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public Operario(String nome, String endereco, int codigoSetor, double salarioBase, double imposto, double valorProducao, double comissao) {
        super(nome, endereco, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    @Override
    public double calcularSalario() {
        double bonus = valorProducao * comissao;

        double salarioComBonus = getSalarioBase() + bonus;

        return salarioComBonus - calcularImposto(salarioComBonus);
    }
}
