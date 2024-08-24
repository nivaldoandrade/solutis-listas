package heranca_polimorfismo_exercicio.src.questao_04.model;

import heranca_polimorfismo_exercicio.src.questao_01.Animal;
import heranca_polimorfismo_exercicio.src.questao_04.Corredor;

public class Cavalo extends Animal implements Corredor {

    public Cavalo() {
        super("", 0);
    }

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O Cavalo está emitindo som...");
    }

    @Override
    public void correr() {
        System.out.println("O Cavalo está correndo...");
    }
}
