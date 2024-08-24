package heranca_polimorfismo_exercicio.src.questao_01;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O Cachorro está emitindo som...");
    }

    public void correr() {
        System.out.println("O Cachorro está correndo...");
    }
}
