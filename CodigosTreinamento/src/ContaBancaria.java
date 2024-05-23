import java.util.NoSuchElementException;
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        boolean continuar = true;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (continuar) { 
          try {
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
                  System.out.println("Saldo atual R$ " + saldo);
                 }else{
                   saldo -= valorSaque;
                   System.out.println("Saldo atual R$ " + saldo);
                   System.out.println("Valor sacado R$ " + valorSaque);
                 }
                break;
                
              case 3:
                System.out.println("Saldo atual da conta R$ " + saldo);
                break;

              case 4:
                 continuar= false;
                 System.out.println("Programa encerrado!");
                 break;
                
               default:
                    System.out.println("Opção inválida. Tente novamente."); 
                
            }
            } catch (NoSuchElementException e) {
              System.out.println("Entrada inválida. Por favor, insira um número.");
              scanner.next(); // Limpa a entrada inválida
          }
           
        }
        scanner.close();
    }
}
