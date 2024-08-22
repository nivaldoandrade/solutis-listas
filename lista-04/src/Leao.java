public class Leao extends AnimalTerrestreAB {
    private int qtdComidaIngerida;
    private int qtdCaminhoPercorrido;
    private int qtdHorasDormida;

    public Leao(
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
        System.out.printf("O Leão comeu a quantidade: %d%n", qtdComidaIngerida);
    }

    @Override
    public void moverse() {
        qtdCaminhoPercorrido += 10;
        System.out.printf("O Leão percorreu a quantidade: %d%n", qtdCaminhoPercorrido);
    }

    @Override
    public void dormir() {
        qtdHorasDormida += 8;
        System.out.printf("O Leão dormiu a quantidade: %d %n", qtdHorasDormida);
    }
}
