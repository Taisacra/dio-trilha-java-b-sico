package com.taina;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;

public class AssumptionsTest {
    
    @Test
    public void validarAlgoSomenteNoUsuarioTaina(){
        Assumptions.assumeFalse("TainaSilva".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5+5);
    }
}
