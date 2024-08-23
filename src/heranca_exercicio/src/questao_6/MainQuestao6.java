package heranca_exercicio.src.questao_6;

public class MainQuestao6 {

    public static void main(String[] args) {
        Vendedor vendedor =  new Vendedor(
                "Jonh Doe",
                "Rua Felix Nascimento",
                "11912345678",
                1,
                2500,
                0.27,
                5000,
                0.50
        );

        String nome = vendedor.getNome();
        String endereco = vendedor.getEndereco();
        String telefone = vendedor.getTelefone();
        int codigoSetor = vendedor.getCodigoSetor();
        double salarioBase = vendedor.getSalarioBase();
        double imposto = vendedor.getImposto();
        double valorVendas = vendedor.getValorVendas();
        double comissao = vendedor.getComissao();
        double salarioLiquido = vendedor.calcularSalario();

        System.out.println("======== VENDEDOR =========");
        System.out.printf("O nome do vendedor: %s%n", nome);
        System.out.printf("O Endereço: %s%n", endereco);
        System.out.printf("O Telefone: %s%n", telefone);
        System.out.printf("O Código do Setor: %d%n", codigoSetor);
        System.out.printf("O salário base: %.2f%n", salarioBase);
        System.out.printf("O imposto em porcetagem: %.2f%%%n", imposto * 100);
        System.out.printf("O valor de vendas: %.2f%n", valorVendas);
        System.out.printf("A comissão: %.2f%n", comissao);
        System.out.printf("O salário líquido: %.2f", salarioLiquido);
    }
}
