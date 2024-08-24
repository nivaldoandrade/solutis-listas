package heranca_polimorfismo_exercicio.src.questao_04.model;

import heranca_polimorfismo_exercicio.src.questao_01.Animal;
import heranca_polimorfismo_exercicio.src.questao_04.Corredor;

public class Cachorro extends Animal implements Corredor {

    public Cachorro() {
        super("", 0);
    }
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O Cachorro está emitindo som...");
    }

    @Override
    public void correr() {
        System.out.println("O Cachorro está correndo...");
    }
}
