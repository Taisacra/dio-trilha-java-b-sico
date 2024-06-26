package map.operacoesBasicasComMap;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> diconarioMap;

    public Dicionario(){
        this.diconarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        diconarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!diconarioMap.isEmpty()) {
            diconarioMap.remove(palavra);
        } else {
            System.out.println("Dicionário vazia!");
        }
    }

    public void exibirPalavras(){
        if (!diconarioMap.isEmpty()) {
            System.out.println(diconarioMap);
        } else {
            System.out.println("Dicionário vazia!");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicao = diconarioMap.get(palavra);
        if (definicao != null) {
          return definicao;
        }
        return "Linguagem não encontrada no dicionário.";
      }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

       // Adicionar palavras (linguagens de programação)
    dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
    dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
    dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

    // Exibir todas as palavras
    dicionario.exibirPalavras();

    // Pesquisar palavras
    String definicaoJava = dicionario.pesquisarPorPalavra("java");
    System.out.println("Definição da linguagem 'java': " + definicaoJava);

    String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
    System.out.println(definicaoCSharp);

    // Remover uma palavra
    dicionario.removerPalavra("typescript");
    dicionario.exibirPalavras();
    }

}
