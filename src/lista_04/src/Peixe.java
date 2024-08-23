package lista_04.src;
public class Peixe extends AnimalMarinhoAB{
    private int qtdComidaIngerida;
    private int qtdCaminhoPercorrido;
    private int qtdHorasDormida;

    public Peixe(
            String nome,
            String tipo,
            int idade,
            String habit,
            float altura,
            float peso,
            int qtdPatas
    ) {
        super(nome, tipo, idade, habit, altura, peso, qtdPatas);
        this.qtdComidaIngerida = 0;
        this.qtdCaminhoPercorrido = 0;
        this.qtdHorasDormida = 0;
    }

    @Override
    public void comer() {
        qtdComidaIngerida += 1;
        System.out.printf("O Peixe comeu a quantidade: %d%n", qtdComidaIngerida);
    }

    @Override
    public void moverse() {
        qtdCaminhoPercorrido += 10;
        System.out.printf("O Peixe percorreu a quantidade: %d%n", qtdCaminhoPercorrido);
    }

    @Override
    public void dormir() {
        qtdHorasDormida += 8;
        System.out.printf("O Peixe dormiu a quantidade: %d %n", qtdHorasDormida);
    }
}
