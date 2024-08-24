package heranca_polimorfismo_exercicio.src.questao_01;

public class Preguica extends Animal {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A Preguica está emitindo som...");
    }

    public void subirArvore() {
        System.out.println("A Preguiça está subindo na árvore...");
    }


}
