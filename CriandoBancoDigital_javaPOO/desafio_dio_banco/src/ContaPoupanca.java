public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente ) {
        super(cliente);  
    }

    @Override
    public void imprimirextrato() {
        System.out.println("===Extrato Conta Poupança===");
        super.imprimirInfosComuns();
    }

    @Override
    protected Banco getCliente() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCliente'");
    }

        
}
