package heranca_exercicio.src.questao_6;

import heranca_exercicio.src.questao_3.Empregado;

public class Vendedor extends Empregado {
    private double valorVendas;

    private double comissao;

    public Vendedor(int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public Vendedor(String nome, String endereco, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    @Override
    public double calcularSalario() {
        double bonus = valorVendas * comissao;

        double salarioComBonus = getSalarioBase() + bonus;

        return salarioComBonus - calcularImposto(salarioComBonus);
    }
}
