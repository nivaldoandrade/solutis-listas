package heranca_exercicio.src.questao_4;

public class MainQuestao4 {
    public static void main(String[] args) {
        Administrador administrador =  new Administrador(
                "Jonh Doe",
                "Rua Felix Nascimento",
                "11912345678",
                1,
                2500,
                0.27,
                1000
        );

        String nome = administrador.getNome();
        String endereco = administrador.getEndereco();
        String telefone = administrador.getTelefone();
        int codigoSetor = administrador.getCodigoSetor();
        double salarioBase = administrador.getSalarioBase();
        double imposto = administrador.getImposto();
        double ajudaDeCusto = administrador.getAjudaDeCusto();
        double salarioLiquido = administrador.calcularSalario();


        System.out.println("======== ADMINISTRADOR =========");
        System.out.printf("O nome do adminstrador: %s%n", nome);
        System.out.printf("O Endereço: %s%n", endereco);
        System.out.printf("O Telefone: %s%n", telefone);
        System.out.printf("O Código do Setor: %d%n", codigoSetor);
        System.out.printf("O salário base: %.2f%n", salarioBase);
        System.out.printf("O imposto em porcetagem: %.2f%%%n", imposto * 100);
        System.out.printf("A ajuda de custo: %.2f%n", ajudaDeCusto);
        System.out.printf("O salário líquido: %.2f", salarioLiquido);
    }
}
