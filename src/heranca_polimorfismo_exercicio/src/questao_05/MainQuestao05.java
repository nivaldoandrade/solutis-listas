package heranca_polimorfismo_exercicio.src.questao_05;

import heranca_polimorfismo_exercicio.src.questao_05.utils.Prompts;

import java.util.Scanner;

public class MainQuestao05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String promptNome = "Digite o nome do funcionário: ";
        String nome = Prompts.promptNameInput(scanner, promptNome);

        String promptCodigoFuncional = "Digite o código funcional: ";
        int codigoFuncional = Prompts.promptInt(scanner, promptCodigoFuncional);

        int opcao = escolherOpcao(scanner);

        Funcionario funcionario = null;

        String ensinoBasico, ensinoMedio, universidade;

        switch (opcao) {
            case 1:
                funcionario = criarFuncionarioSemEstudo(nome, codigoFuncional);

                break;
            case 2:
                ensinoBasico = promptEnsinoBasico(scanner);

                funcionario = criarFuncionarioEnsinoBasico(nome, codigoFuncional, ensinoBasico);

                break;
            case 3:
                ensinoBasico = promptEnsinoBasico(scanner);
                ensinoMedio = promptEnsinoMedio(scanner);

                funcionario = criarFuncionarioEnsinoMedio(nome, codigoFuncional, ensinoBasico, ensinoMedio);

                break;
            case 4:
                ensinoBasico = promptEnsinoBasico(scanner);
                ensinoMedio = promptEnsinoMedio(scanner);
                universidade = promptUniversidade(scanner);

                funcionario = criarFuncionarioUniverdade(nome, codigoFuncional, ensinoBasico, ensinoMedio, universidade);
                break;
        }

        assert funcionario != null;
        imprimirFuncionario(funcionario);

        scanner.close();
    }

    private static int escolherOpcao(Scanner scanner) {
        System.out.println(
                "O funcionário não tem escolaridade? - Digite 1 \n" +
                        "O funcionário tem até o ensino básico? - Digite 2 \n" +
                        "O funcionário tem até ensino médio? - Digite 3 \n" +
                        "O Funcionário tem até graduação? - Digite 4."
        );
        while (true) {
            String promptOpcao = "Escolha a sua opção entre 1-4: ";
            int opcao = Prompts.promptInt(scanner, promptOpcao);

            if(opcao >= 1 && opcao <= 4) {
                return opcao;
            }

            System.out.print("Opção inválida! ");
        }
    }

    private static void imprimirFuncionario(Funcionario funcionario) {
        System.out.println();
        System.out.println("====== Informações do Funcionário ======");
        System.out.println(funcionario.toString());
    }

    private static String promptEnsinoBasico(Scanner scanner) {
        String promptEnsinoBasico = "Digite o nome da escola de ensino básico: ";
        String ensinoBasico = Prompts.promptNameInput(scanner, promptEnsinoBasico);

        return ensinoBasico;
    }

    private static String promptEnsinoMedio(Scanner scanner) {
        String promptEnsinoMedio = "Digite o nome da escola de ensino médio: ";
        String ensinoMedio = Prompts.promptNameInput(scanner, promptEnsinoMedio);

        return ensinoMedio;
    }

    private static String promptUniversidade(Scanner scanner) {
        String promptUniversidade = "Digite o nome da universidade: ";
        String universidade = Prompts.promptNameInput(scanner, promptUniversidade);

        return universidade;
    }

    private static FuncionarioEnsinoBasico criarFuncionarioEnsinoBasico(
            String nome,
            int codigoFuncional,
            String ensinoBasico
    ) {
        return new FuncionarioEnsinoBasico(nome, codigoFuncional, ensinoBasico);
    }


    private static FuncionarioSemEstudo criarFuncionarioSemEstudo(String nome, int codigoFuncional) {
        return new FuncionarioSemEstudo(nome, codigoFuncional);
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
