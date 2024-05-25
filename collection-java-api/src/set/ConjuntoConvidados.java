package set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidados> convidadosSet;

    public ConjuntoConvidados(){
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidados(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidados convidadoParaRemover = null;
        for (Convidados c : convidadosSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public void contarConvidados(){
        if (!convidadosSet.isEmpty()) {
            int totalConvidados = convidadosSet.size();
            System.out.println("Total convidados = " + totalConvidados);
        }else{
            System.out.println("Lista vazia!");
        }
    }

    /*
    public int contarConvidados(){
        return convidadosSet.size();
    }
    */ 

    public void exibirConvidados(){
        if (!convidadosSet.isEmpty()) {
            System.out.println(convidadosSet);
        }else{
            System.out.println("Lista vazia!");

        }
    }


    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Maria", 01);
        conjuntoConvidados.adicionarConvidado("Mario", 02);
        conjuntoConvidados.adicionarConvidado("Júlia", 03);
        conjuntoConvidados.adicionarConvidado("Clara", 04);
        conjuntoConvidados.adicionarConvidado("Cassio", 05);

        conjuntoConvidados.contarConvidados();
        conjuntoConvidados.exibirConvidados();
    }
}
