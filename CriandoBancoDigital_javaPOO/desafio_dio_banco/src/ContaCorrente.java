public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente); 
    }

    @Override
    public void imprimirextrato() {
        System.out.println("===Extrato Conta Corrente===");
        super.imprimirInfosComuns();
    }

    @Override
    protected Banco getCliente() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCliente'");
    }

    
   
}
