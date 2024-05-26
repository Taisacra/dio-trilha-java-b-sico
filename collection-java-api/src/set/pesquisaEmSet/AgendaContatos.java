package set.pesquisaEmSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> agendaContatoSet;
    
    public AgendaContatos(){
        this.agendaContatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numeroTelefone){
        agendaContatoSet.add(new Contato(nome, numeroTelefone));
    }

    public void exibirContatos(){
        if (!agendaContatoSet.isEmpty()) {
            System.out.println(agendaContatoSet);
        } else {
            System.out.println("Conjunto vazio!");
        }
    }

    //Retornar um Set de contato (um conjunto de contato)
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato c : agendaContatoSet) {
            //Método do String startsWith que pesquisa por nome, todo contato que começar com Tainá independente se sobrenome etc ele colocará na lista de contatoPorNome
            if (c.getNome().startsWith(nome)) {
                contatoPorNome.add(c);            } 
        } 
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : agendaContatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumeroTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }





    public static void main(String[] args) {
        AgendaContatos agendaContatos= new AgendaContatos();
        agendaContatos.adicionarContato("Tainá", 01);
        agendaContatos.adicionarContato("Tainá silva", 02);
        agendaContatos.adicionarContato("Tainá DIO", 03);
        agendaContatos.adicionarContato("Maria ", 04);
        agendaContatos.adicionarContato("José", 05);

        agendaContatos.exibirContatos();
        System.out.println("\n\n\n");
      
        agendaContatos.atualizarNumeroContato("Tainá", 1598);
        agendaContatos.exibirContatos();
        System.out.println("\n\n\n");
        System.out.println(  agendaContatos.pesquisarPorNome("Tainá"));

    }
}
