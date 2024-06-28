package com.taina;

import java.lang.reflect.Method;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

//Escolher a ordem que os testes serão executados
//@TestMethodOrder(MethodOrderer.MethodName.class) Ele válida o nome do metodo por ordem alfabética 
//@TestMethodOrder(MethodOrderer.Random.class) Quero que execute aleatóriamente
//@TestMethodOrder(MethodOrderer.DisplayName.class) Nomeia o teste de alguma forma e executa na ordem nomeada: Usa o @DisplayName("name") acima do @Test
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EscolhendoAOrdemTest {
    

    @Order(4)
    @Test
    public void validaFluxoA(){
        Assertions.assertTrue(true);
    }

    @Order(2)
    @Test
    public  void validaFluxoB(){
        Assertions.assertTrue(true);
    }

    @Order(3)
    @Test
    public void validaFluxoC(){
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test
    public void validaFluxoD(){
        Assertions.assertTrue(true);
    }
}

