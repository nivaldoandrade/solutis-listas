package lista_04.src;
abstract class AnimalTerrestreAB extends AnimalAB {

    private int qtdPatas;

    public AnimalTerrestreAB(
            String nome,
            String tipo,
            int idade,
            String habit,
            float altura,
            float peso,
            int qtdPatas
    ) {
        super(nome, tipo, idade, habit, altura, peso);
        this.qtdPatas = qtdPatas;
    }

    public int getQtdPatas() {
        return qtdPatas;
    }

    @Override
    public abstract void comer();

    @Override
    public abstract void moverse();

    @Override
    public abstract void dormir();

    public void andar() {
        System.out.println("O animal está andando!");
    }
}
