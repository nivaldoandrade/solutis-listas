package heranca_polimorfismo_exercicio.src.questao_05.utils;

import java.util.Scanner;

public final class Prompts {
    public static int promptInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                scanner.nextLine();

                if(value > 0) {
                    return value;
                }

                System.out.print("Valor ter que ser maior do que zero! ");
            } else {
                System.out.print("Valor inválido! ");
                scanner.next();
            }
        }
    }

    public static String promptNameInput(Scanner scanner, String prompt) {
        String name;

        while(true) {
            System.out.print(prompt);
            name = scanner.nextLine();

            if(!name.isEmpty()) {
                return name.trim();
            }

            System.out.print("Nome não pode ser vazio! ");
        }
    }
}
