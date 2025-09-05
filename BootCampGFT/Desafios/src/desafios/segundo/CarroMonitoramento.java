package desafios.segundo;

import java.util.Scanner;

//Classe principal
public class CarroMonitoramento {

    public static void main(String[] args) {
        // Criando o scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Lendo os dados de entrada
        String modelo = scanner.nextLine();
        int anoFabricacao = scanner.nextInt();
        int anoAtual = scanner.nextInt();

        // Instanciação da classe carro
        Carro carro = new Carro(modelo, anoFabricacao, anoAtual);

        String aptidao;
        if(carro.verificarAptidao())
            aptidao = "Apto";
        else
            aptidao = "Nao apto";

        String resultado = String.format(carro.modelo + ": " + aptidao);

        // Exibindo o resultado
        System.out.println(resultado);

        scanner.close();
    }
    //Classe interna
    static class Carro{
        private final String modelo;
        private final int anoFabricacao;
        private final int anoAtual;
        private final static int LIMITE_ANOS_DE_USO = 10;

        public Carro(String modelo, int anoFabricacao, int anoAtual) {
            this.modelo = modelo;
            this.anoFabricacao = anoFabricacao;
            this.anoAtual = anoAtual;
        }

        public int calcularIdade(){
            return (this.anoAtual - this.anoFabricacao);
        }

        public boolean verificarAptidao(){
            int idade = calcularIdade();

            return idade <= LIMITE_ANOS_DE_USO;
        }
    }
}



/*

 */