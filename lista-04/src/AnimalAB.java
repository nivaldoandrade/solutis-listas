abstract class AnimalAB implements AnimalIF {
    private String nome;
    private String tipo;
    private int idade;
    private String habit;
    private float altura;
    private float peso;

    public AnimalAB(String nome, String tipo, int idade, String habit, float altura, float peso) {
        this.nome = nome;
        this.tipo = tipo;
        this.idade = idade;
        this.habit = habit;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public int getIdade() {
        return idade;
    }

    public String getHabit() {
        return habit;
    }

    public float getAltura() {
        return altura;
    }

    public float getPeso() {
        return peso;
    }

    @Override
    public abstract void comer();

    @Override
    public abstract void moverse();

    @Override
    public abstract void dormir();
}
