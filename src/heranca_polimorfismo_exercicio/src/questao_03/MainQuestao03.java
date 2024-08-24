package heranca_polimorfismo_exercicio.src.questao_03;

import heranca_polimorfismo_exercicio.src.questao_01.Cachorro;
import heranca_polimorfismo_exercicio.src.questao_01.Cavalo;
import heranca_polimorfismo_exercicio.src.questao_01.Preguica;

public class MainQuestao03 {
    public static void main(String[] args) {
        Veterinario veterinario = new Veterinario();

        Cachorro cachorro = new Cachorro("Zezé", 5);
        Cavalo cavalo = new Cavalo("Dedé", 9);
        Preguica preguica = new Preguica("Nené", 150);

        System.out.println("====== O veterinario está examinando os animais ======");
        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);
    }
}
