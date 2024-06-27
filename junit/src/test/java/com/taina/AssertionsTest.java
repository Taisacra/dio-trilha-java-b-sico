package com.taina;

import java.time.LocalDateTime;

import org.junit.Test;

//importando o static Assertions.* não precisa está sempre chamando metodo Assertions.
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {
    
    @Test
    public void validarLancamentos(){
        int[] primeiroLancamento = {10, 20, 30, 40, 50};
        int[] segundoLancamento = {-1, 5, 3, 10, 16, };

       /*  //Comparar arrays se são iguais
        Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento); */

        //Comparar arrays se são diferentes
        assertNotEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    public void validarSeObjetoEhNulo(){
        Pessoa pessoa = null;
        assertNull(pessoa);

        pessoa = new Pessoa("Mariana", LocalDateTime.now());
       assertNotNull(pessoa);
    }

    @Test
    public void validarNumerosDeTiposDiferentes(){
        double valor = 5.0;
        double outroValor = 5.0;

        assertEquals(valor, outroValor);
    }
}
