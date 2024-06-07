package map.pesquisaEmMap.estoqueProdutosComPreco;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Integer, Produto> produtoMap;

    public EstoqueProdutos(){
        this.produtoMap = new HashMap<>();
    }

    public void adicionarProduto(int cod, String nome, int quantidade, double preco){
        produtoMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        if (!produtoMap.isEmpty()) {
            System.out.println(produtoMap);
        }
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if (!produtoMap.isEmpty()) {
            for (Produto p : produtoMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        } else {
            System.out.println("Estoque de produtos vazio!");
        }
        return valorTotalEstoque;
    }

    public double obterProdutoMaisCaro(){
        double produtoMaisCaro = 0d;
        if (!produtoMap.isEmpty()) {
            for (Produto p : produtoMap.values()) {
                if (p.getPreco() > produtoMaisCaro) {
                    produtoMaisCaro = p.getPreco();
                }
            }
        }else{
            System.out.println("Estoque de produtos vazio!");
        }
        return produtoMaisCaro;
    }

    public double obterProdutoMaisBarato(){
        double produtoMaisBarato = 0d;
        if (!produtoMap.isEmpty()) {
            for (Produto p : produtoMap.values()) {
                produtoMaisBarato = p.getPreco();
                if (p.getPreco()< produtoMaisBarato) {
                    produtoMaisBarato = p.getPreco();
                }
            }
        }else{
            System.out.println("Estoque de produtos vazio!");
        }
        return produtoMaisBarato;
    }


    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQtdvalorTotalEstoque = null;
        double maiorQtdvalorTotalEstoque = 0d;
        if (!produtoMap.isEmpty()) {
            for (Map.Entry<Integer, Produto> entry: produtoMap.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorQtdvalorTotalEstoque) {
                    maiorQtdvalorTotalEstoque = valorProdutoEmEstoque;
                    produtoMaiorQtdvalorTotalEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQtdvalorTotalEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

       // Exibe o estoque vazio
        estoque.exibirProdutos();

        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4, "Teclado", 2, 40.0);

        // Exibe os produtos no estoque
        estoque.exibirProdutos();

        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

        // Obtém e exibe o produto mais caro
        double produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);

        // Obtém e exibe o produto mais barato
        double produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);

        // Obtém e exibe o produto de maior quantidade de valor total no estoque
        Produto produtoMaiorQtdvalorTotalEstoque = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("O produto de maior quantidade de valor total no estoque: " + produtoMaiorQtdvalorTotalEstoque);

    }

}
