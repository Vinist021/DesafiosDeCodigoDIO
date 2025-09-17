package desafios.primeiro;

import java.util.Scanner;

public class EstruturaCondicionalIfElse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double nota = scanner.nextDouble();

        if (nota < 5) {
            System.out.println("Reprovado");
        }
        else if (nota <= 6.9) {
            System.out.println("Recuperacao");
        }
        else {
            System.out.println("Aprovado");
        }

        scanner.close();
    }

}
