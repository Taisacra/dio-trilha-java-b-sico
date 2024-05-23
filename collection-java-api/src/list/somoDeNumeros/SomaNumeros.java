package list.somoDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<NumerosInteiros> numInteiroList;

    public SomaNumeros(){
        this.numInteiroList = new ArrayList<>();
    }

    public void  adicionarNumero(int numero){
        numInteiroList.add(new NumerosInteiros(numero));
    }

     public int calcularSoma(){
        int soma = 0;
        if (!numInteiroList.isEmpty()) {
            for (NumerosInteiros n : numInteiroList) {
                soma += n.getNumero();
            }
        }
         return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        if(!numInteiroList.isEmpty()){
            for (NumerosInteiros n : numInteiroList) {
                if (n.getNumero()> maiorNumero) 
                    maiorNumero = n.getNumero();
            }
        }
        return maiorNumero;
    } 

    public int encontrarMenorNumero(){
        int menorNumero = numInteiroList.get(0).getNumero();
        if(!numInteiroList.isEmpty()){
            for (NumerosInteiros n : numInteiroList) {
                if (n.getNumero() < menorNumero) {
                menorNumero = n.getNumero();
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        if(!numInteiroList.isEmpty()){
            System.out.println( this.numInteiroList);
        }else{
            System.out.println("A lista está vazia!");
        }
    }


    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(6);

        System.out.println("Soma dos números da lista: "+somaNumeros.calcularSoma());
        System.out.println("Maior número da lista: "+ somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número da lista: "+ somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();
    }
   
}
