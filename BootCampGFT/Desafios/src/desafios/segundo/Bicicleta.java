package desafios.segundo;

import java.util.Scanner;

// Classe principal
public class Bicicleta {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String modelo = scanner.nextLine();

        String nivelStr = scanner.nextLine();

        // Converte a string para inteiro
        int nivelBateria = Integer.parseInt(nivelStr);

        // Instanciação da classe BicicletaInfo
        BicicletaInfo bicicleta = new BicicletaInfo(modelo, nivelBateria);

        // Chama o método que retorna a mensagem formatada e exibe no console
        System.out.println(bicicleta.obterMensagem());

        // Fecha o scanner (boa prática para liberar o recurso)
        scanner.close();
    }

    //Classe interna
    static class BicicletaInfo {

        // Atributos privados da classe
        private final String modelo;
        private final int nivelBateria;

        // Construtor da classe
        public BicicletaInfo(String modelo, int nivelBateria) {
            this.modelo = modelo;
            this.nivelBateria = nivelBateria;
        }

        // Método para calculo da distância máxima
        public double calcularDistancia(){
            return nivelBateria * 0.5;
        }
        // Método para gerar a mensagem de saída formatada
        public String obterMensagem() {
            // Retorna a mensagem no formato solicitado, com uma casa decimal
            return String.format("%s: Distancia estimada = %.1f km", modelo, calcularDistancia());
        }
    }
}

