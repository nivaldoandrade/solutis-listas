package heranca_polimorfismo_exercicio.src.questao_04.model;

import heranca_polimorfismo_exercicio.src.questao_01.Animal;
import heranca_polimorfismo_exercicio.src.questao_04.Corredor;

public class Gato extends Animal implements Corredor {

    public Gato() {
        super("", 0);
    }

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O Gato está emitindo som...");
    }

    @Override
    public void correr() {
        System.out.println("O Gato está correndo...");
    }
}
