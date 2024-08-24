package heranca_polimorfismo_exercicio.src.questao_11;


public class FuncionarioSemEstudo extends Funcionario {

    public FuncionarioSemEstudo(String nome, int funcional, Comissao comissao) {
        super(nome, funcional, comissao);
    }

    @Override
    public double calcularRendaTotal() {
        return getRendaBasica() + getComissao().getAdicional();
    }
}
