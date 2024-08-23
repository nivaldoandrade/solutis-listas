package lista_04.src;
public class Pombo extends AnimalVoadorAB {
    private int qtdComidaIngerida;
    private int qtdCaminhoPercorrido;
    private int qtdHorasDormida;

    public Pombo(
            String nome,
            String tipo,
            int idade,
            String habit,
            float altura,
            float peso,
            int qtAssas,
            float envergaduraAssa
    ) {
        super(nome, tipo, idade, habit, altura, peso, qtAssas, envergaduraAssa);
        this.qtdComidaIngerida = 0;
        this.qtdCaminhoPercorrido = 0;
        this.qtdHorasDormida = 0;
    }

    @Override
    public void comer() {
        qtdComidaIngerida += 1;
        System.out.printf("O Pombo comeu a quantidade: %d%n", qtdComidaIngerida);
    }

    @Override
    public void moverse() {
        qtdCaminhoPercorrido += 10;
        System.out.printf("O Pombo percorreu a quantidade: %d%n", qtdCaminhoPercorrido);
    }

    @Override
    public void dormir() {
        qtdHorasDormida += 8;
        System.out.printf("O Pombo dormiu a quantidade: %d %n", qtdHorasDormida);
    }
}
