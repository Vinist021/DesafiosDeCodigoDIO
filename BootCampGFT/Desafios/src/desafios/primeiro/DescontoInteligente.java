package desafios.primeiro;

import java.util.Scanner;
import java.text.DecimalFormat;

public class DescontoInteligente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PORCENTAGEM_TOTAL = 100.00;

        // TODO: Leia o valor original do produto:
        var valorProduto = scanner.nextDouble();

        // TODO: Leia a porcentagem de desconto:
        var porcentagemDesconto = scanner.nextDouble();

        // TODO: Verifique se o desconto está dentro de um intervalo válido:
        if (porcentagemDesconto >= 0 && porcentagemDesconto <= 100){
            // TODO: Calcule o valor final do produto:
            var valorFinal = ((PORCENTAGEM_TOTAL - porcentagemDesconto) / 100) * valorProduto;
            // Formata e exibe o valor com duas casas decimais
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println(df.format(valorFinal));
            scanner.close();
        }
        // Caso o valor o desconto esteja fora do intervalo permitido
        else
            System.out.println("Desconto invalido");

    }

}
