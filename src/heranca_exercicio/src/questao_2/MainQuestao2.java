package heranca_exercicio.src.questao_2;

public class MainQuestao2 {

    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor(
                "Jonh Doe",
                "Endereço do Jonh Doe",
                "11912345678",
                50,
                40.50
        );

        String nome = fornecedor.getNome();
        String endereco = fornecedor.getEndereco();
        String telefone = fornecedor.getTelefone();
        double valorCredito = fornecedor.getValorCredito();
        double valorDivida = fornecedor.getValorDivida();
        double saldo = fornecedor.obterSaldo();


        System.out.println("======== FORNECEDOR =========");
        System.out.printf("O nome do fornecedor: %s%n", nome);
        System.out.printf("O Endereço: %s%n", endereco);
        System.out.printf("O Telefone: %s%n", telefone);
        System.out.printf("O valor de crédito: %.2f%n", valorCredito);
        System.out.printf("O valor da divida: %.2f%n", valorDivida);
        System.out.printf("O valor do saldo: %.2f", saldo);
    }
}
