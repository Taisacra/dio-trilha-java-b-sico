

public class Main {
    public static void main(String[] args) {
        Cliente taina = new Cliente("Tainá", 14082002, 10016524, 1604529587);
        
        Conta cc = new ContaCorrente(taina);
        Conta poupanca = new ContaPoupanca(taina);
        cc.depositar(1000);
        cc.transferir(150, poupanca);
        cc.imprimirextrato();
        poupanca.imprimirextrato();



        Cliente rose = new Cliente("Roseane", 18041979, 00000, 22222);
        
        Conta cc1 = new ContaCorrente(rose);
        Conta poupanca1 = new ContaPoupanca(rose);
        cc1.depositar(1000);
        cc1.transferir(150, poupanca1);
        cc1.imprimirextrato();
        poupanca1.imprimirextrato();

        


       


    }
}
