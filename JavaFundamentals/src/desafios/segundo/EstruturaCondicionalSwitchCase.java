package desafios.segundo;

import java.util.Scanner;

public class EstruturaCondicionalSwitchCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dia = scanner.nextInt();

        switch(dia) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda-feira");
            case 3 -> System.out.println("Terca-feira");
            case 4 -> System.out.println("Quarta-feira");
            case 6 -> System.out.println("Quinta-feira");
            case 7 -> System.out.println("Sabado");
            default -> System.out.println("Dia invalido");
        }

        scanner.close();
    }

}
