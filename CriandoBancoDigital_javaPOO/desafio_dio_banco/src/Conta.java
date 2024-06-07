public abstract class Conta implements IConta{

    private static int SEQUENCIAL = 1;
    private static final int AGENCIA_PADRAO = 001;

    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente;

    
    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero= SEQUENCIAL++;
        this.cliente = cliente;
    }

    
    public int getAgencia(){
        return agencia;
    }
    public int getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }
   

    @Override
    public void sacar(double valor) {
        if (saldo <= valor) {
            System.out.println("Saldo insuficiente! \n Saldo atual R$: " + saldo);
        } else {
            saldo -= valor;
            System.out.println("Valor sacado R$: " + valor +"\n Saldo atual R$: " + saldo);
        }
    }

    @Override
    public void depositar(double valor) {
       saldo += valor;
       System.out.println("Valor depositado R$ " + valor+"Saldo atual R$ "+ saldo);
    }
    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (saldo <= valor ) {
            System.out.println("Saldo insuficiente! \n Saldo atual R$: " + saldo);
        }else {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Valor tranferido R$: " + valor + "\nConta destino: " + contaDestino + "\n Saldo atual R$: " + saldo);
        }
    }

    protected void imprimirInfosComuns(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }


    protected abstract Banco getCliente();;

}
