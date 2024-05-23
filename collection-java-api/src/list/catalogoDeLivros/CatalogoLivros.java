package list.catalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros(){
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    } 

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livroPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livroPorAutor.add(l);
                }
            }
        }
        return livroPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livroPorIntervaloAnos = new ArrayList<>();
        if(!livrosList.isEmpty()){
            for(Livro l : livrosList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livroPorIntervaloAnos.add(l);
                }
            }
        }
        return livroPorIntervaloAnos;
    }


    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livrosList.isEmpty()){
            for(Livro l: livrosList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo =l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }



    public static void main(String[] args){
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro1","Autor1", 2020);
        catalogoLivros.adicionarLivro("Livro1","Autor1", 2021);
        catalogoLivros.adicionarLivro("Livro2","Autor2", 2022);
        catalogoLivros.adicionarLivro("Livro3","Autor3", 2023);
        catalogoLivros.adicionarLivro("Livro4","Autor4", 2024);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor2"));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro1"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));


    }
}
