package heranca_polimorfismo_exercicio.src.questao_04.model;

import heranca_polimorfismo_exercicio.src.questao_01.Animal;
import heranca_polimorfismo_exercicio.src.questao_04.Corredor;

public class Guepardo extends Animal implements Corredor {

    public Guepardo() {
        super("", 0);
    }

    public Guepardo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O Guepardo está emitindo som...");
    }

    @Override
    public void correr() {
        System.out.println("O Guepardo está correndo...");
    }
}
