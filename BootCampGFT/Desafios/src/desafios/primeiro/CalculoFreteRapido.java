package desafios.primeiro;

import java.util.Scanner;

public class CalculoFreteRapido {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Leia o peso em quilos:
        var peso = scanner.nextDouble();

        // TODO: Leia o valor do frete por quilo:
        var frete = scanner.nextDouble();

        // TODO: Calcule o valor total do frete:
        var total = frete * peso;

        // TODO: Exiba o valor formatado com duas casas decimais:
        System.out.printf("%.2f\n", total);

        scanner.close();
    }

}
