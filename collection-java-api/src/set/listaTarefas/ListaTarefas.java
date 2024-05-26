package set.listaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas(){
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao){
       Tarefa tarefaParaRemover = null;
       if (!tarefaSet.isEmpty()) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao() == descricao) {
                tarefaParaRemover = t;
                break;
            }
       }
       tarefaSet.remove(tarefaParaRemover);
       } else {
            System.out.println("O conjunto está vazio!");
       }

       if (tarefaParaRemover == null) {
            System.out.println("Tarefa não encontrada!");
       }
    }

    public void exibirTarefas(){
        if (!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        } else {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.getStatusTarefa()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (!t.getStatusTarefa()) {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }


    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setStatusTarefa(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        Tarefa tarefaParaMarcarComoPendente = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaMarcarComoPendente = t;
                break;
            }
        }
        if (tarefaParaMarcarComoPendente != null) {
            if (tarefaParaMarcarComoPendente.getStatusTarefa()) {
                tarefaParaMarcarComoPendente.setStatusTarefa(false);
            }
        }else{
            System.out.println("Tarefa não encontrada na lista");
        }
    }

    public void limparListaTarefas(){
        if (!tarefaSet.isEmpty()) {
            tarefaSet.clear();
        } else {
            System.out.println("Conjundo de tarefas vazio!");
        }
    }


    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");


        listaTarefas.exibirTarefas();
        System.out.println("\n\n");

        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();
        System.out.println("\n\n");

        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());
        System.out.println("\n\n");

        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");
        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println("\n\n");


        listaTarefas.marcarTarefaPendente("Estudar Java");
        System.out.println("Tarefas pendentes: "+listaTarefas.obterTarefasPendentes());
        System.out.println("\n\n");

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }

}
