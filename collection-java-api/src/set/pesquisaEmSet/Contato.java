package set.pesquisaEmSet;

public class Contato {
    private String nome;
    private int numeroTelefone;

    public Contato(String nome, int numeroTelefone){
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    public String getNome(){
        return nome;
    }

    public int getNumeroTelefone(){
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone){
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public String toString() {
        return " Contatos {"+
        "\nNome: " + nome + 
        "\nNumero de telefone: " +numeroTelefone + "\n}";
    }


}
