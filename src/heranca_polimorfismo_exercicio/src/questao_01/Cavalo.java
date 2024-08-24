package heranca_polimorfismo_exercicio.src.questao_01;

public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O Cavalo está emitindo som...");
    }

    public void correr() {
        System.out.println("O Cavalo está correndo...");
    }
}
