package heranca_polimorfismo_exercicio.src.questao_06;

public class MainQuestao06 {
    public static void main(String[] args) {
        Funcionario semEstudo = new FuncionarioSemEstudo("Jonh Doe", 777);

        Funcionario ensinoBasico = new FuncionarioEnsinoBasico(
                "Jonh Doe",
                777,
                "Basica"
        );

        Funcionario ensinoMedio =  new FuncionarioEnsinoMedio(
                "Jonh Doe",
                777,
                "Basica",
                "Medio"
        );


        Funcionario universidade = new FuncionarioUniversidade(
                "Jonh Doe",
                777,
                "Basica",
                "Medio",
                "U"
        );

        System.out.println();
        System.out.println("====== Funcionário Sem Estudo ======");
        System.out.println("A renda básica é de " + semEstudo.rendaTotal());

        System.out.println();
        System.out.println("====== Funcionário Ensino Básico ======");
        System.out.println("A renda básica é de " + ensinoBasico.rendaTotal());

        System.out.println();
        System.out.println("====== Funcionário Ensino Médio ======");
        System.out.println("A renda básica é de " + ensinoMedio.rendaTotal());

        System.out.println();
        System.out.println("====== Funcionário Graduado ======");
        System.out.println("A renda básica é de " + universidade.rendaTotal());
    }
}
