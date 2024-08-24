package heranca_polimorfismo_exercicio.src.questao_09;

import heranca_polimorfismo_exercicio.src.questao_08.Comissao;
import heranca_polimorfismo_exercicio.src.questao_08.Gerente;
import heranca_polimorfismo_exercicio.src.questao_08.SuperVisor;
import heranca_polimorfismo_exercicio.src.questao_08.Vendedor;

public class MainQuestao09 {

    public static void main(String[] args) {

        Comissao gerente = new Gerente();
        Comissao supervisor = new SuperVisor();
        Comissao vendedor = new Vendedor();

        Funcionario semEstudo = new FuncionarioSemEstudo("Zezé", 777, gerente);
        Funcionario ensinoBasico = new FuncionarioEnsinoBasico(
                "Zezé",
                777,
                "Básico",
                supervisor
        );
        Funcionario ensinoMedio = new FuncionarioEnsinoMedio(
                "Zezé",
                777,
                "Básico",
                "Médio",
                supervisor
        );
        Funcionario universidade = new FuncionarioUniversidade(
                "Zezé",
                777,
                "Básico",
                "Médio",
                "Universidade",
                vendedor
        );

        System.out.printf("Funcionário sem estudo e cargo gerente: %.2f%n",semEstudo.rendaTotal());
        System.out.printf("Funcionário com ensino básico e cargo supervisor: %.2f%n", ensinoBasico.rendaTotal());
        System.out.printf("Funcionário com ensino médio e cargo supervisor: %.2f%n", ensinoMedio.rendaTotal());
        System.out.printf("Funcionário com graduação e cargo vendedor: %.2f%n", universidade.rendaTotal());
    }
}
