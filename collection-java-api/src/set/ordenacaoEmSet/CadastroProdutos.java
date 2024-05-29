package set.ordenacaoEmSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;



public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos(){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(nome, quantidade, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtoPorNome = new TreeSet<>( produtoSet);
        return produtoPorNome;
        
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        if (!produtoSet.isEmpty()) {
          produtosPorPreco.addAll(produtoSet);
          return produtosPorPreco;
        } else {
          System.out.println("O conjunto está vazio!");
        }
        return produtosPorPreco;
      }
    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        // Adicionando produtos ao cadastro
        cadastroProdutos.adicionarProduto(1L, "Smartphone", 1000d, 10);
        cadastroProdutos.adicionarProduto(2L, "Notebook", 1500d, 5);
        cadastroProdutos.adicionarProduto(1L, "Mouse", 30d, 20);
        cadastroProdutos.adicionarProduto(4L, "Teclado", 50d, 15);
    
       System.out.println(cadastroProdutos.produtoSet);

       System.out.println("Exibindo produtos por ordem alfabetica: \n" +cadastroProdutos.exibirProdutosPorNome());
       System.out.println("Exibindo produtos por preço: \n" +cadastroProdutos.exibirProdutosPorPreco());
    }

}
