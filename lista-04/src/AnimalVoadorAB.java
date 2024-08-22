abstract class AnimalVoadorAB extends AnimalAB {
    private int qtAssas;

    private float envergaduraAssa;

    public AnimalVoadorAB(
            String nome,
            String tipo,
            int idade,
            String habit,
            float altura,
            float peso,
            int qtAssas,
            float envergaduraAssa
    ) {
        super(nome, tipo, idade, habit, altura, peso);
        this.qtAssas = qtAssas;
        this.envergaduraAssa = envergaduraAssa;
    }

    public int getQtAssas() {
        return qtAssas;
    }

    public float getEnvergaduraAssa() {
        return envergaduraAssa;
    }

    @Override
    public abstract void comer();

    @Override
    public abstract void moverse();

    @Override
    public abstract void dormir();

    public void voar() {
        System.out.print("O animal está voando!");
    }
}
