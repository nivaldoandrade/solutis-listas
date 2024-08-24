package heranca_polimorfismo_exercicio.src.questao_04.model;

import heranca_polimorfismo_exercicio.src.questao_01.Animal;

public class Falcao extends Animal {

    public Falcao() {
        super("", 0);
    }

    public Falcao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O Falção está emitindo som...");
    }

}
