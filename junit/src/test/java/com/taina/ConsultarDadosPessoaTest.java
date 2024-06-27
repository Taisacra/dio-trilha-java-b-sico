package com.taina;

import java.time.LocalDateTime;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class ConsultarDadosPessoaTest {
    

    // Antes de qualquer coisa o BeforeAll executou 
    @BeforeAll
    static void configuraConexao(){
        BancoDados.iniciarConexao();
    }

    // É uma execução unica no inicio e no final do teste
    @BeforeEach
    void insereDadosParaTest(){
        BancoDados.insereDados(new Pessoa("joao", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    // É uma execução unica no inicio e no final do teste
    @AfterEach
    void removeDadosParaTest(){
        BancoDados.removeDados(new Pessoa("joao", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));

    }

    @Test
    public void validarDadosDeRetorno(){
        Assertions.assertTrue(true);
    }

    @Test
    public void validarDadosDeRetorno2(){
        Assertions.assertFalse(false);

    }

    //Depois de todos os testes o AfterAll executou 
    @AfterAll void finalizarConexao(){
        BancoDados.finalizarConexao();
    }
}
