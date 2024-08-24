package heranca_polimorfismo_exercicio.src.questao_11;

public class SuperVisor extends Comissao {
    private static final double ADICIONAL_SUPERVISOR = 600;

    public SuperVisor() {
        super(ADICIONAL_SUPERVISOR);
    }
}
