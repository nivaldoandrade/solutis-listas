package heranca_polimorfismo_exercicio.src.questao_02;

import heranca_polimorfismo_exercicio.src.questao_01.Animal;
import heranca_polimorfismo_exercicio.src.questao_01.Cachorro;
import heranca_polimorfismo_exercicio.src.questao_01.Cavalo;
import heranca_polimorfismo_exercicio.src.questao_01.Preguica;

import java.util.List;

public class MainQuestao02 {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Zezé", 5);
        Animal cavalo = new Cavalo("Dedé", 9);
        Animal preguica = new Preguica("Nené", 150);

        emitirSomAnimal(cachorro);
        emitirSomAnimal(cavalo);
        emitirSomAnimal(preguica);
    }

    private static void emitirSomAnimal(Animal animal) {
        animal.emitirSom();
    }
}
