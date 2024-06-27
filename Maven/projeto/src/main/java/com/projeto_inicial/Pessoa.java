package com.projeto_inicial;


import java.time.LocalDateTime;
import java.util.Objects;

public class Pessoa {

    private String nome;
    private LocalDateTime nascimento;

    public Pessoa(String nome, LocalDateTime nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }
    
    public String getNome() {
        return nome;
    }
    
    public LocalDateTime getNascimento() {
        return nascimento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nascimento);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return nome.equals(pessoa.nome) && Objects.equals(nascimento, pessoa.nascimento);
    }

}
