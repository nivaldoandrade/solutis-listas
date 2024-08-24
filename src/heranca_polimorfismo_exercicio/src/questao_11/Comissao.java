package heranca_polimorfismo_exercicio.src.questao_11;

public abstract class Comissao {
    private double adicional;

    public Comissao(double adicional) {
        this.adicional = adicional;
    }

    public double getAdicional() {
        return adicional;
    }
}
