import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Por favor, digite o numero da conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("por favor, informa o numero da agencia!");
        int agencia = scanner.nextInt();

        System.out.println("Digite seu nome");
        String nomeCliente  = scanner.next();

        System.out.println("Por favor, informe o saldo!");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
         + agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldo + ", já está dispovivél para saque.");
    
    
    }
    

}