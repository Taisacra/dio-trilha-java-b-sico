package com.taina;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ExceptionsTest {
    
    @Test
    public void validarCenarioDeExcecaoNaTransferencia(){
      Conta contaOrigem =  new Conta("123547", 0);
      Conta contaDestino =  new Conta("258963", 100);

      TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

      /* Assertions.assertThrows(IllegalArgumentException.class, () ->
      transferenciaEntreContas.transfere(contaOrigem, contaDestino, 0)); */
    }
}
