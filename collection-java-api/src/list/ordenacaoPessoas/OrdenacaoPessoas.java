package list.ordenacaoPessoas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> ordenaPessoasList;

    public OrdenacaoPessoas(){
        this.ordenaPessoasList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        ordenaPessoasList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(ordenaPessoasList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(ordenaPessoasList);
        Collections.sort(pessoasPorAltura, new ComparaterPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Pessoa1", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Pessoa2", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Pessoa3", 25, 1.79);
        ordenacaoPessoas.adicionarPessoa("Pessoa4", 17, 1.65);
        System.out.println("\n\n\n");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println("\n\n\n");
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}