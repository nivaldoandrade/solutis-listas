package heranca_polimorfismo_exercicio.src.questao_07;

import heranca_polimorfismo_exercicio.src.questao_06.FuncionarioUniversidade;
import heranca_polimorfismo_exercicio.src.questao_06.FuncionarioEnsinoBasico;
import heranca_polimorfismo_exercicio.src.questao_06.FuncionarioEnsinoMedio;
import heranca_polimorfismo_exercicio.src.questao_06.Funcionario;

public class MainQuestao07 {

    public static void main(String[] args) {
        double custoTotal = 0;
        double custoEnsinoBasico = 0;
        double custoEnsinoMedio = 0;
        double custoUniversidade = 0;

        Funcionario[] funcionarios = criarFuncionario();

        for(Funcionario f: funcionarios) {
            double rendaTotal = f.rendaTotal();

            custoTotal += rendaTotal;

            if(f instanceof FuncionarioUniversidade) {
                custoUniversidade += rendaTotal;
                continue;
            }

            if (f instanceof FuncionarioEnsinoMedio) {
                custoEnsinoMedio += rendaTotal;
                continue;
            }

            if (f instanceof FuncionarioEnsinoBasico) {
                custoEnsinoBasico += rendaTotal;
            }
        }

        imprimirRelatorioDeCusto(
                custoTotal,
                custoEnsinoBasico,
                custoEnsinoMedio,
                custoUniversidade
        );
    }

    private static void imprimirRelatorioDeCusto(
            double custoTotal,
            double custoEnsinoBasico,
            double custoEnsinoMedio,
            double custoUniversidade
    ) {
        System.out.println("====== Relátorio de Custo da Empresa ======");
        System.out.printf("Custo de funcionários com ensino básico: %.2f%n", custoEnsinoBasico);
        System.out.printf("Custo de funcionários com ensino médio: %.2f%n", custoEnsinoMedio);
        System.out.printf("Custo de funcionários com graduação: %.2f%n", custoUniversidade);
        System.out.printf("Custo total: %.2f", custoTotal);
    }

    private static Funcionario[] criarFuncionario() {
        Funcionario[]  funcionarios = new Funcionario[10];

        for(int i = 0; i < funcionarios.length; i++) {
            int index = i + 1;
            if(i < 4) {
                funcionarios[i] = criarFuncionarioEnsinoBasico(
                        "Func. Básico " + index,
                        index,
                        "Escola Básica " + index
                );
                continue;
            }

            if(i < 8) {
                funcionarios[i] = criarFuncionarioEnsinoMedio(
                        "Func. Médio" + index,
                        index,
                        "Escola Básica " + index,
                        "Escola Médio " + index
                );
                continue;
            }

            funcionarios[i] = criarFuncionarioUniverdade(
                    "Func. Médio" + index,
                    index,
                    "Escola Básica " + index,
                    "Escola Médio " + index,
                    "Universidade " + index
            );
        }

        return funcionarios;
    }

    private static FuncionarioEnsinoBasico criarFuncionarioEnsinoBasico(
            String nome,
            int codigoFuncional,
            String ensinoBasico
    ) {
        return new FuncionarioEnsinoBasico(nome, codigoFuncional, ensinoBasico);
    }

    private static FuncionarioEnsinoMedio criarFuncionarioEnsinoMedio(
            String nome,
            int codigoFuncional,
            String ensinoBasico,
            String ensinoMedio
    ) {
        return new FuncionarioEnsinoMedio(nome, codigoFuncional, ensinoBasico, ensinoMedio);
    }
    private static FuncionarioUniversidade criarFuncionarioUniverdade(
            String nome,
            int codigoFuncional,
            String ensinoBasico,
            String ensinoMedio,
            String universidade
    ) {
        return new FuncionarioUniversidade(nome, codigoFuncional, ensinoBasico, ensinoMedio, universidade);
    }
}
