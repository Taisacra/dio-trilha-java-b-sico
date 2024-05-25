package set;

public class Convidados {
    private String nome;
    private int codigoConvite;

    public Convidados(String nome, int codigoConvite2){
        this.nome = nome;
        this.codigoConvite = codigoConvite2;
    }

    public String getNome(){
        return nome;
    }

    public int getCodigoConvite(){
        return codigoConvite;
    }

    @Override
    public String toString() {
        return "Lista convidados {" +
        "Nome: " + nome + "\n" +
        "Código convite: " + codigoConvite + "\n}";
    }
}
