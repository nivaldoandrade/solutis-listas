package heranca_polimorfismo_exercicio.src.questao_04;

import heranca_polimorfismo_exercicio.src.questao_01.Animal;
import heranca_polimorfismo_exercicio.src.questao_04.model.*;

import java.util.List;

public class MainQuestao04 {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico();

        List<Animal> animals = List.of(
                new Cachorro(),
                new Cavalo(),
                new Preguica(),
                new Coelho(),
                new Falcao(),
                new Gato(),
                new Girafa(),
                new Guepardo(),
                new Leao(),
                new Tartaruga()
        );

        int index = 0;
        for(Animal a: animals) {
            zoologico.addAnimalNaJaula(a, ++index);
        }

        zoologico.processarAnimaisNaJaulas();
    }
}
