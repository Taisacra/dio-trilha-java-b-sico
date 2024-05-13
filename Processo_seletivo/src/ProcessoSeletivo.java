import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        //analisarCandidato(0);
        selecaoCandidato();
    }

    /* static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase> salarioPretendido){
            System.out.println(" LIGAR PARA O CANDIDATO.");
        }else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA.");
        }else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
        }
    } */

    static void selecaoCandidato(){
        //Case 2
        String[] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        ArrayList<String> listaCandidatos = new ArrayList<>();

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor salario " + salarioPretendido);
            if(salarioBase > salarioPretendido){
                System.out.println("O canditado " + candidato + " foi selecionando para a vaga!");
                candidatosSelecionados++;
                listaCandidatos.add(candidato); // Adiciona o candidato selecionado à lista
            }
            candidatoAtual++;
        } 
        
        // Case 3
        System.out.println("\n\n\nImprimindo lista de candidados aptos a vaga\n");
        for (String listaCandidato : listaCandidatos) {
            System.out.println("Candidato(a) selecionado(a): " + listaCandidato);

        //Case4
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");

        } while (continuarTentando && tentativasRealizadas < 3);
            if(atendeu)
                System.out.println("CONSEGUIMOS CONTATO COM " + listaCandidato +" NA " + tentativasRealizadas + " TENTATIVA");
            else
                System.out.println("NÃO CONSEGUIMOS CONTATO COM " + listaCandidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
        }
    }

    // métodos auxiliares
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static double valorPretendido() {
	     return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
}
