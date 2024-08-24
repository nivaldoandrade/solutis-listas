package heranca_polimorfismo_exercicio.src.questao_11;

public class MainQuestao11 {

    public static void main(String[] args) {
        Funcionario[] funcionarios = criarFuncionario();
        int index = 0;

        for(Funcionario f: funcionarios) {
            System.out.printf("========= Funcionário %d =========%n", ++index);
            System.out.println(f.toString());
            System.out.println();
        }
    }

    private static Funcionario[] criarFuncionario() {
        Funcionario[]  funcionarios = new Funcionario[10];

        for(int i = 0; i < funcionarios.length; i++) {
            int index = i + 1;
            if(i < 4) {
                funcionarios[i] = criarFuncionarioEnsinoBasico(
                        "Func. Básico " + index,
                        index,
                        "Escola Básica " + index,
                        new Gerente()
                );
                continue;
            }

            if(i < 8) {
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
