package heranca_polimorfismo_exercicio.src.questao_06;

public class FuncionarioSemEstudo extends Funcionario {
    public FuncionarioSemEstudo(String nome, int funcional) {
        super(nome, funcional);
    }

    @Override
    public double rendaTotal() {
        return getRendaBasica();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
