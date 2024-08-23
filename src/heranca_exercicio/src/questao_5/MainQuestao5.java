package heranca_exercicio.src.questao_5;

public class MainQuestao5 {

    public static void main(String[] args) {
        Operario operario =  new Operario(
                "Jonh Doe",
                "Rua Felix Nascimento",
                "11912345678",
                1,
                2500,
                0.27,
                1000,
                0.10
        );

        String nome = operario.getNome();
        String endereco = operario.getEndereco();
        String telefone = operario.getTelefone();
        int codigoSetor = operario.getCodigoSetor();
        double salarioBase = operario.getSalarioBase();
        double imposto = operario.getImposto();
        double valorProducao = operario.getValorProducao();
        double comissao = operario.getComissao();
        double salarioLiquido = operario.calcularSalario();


        System.out.println("======== OPERÁRIO =========");
        System.out.printf("O nome do operário: %s%n", nome);
        System.out.printf("O Endereço: %s%n", endereco);
        System.out.printf("O Telefone: %s%n", telefone);
        System.out.printf("O Código do Setor: %d%n", codigoSetor);
        System.out.printf("O salário base: %.2f%n", salarioBase);
        System.out.printf("O imposto em porcetagem: %.2f%%%n", imposto * 100);
        System.out.printf("O valor de produção: %.2f%n", valorProducao);
        System.out.printf("A comissão: %.2f%n", comissao);
        System.out.printf("O salário líquido: %.2f", salarioLiquido);
    }
}
