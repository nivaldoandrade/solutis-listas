package heranca_polimorfismo_exercicio.src.questao_04;

import heranca_polimorfismo_exercicio.src.questao_01.Animal;

public class Zoologico {
    private Animal[] jaulas = new Animal[10];

    public void addAnimalNaJaula(Animal animal, int jaula) {
        jaula -= 1;
        if(jaula >= 0 && jaula < 10) {
            if(jaulas[jaula] == null) {
                jaulas[jaula] = animal;
            } else {
                System.out.println("Jaula já está ocupada! ");
            }
        } else {
            System.out.println("Jaula inválida!");
        }
    }

    public void processarAnimaisNaJaulas() {
        int index = 1;
        for(Animal a: jaulas) {
            System.out.printf("====== Jaula %d ======%n", index++);
            if(a != null) {
                a.emitirSom();
                if(a instanceof Corredor) {
                    ((Corredor) a).correr();
                }
            }
        }
    }
}
