package list.carrinhDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int qunatidade){
        /* Item item = new Item(nome, preco, qunatidade);
        this.itemList.add(item); */
        itemList.add(new Item(nome, preco, qunatidade));
    }

    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itemParaRemover.add(i);
                }
            }
            itemList.removeAll(itemParaRemover);
        } else {
            System.out.println("A lista est;a vazia!");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQunatidade();
                valorTotal = valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirItens(){
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
        "ïtens=" + itemList + "}";
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Lápis" , 2, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 50.2, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 22.3, 2);

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItem("Lápis");
        System.out.println("\n\nItens atual:");
        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }

}
