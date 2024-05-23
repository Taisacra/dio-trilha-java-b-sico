package list.carrinhDeCompras;

public class Item {
    String nome;
    double preco;
    int qunatidade;

    public Item(String nome, double preco, int qunatidade){
        this.nome = nome;
        this.preco = preco;
        this.qunatidade = qunatidade;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQunatidade(){
        return qunatidade;
    }

    @Override
    public String toString() {
        return "Item{" +
        "nome=" + nome + "\n" +
        "preço=" + preco + "\n" +
        "quantidade=" + qunatidade + "}\n";
    }
}
