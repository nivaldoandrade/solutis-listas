package heranca_polimorfismo_exercicio.src.questao_08;

public class MainQuestao08 {

    public static void main(String[] args) {
        Comissao gerente = new Gerente();
        Comissao supervisor = new SuperVisor();
        Comissao vendedor = new Vendedor();

        System.out.printf("A comissão do gerente é %.2f%n", gerente.getAdicional());
        System.out.printf("A comissão do supervisor é %.2f%n", supervisor.getAdicional());
        System.out.printf("A comissão do vendedor é %.2f%n", vendedor.getAdicional());
    }
}
