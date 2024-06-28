package com.taina;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTest {
    
    @Test
    //@EnabledIfEnvironmentVariable(named = "USER", matches = "TainaSilva")
    @EnabledOnOs(OS.WINDOWS)
    public void validarAlgoSomenteNousuarioTaina(){
        Assertions.assertEquals(10, 5+5);
    }
}
