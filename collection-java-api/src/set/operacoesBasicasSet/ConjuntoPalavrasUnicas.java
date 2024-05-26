package set.operacoesBasicasSet;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas(){
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(new String(palavra));
    }

    public void removerPalavra(String palavra){
        if (!palavrasUnicasSet.isEmpty()) {
            if (palavrasUnicasSet.contains(palavra)) {
                palavrasUnicasSet.remove(palavra);
            }else{
                System.out.println("Palavra não encontrada no conjunto!");
            }
        }else{
            System.out.println("O conjunto está vazio");
        }
    }

    public void verificarPalavra(String palavra){
        if (!palavrasUnicasSet.isEmpty()) {
            if (palavrasUnicasSet.contains(palavra)) {
                System.out.println(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto.");
            }
        } else {
            System.out.println("Conjunto vazio!");
        }
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavrasUnicasSet);
    }
    

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("Mamão");
        conjuntoPalavrasUnicas.adicionarPalavra("Melancia");
        conjuntoPalavrasUnicas.adicionarPalavra("Abacate");
        conjuntoPalavrasUnicas.adicionarPalavra("Avião");
        conjuntoPalavrasUnicas.adicionarPalavra("Passarinho");
        conjuntoPalavrasUnicas.adicionarPalavra("leão");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.removerPalavra("Avião");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        conjuntoPalavrasUnicas.verificarPalavra("Melancia");
        

    }
}
