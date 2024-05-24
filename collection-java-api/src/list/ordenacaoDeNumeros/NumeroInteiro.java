package list.ordenacaoDeNumeros;

public class NumeroInteiro implements Comparable<NumeroInteiro> {
    private int valor;

    public NumeroInteiro(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }

    @Override
    public String toString() {
        return "Lista numeros inteiros{" + 
        "Valor: " + valor + "\n}";
    }

    @Override
    public int compareTo(NumeroInteiro n) {
        return Integer.compare(valor, n.getValor());
    }


}
