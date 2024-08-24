package heranca_polimorfismo_exercicio.src.questao_04.model;

import heranca_polimorfismo_exercicio.src.questao_01.Animal;

public class Tartaruga extends Animal {

    public Tartaruga() {
        super("", 0);
    }

    public Tartaruga(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A Tartaruga está emitindo som...");
    }

}
