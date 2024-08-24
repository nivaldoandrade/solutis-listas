package heranca_polimorfismo_exercicio.src.questao_04.model;

import heranca_polimorfismo_exercicio.src.questao_01.Animal;
import heranca_polimorfismo_exercicio.src.questao_04.Corredor;

public class Girafa extends Animal implements Corredor {
    public Girafa() {
        super("", 0);
    }

    public Girafa(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A Girafa está emitindo som...");
    }

    @Override
    public void correr() {
        System.out.println("O Girafa está correndo...");
    }
}
