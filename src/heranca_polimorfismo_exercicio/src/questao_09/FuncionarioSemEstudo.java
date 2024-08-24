package heranca_polimorfismo_exercicio.src.questao_09;

import heranca_polimorfismo_exercicio.src.questao_08.Comissao;

public class FuncionarioSemEstudo extends Funcionario {

    public FuncionarioSemEstudo(String nome, int funcional, Comissao comissao) {
        super(nome, funcional, comissao);
    }

    @Override
    public double rendaTotal() {
        return getRendaBasica() + getComissao().getAdicional();
    }

}
