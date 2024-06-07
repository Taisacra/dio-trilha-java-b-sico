import java.sql.Date;

public class Cliente {
    private String nome;
    private Date data_nasc;
    private int cpf;
    private int rg;

    public Cliente(String nome, int i, int cpf,int rg){
        this.nome = nome;
        this.data_nasc = data_nasc;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNome(){
        return nome;
    }
    public Date getData_nasc(){
        return data_nasc;
    }
    public int getCpf(){
        return cpf;
    }
    public int getRg(){
        return rg;
    }
    
    
}
