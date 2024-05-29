package set.ordenacaoEmSet;

import java.util.Comparator;

public class Produto implements Comparable <Produto>{
    private String nome;
    private int cod;
    private double preco;
    private int quantidade;

    public Produto(String nome, int cod, double preco,int quantidade){
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public int getCod(){
        return cod;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false; 
        return getCod() == produto.getCod();
    }

    @Override
    public String toString() {
        return "Produtos: {" + 
        "\nNome: " + nome +
        "\nCodigo: " + cod +
        "\nPreço: " + preco +
        "\nQuantidade " + quantidade + "\n}";
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }
}
class ComparatorPorPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto p1, Produto p2) {
      return Double.compare(p1.getPreco(), p2.getPreco());
    }
  }
