package heranca_polimorfismo_exercicio.src.questao_01;

public abstract class Animal {
    private final String nome;
    private final int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }


    public int getIdade() {
        return idade;
    }


    public abstract void emitirSom();
}
