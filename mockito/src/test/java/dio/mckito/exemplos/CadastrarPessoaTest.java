package dio.mckito.exemplos;

import java.time.LocalDate;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {
    
    @Mock
    private ApiDosCorreios apiDosCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    public void validarDadosDecadastro(){
        DadosLocalizacao dadosLocalizacao= new DadosLocalizacao("BA", "Lauro de Freitas", "Rua São Bernardo", "casa", "Ipitanga");
        Mockito.when(apiDosCorreios.buscaDadosComBaseNoCep("42706480")).thenReturn(dadosLocalizacao);
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Taina", "12345678952", LocalDate.now(), "42706480");

        assertEquals("Taina", pessoa.getNome());
        assertEquals("12345678952", pessoa.getDocumento());
        assertEquals("BA", pessoa.getEndereco().getUf());
        assertEquals("casa", pessoa.getEndereco().getComplemento());
    }
}
