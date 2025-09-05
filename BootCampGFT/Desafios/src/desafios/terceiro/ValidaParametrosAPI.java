package desafios.terceiro;

import java.util.Scanner;

public class ValidaParametrosAPI {

    public static final int QUANTIDADE_PARAMETROS = 2;

    public static void main(String[] args) {
        // Inicializa o Scanner para ler a entrada
        Scanner scanner = new Scanner(System.in);

        // Solicita a entrada da URL
        String url = scanner.nextLine();

        // Chama o método para validar a URL
        String resultado = validarParametros(url);

        // Exibe o resultado
        System.out.println(resultado);

        // Fecha o scanner
        scanner.close();
    }

    // Método para validar os parametros da URL
    public static String validarParametros(String url) {
        // Valida se a URL começa com '?'
        if (!url.startsWith("?")) {
            return "Parametros invalidos";
        }

        // Remove o '?' da URL para analisar os parametros
        url = url.substring(1);

        // Divide a URL pelos '&' para obter cada parametro
        String[] parametros = url.split("&");

        //Loop que passa por todos os parametros (Chave=Valor)
        for (int i = 0; i < QUANTIDADE_PARAMETROS; i++) {
            //Verifica se há mais de um "="
            if(parametros[i].split("=").length > QUANTIDADE_PARAMETROS)
                return "Parametros invalidos";

            // Valida o valor do parametro (alfanumerico ou numero, ou valores como e-mail)
            // Permite caracteres especiais como @ e . para casos como email
            if(     !parametros[i].split("=")[1].matches("[a-zA-Z0-9@.]+") &&
                    !parametros[i].split("=")[1].matches("\\d+")) {
                return "Parametros invalidos";
            }
        }

        // Se passar em todas as validacoes, os parametros sao validos
        return "Parametros validos";
    }
}

