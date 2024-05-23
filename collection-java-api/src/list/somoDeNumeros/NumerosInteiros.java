package list.somoDeNumeros;

public class NumerosInteiros {
    int numero;

    public NumerosInteiros(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return numero;
    }

    @Override
    public String toString() {
        return "Lista numero{ " + numero + "\n}"; 
    }
}