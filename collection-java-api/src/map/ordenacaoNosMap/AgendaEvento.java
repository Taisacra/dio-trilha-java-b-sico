package map.ordenacaoNosMap;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import javax.xml.crypto.Data;

public class AgendaEvento {
    private Map<LocalDate, Evento> agendaEventoMAp;

    public AgendaEvento() {
        this.agendaEventoMAp = new  HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        //Evento evento = new Evento(nome, atracao);
        agendaEventoMAp.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventoMAp);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate proximaData = null;
        Evento proximoEvento = null;
       LocalDate dataAtual = LocalDate.now();
       Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agendaEventoMAp);
       for (Map.Entry<LocalDate, Evento> entry : agendaEventoMAp.entrySet() ) {
        if (entry.getKey().isEqual(dataAtual)|| entry.getKey().isAfter(dataAtual)) {
            proximaData = entry.getKey();
            proximoEvento = entry.getValue();
            System.out.println("O próximo evento: " + proximaData + "acontecerá na data"+ proximoEvento);
            break;
        }
       }
    }


    public static void main(String[] args) {
        AgendaEvento agendaEventos = new AgendaEvento();
        // Adiciona eventos à agenda
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY, 15), "Conferência de Tecnologia", "Palestrante renomado");
        agendaEventos.adicionarEvento(LocalDate.of(2022, 7, 9), "Workshop de Programação", "Aula prática de desenvolvimento");
        agendaEventos.adicionarEvento(LocalDate.of(2000, 1, 10), "Lançamento de Software", "Demonstração da nova versão");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 28), "Hackathon de Inovação", "Competição de soluções criativas");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 20), "Seminário de Inteligência Artificial", "Discussão sobre IA avançada");
        
        agendaEventos.exibirAgenda();
         // Obtém e exibe o próximo evento na agenda
        agendaEventos.obterProximoEvento();
    
    }
    
}
