package com.taina;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PessoaTest {

    @Test
    public void deveCalcularIdadeCorretamente(){

        Pessoa taina = new Pessoa("Tainá", LocalDateTime.of(2002, 8, 14, 15, 0, 0));
        Assertions.assertEquals(21,taina.getIdade());
       
    }

    @Test
    public void deveRetornarSeEhMaiorDeIdade(){
        Pessoa taina = new Pessoa("Tainá", LocalDateTime.of(2002, 8, 14, 15, 0, 0));
        Assertions.assertTrue(taina.ehMaiorDeIdade());

    }
}
