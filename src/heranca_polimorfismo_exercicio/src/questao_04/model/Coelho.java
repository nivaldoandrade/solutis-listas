package heranca_polimorfismo_exercicio.src.questao_04.model;

import heranca_polimorfismo_exercicio.src.questao_01.Animal;
import heranca_polimorfismo_exercicio.src.questao_04.Corredor;

public class Coelho extends Animal implements Corredor {

    public Coelho() {
        super("", 0);
    }

    public Coelho(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O Coelho está emitindo som...");
    }

    @Override
    public void correr() {
        System.out.println("O Coelho está correndo...");
    }
}
