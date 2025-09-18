package desafios.segundo;

import java.util.Scanner;

public class WhileEDoWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        int num = scanner.nextInt();
        while(num >= 0) {
            soma += num;
            num = scanner.nextInt();
        }

        System.out.println(soma);

        scanner.close();
    }
}
