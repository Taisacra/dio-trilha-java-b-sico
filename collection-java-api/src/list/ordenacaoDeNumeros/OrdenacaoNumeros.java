package list.ordenacaoDeNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    List <Integer> ordenacaoNumList;

    public OrdenacaoNumeros(){
        this.ordenacaoNumList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.ordenacaoNumList.add(numero);
      }

    public List<Integer> ordenarAscendente(){
        List<Integer> numeroAscendente = new ArrayList<>(this.ordenacaoNumList);
        if (!ordenacaoNumList.isEmpty()) {
            Collections.sort(numeroAscendente);   
            return numeroAscendente; 
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
        
        
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numeroAscendente = new ArrayList<>(this.ordenacaoNumList);
        if (!ordenacaoNumList.isEmpty()) {
            numeroAscendente.sort(Collections.reverseOrder());
            return numeroAscendente; 
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
        
        
    }

    public void exibirNumero(){
        if (!ordenacaoNumList.isEmpty()) {
            System.out.println(this.ordenacaoNumList);
        }else{
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(8);
        ordenacaoNumeros.adicionarNumero(42);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(17);

        ordenacaoNumeros.exibirNumero();
        System.out.println("Ordenado Ascendente: "+ordenacaoNumeros.ordenarAscendente());
        
        System.out.println("Ordenado Descendente: "+ordenacaoNumeros.ordenarDescendente());
        


        }
}
