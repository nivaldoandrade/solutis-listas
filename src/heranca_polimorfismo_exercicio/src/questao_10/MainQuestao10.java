package heranca_polimorfismo_exercicio.src.questao_10;

import heranca_polimorfismo_exercicio.src.questao_08.Comissao;
import heranca_polimorfismo_exercicio.src.questao_08.Gerente;
import heranca_polimorfismo_exercicio.src.questao_08.SuperVisor;
import heranca_polimorfismo_exercicio.src.questao_08.Vendedor;
import heranca_polimorfismo_exercicio.src.questao_09.Funcionario;
import heranca_polimorfismo_exercicio.src.questao_09.FuncionarioUniversidade;
import heranca_polimorfismo_exercicio.src.questao_09.FuncionarioEnsinoBasico;
import heranca_polimorfismo_exercicio.src.questao_09.FuncionarioEnsinoMedio;

public class MainQuestao10 {

    public static void main(String[] args) {
        double custoTotal = 0;
        double custoGerente = 0;
        double custoSupervisor = 0;
        double custoVendedor = 0;

        Funcionario[] funcionarios = criarFuncionario();

        for(Funcionario f: funcionarios) {
            double rendaTotal = f.rendaTotal();
            Comissao comissao = f.getComissao();

            custoTotal += rendaTotal;

            if(comissao instanceof Gerente) {
                custoGerente += rendaTotal;
            } else if (comissao instanceof SuperVisor) {
                custoSupervisor += rendaTotal;
            } else if (comissao instanceof Vendedor) {
                custoVendedor += rendaTotal;
            }
        }

        imprimirRelatorioDeCusto(
                custoTotal,
                custoGerente,
                custoSupervisor,
                custoVendedor
        );
    }

    private static void imprimirRelatorioDeCusto(
            double custoTotal,
            double custoGerente,
            double custoSupervisor,
            double custoVendedor
    ) {
        System.out.println("====== Relátorio de Custo da Empresa ======");
        System.out.printf("Custo dos gerentes: %.2f%n", custoGerente);
        System.out.printf("Custo dos supervisores: %.2f%n", custoSupervisor);
        System.out.printf("Custo dos vendedores: %.2f%n", custoVendedor);
        System.out.printf("Custo total: %.2f", custoTotal);
    }

    private static Funcionario[] criarFuncionario() {
        Funcionario[]  funcionarios = new Funcionario[10];

        for(int i = 0; i < funcionarios.length; i++) {
            int index = i + 1;
            if(i < 1) {
                funcionarios[i] = criarFuncionarioEnsinoBasico(
                        "Func. Básico " + index,
                        index,
                        "Escola Básica " + index,
                        new Gerente()
                );
                continue;
            }

            if(i < 3) {
                funcionarios[i] = criarFuncionarioEnsinoMedio(
                        "Func. Médio" + index,
                        index,
                        "Escola Básica " + index,
                        "Escola Médio " + index,
                        new SuperVisor()
                );
                continue;
            }

            funcionarios[i] = criarFuncionarioUniverdade(
                    "Func. Médio" + index,
                    index,
                    "Escola Básica " + index,
                    "Escola Médio " + index,
                    "Universidade " + index,
                    new Vendedor()
            );
        }

        return funcionarios;
    }

    private static FuncionarioEnsinoBasico criarFuncionarioEnsinoBasico(
            String nome,
            int codigoFuncional,
            String ensinoBasico,
            Comissao comissao
    ) {
        return new FuncionarioEnsinoBasico(nome, codigoFuncional, ensinoBasico, comissao);
    }

    private static FuncionarioEnsinoMedio criarFuncionarioEnsinoMedio(
            String nome,
            int codigoFuncional,
            String ensinoBasico,
            String ensinoMedio,
            Comissao comissao
    ) {
        return new FuncionarioEnsinoMedio(nome, codigoFuncional, ensinoBasico, ensinoMedio, comissao);
    }
    private static FuncionarioUniversidade criarFuncionarioUniverdade(
            String nome,
            int codigoFuncional,
            String ensinoBasico,
            String ensinoMedio,
            String universidade,
            Comissao comissao
    ) {
        return new FuncionarioUniversidade(nome, codigoFuncional, ensinoBasico, ensinoMedio, universidade, comissao);
    }
}
