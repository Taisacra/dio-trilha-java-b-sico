import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contaList;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public List<Conta> getContaList(){
        return contaList;
    }
   
}
