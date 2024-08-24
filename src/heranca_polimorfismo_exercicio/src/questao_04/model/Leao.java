package heranca_polimorfismo_exercicio.src.questao_04.model;

import heranca_polimorfismo_exercicio.src.questao_01.Animal;
import heranca_polimorfismo_exercicio.src.questao_04.Corredor;

public class Leao extends Animal implements Corredor {

    public Leao() {
        super("", 0);
    }

    public Leao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O Leão está emitindo som...");
    }

    @Override
    public void correr() {
        System.out.println("O Leão está correndo...");
    }
}
