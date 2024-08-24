package heranca_polimorfismo_exercicio.src.questao_08;

public class Gerente extends Comissao{
    private static final double ADICIONAL_GERENTE = 1500;

    public Gerente() {
        super(ADICIONAL_GERENTE);
    }
}
