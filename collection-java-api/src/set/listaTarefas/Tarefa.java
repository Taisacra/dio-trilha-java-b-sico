package set.listaTarefas;

public class Tarefa {
    private String descricao;
    private boolean statusTarefa;

    public Tarefa(String descricao, boolean statusTarefa){
        this.descricao = descricao;
        this.statusTarefa = false;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public boolean getStatusTarefa(){
        return statusTarefa;
    }

    public void setStatusTarefa(boolean statusTarefa){
        this.statusTarefa = statusTarefa;
    }

    @Override
    public String toString() {
        return "Tarefas{ " +
        "descrição: " + descricao +"\n"+
        "Status Tarefa: " + statusTarefa + "\n}"; 
    }

}
