package desafios.primeiro;

import java.util.Scanner;

public class TrabalhandoComOperadores {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisaoInteira = a / b;
        int restoDivisao = a % b;

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisaoInteira);
        System.out.println(restoDivisao);

        scanner.close();
    }
}
