package desafios.terceiro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Classe principal
public class ECommerceAPI {

    public static void main(String[] args) {
        // Scanner para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Lendo a quantidade de produtos
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        String linha = scanner.nextLine();

        // Criada a lista para armazenar os produtos:
        List<Produto> produtos = getProdutos(linha);

        //Filtrando os produtos com mais de 50 unidades em estoque:
        List<Produto> produtosFiltrados = produtos.stream().filter(p -> p.quantidadeEmEstoque >= 50).toList();

        //Exibindo os nomes dos produtos com mais de 50 unidades em estoque:
        String resultado = produtosFiltrados.stream().map(p -> p.nome).collect(Collectors.joining(", "));

        System.out.println(resultado);

    }
    //Método para obter a lista de produtos
    private static List<Produto> getProdutos(String linha) {
        List<Produto> produtos = new ArrayList<>();

        // Divisão das linha por vírgula para obter os dados de cada produto
        String[] partes = linha.split(",\\s*");

        // loop para percorrer a lista de partes, processando as informações de cada produto:
        for (int i = 0; i < partes.length; i += 3) {
            String nome = partes[i].trim();
            double preco = Double.parseDouble(partes[i + 1].trim());
            int quantidadeEmEstoque = Integer.parseInt(partes[i + 2].trim());

            //Criando o objeto produto e adiconando na lista
            Produto produto = new Produto(nome, preco, quantidadeEmEstoque);
            produtos.add(produto);
        }
        return produtos;
    }

    //Classe interna
    static class Produto {
        String nome;
        double preco;
        int quantidadeEmEstoque;

        // Construtor da classe Produto
        public Produto(String nome, double preco, int quantidadeEmEstoque) {
            this.nome = nome;
            this.preco = preco;
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }
    }
}
