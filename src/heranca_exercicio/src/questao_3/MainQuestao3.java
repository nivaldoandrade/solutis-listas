package heranca_exercicio.src.questao_3;

public class MainQuestao3 {

    public static void main(String[] args) {
        Empregado empregado =  new Empregado(
                "Jonh Doe",
                "Rua Felix Nascimento",
                "11912345678",
                1,
                2500,
                0.27
        );

        String nome = empregado.getNome();
        String endereco = empregado.getEndereco();
        String telefone = empregado.getTelefone();
        int codigoSetor = empregado.getCodigoSetor();
        double salarioBase = empregado.getSalarioBase();
        double imposto = empregado.getImposto();
        double salarioLiquido = empregado.calcularSalario();

        System.out.println("======== COLABORADOR =========");
        System.out.printf("O nome do colaborador: %s%n", nome);
        System.out.printf("O Endereço: %s%n", endereco);
        System.out.printf("O Telefone: %s%n", telefone);
        System.out.printf("O Código do Setor: %d%n", codigoSetor);
        System.out.printf("O salário base: %.2f%n", salarioBase);
        System.out.printf("O imposto em porcetagem: %.2f%%%n", imposto * 100);
        System.out.printf("O salário líquido: %.2f", salarioLiquido);

    }

}
