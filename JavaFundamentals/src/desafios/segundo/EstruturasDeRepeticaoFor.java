package desafios.segundo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EstruturasDeRepeticaoFor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Integer> numeros = new ArrayList<>();
        numeros.add(0);
        numeros.add(1);

        for (int i = 1; i < n - 1; i++) {
            numeros.add(numeros.get(i) + numeros.get(i-1));
        }

        String resultado = numeros.stream()
                           .map(String::valueOf)
                           .collect(Collectors.joining(" "));

        System.out.println(resultado);

        scanner.close();
    }

}
