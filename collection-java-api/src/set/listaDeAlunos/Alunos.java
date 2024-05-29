package set.listaDeAlunos;

import java.util.Comparator;

public class Alunos implements Comparable <Alunos> {
    private String nome;
    private long matricula;
    private double nota;

    public Alunos(String nome, long matricula, double nota){
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome(){
        return nome;
    }
    public long getMatricula(){
        return matricula;
    }
    public double getNota(){
        return nota;
    }

    @Override
    public String toString() {
        return "Lista Alunos {" +
        "\nNome:" + nome +
        "\nMatricula: " + matricula +
        "\nNota: " + nota + "\n}";
    }

    @Override
    public int compareTo(Alunos a) {
        return nome.compareToIgnoreCase(a.getNome());
    }

}

class CompararPorNota implements Comparator<Alunos>{
    public int compare(Alunos a1, Alunos a2){
        return Double.compare(a1.getNota(), a2.getNota());
    }
}
