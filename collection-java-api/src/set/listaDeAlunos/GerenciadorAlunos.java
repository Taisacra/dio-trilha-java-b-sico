package set.listaDeAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Alunos> alunosSet;

    public GerenciadorAlunos(){
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, int matricula, double nota){
        alunosSet.add(new Alunos(nome, matricula, nota));
    }

    public void removerAluno(long matricula){
        Alunos alunoParaRemover = null;
        if (!alunosSet.isEmpty()) {
            for (Alunos a : alunosSet) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover=a;
                    break;
                }
            }
            alunosSet.remove(alunoParaRemover);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
        if (alunoParaRemover == null) {
            System.out.println("Matricula não encontrada!");
        }
    }


    public Set<Alunos> exibirAlunosPorNome(){
        Set<Alunos> exibirAlunosPorNome = new TreeSet<>(alunosSet);
        return exibirAlunosPorNome;
    }

    public Set<Alunos> exibirAlunosPorNota(){
        Set<Alunos> exibirAlunosPorNota = new TreeSet<>(new CompararPorNota());
        if (!alunosSet.isEmpty()) {
            exibirAlunosPorNota.addAll(alunosSet);
            return exibirAlunosPorNota;
        } else {
            System.out.println("O conjunto está vazio!");
        }
        return exibirAlunosPorNota;
    }

    public void exibirAlunos(){
        if (!alunosSet.isEmpty()) {
           System.out.println(alunosSet);
        }else{
            System.out.println("Lista vazia!");
        }
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos =new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("Taina", 111111, 5.8);
        gerenciadorAlunos.adicionarAluno("Maria", 222222, 9.6);
        gerenciadorAlunos.adicionarAluno("Perola", 333333, 8.0);
        gerenciadorAlunos.adicionarAluno("Jose", 444444, 7.8);

        gerenciadorAlunos.exibirAlunos();
        System.out.println("\n\n");

        System.out.println("Ordenar alunos por nome: \n"+ gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println("\n\nOrdenar alunos por nota: \n"+ gerenciadorAlunos.exibirAlunosPorNota());
    }
}
