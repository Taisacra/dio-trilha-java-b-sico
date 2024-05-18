import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) { 
            System.out.println("escolha uma opção");
            System.out.println("1- Depósito");
            System.out.println("2- Saque");
            System.out.println("3- Saldo atual");
            System.out.println("4- Sair");
            int opcao = scanner.nextInt(); 
            
            switch(opcao){
              case 1:
                System.out.println("Informe o valor a ser depósitado: ");
                double valor = scanner.nextDouble();
                
                saldo += valor;
                System.out.println("Saldo conta R$ " + saldo);
                break;
                
              case 2:
                 System.out.println("Informe o valor para saque! ");
                 double valorSaque = scanner.nextDouble();
                 
                 if(valorSaque > saldo){
                  System.out.println("Saldo insuficiente!.");
                 }else{
                   saldo -= valorSaque;
                 }
                break;
                
              case 3:
                System.out.println("Saldo atual da conta R$ " + saldo);
                break;
                
               default:
                    System.out.println("Opção inválida. Tente novamente."); 
                
            }
        }
    }
}
