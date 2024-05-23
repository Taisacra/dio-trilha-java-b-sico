import java.util.Scanner; 

public class VerificadorNumeroConta { 

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Digite a o numero da conta");
        String numeroConta = scanner.nextLine();

        try {
            verificarNumeroConta(numeroConta);
            System.out.println("Numero de conta valido."); 

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage()); 
        } finally {
            scanner.close();
        }
    }

    private static void verificarNumeroConta(String numeroConta) { 
        if(numeroConta.length() !=8){
            throw new IllegalArgumentException("O número de conta deve ter exatamente 8 dígitos.");
        }

    }
}