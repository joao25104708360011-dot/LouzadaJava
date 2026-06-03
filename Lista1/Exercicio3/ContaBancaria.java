package Lista1.Exercicio3;

public class ContaBancaria {
    private String titular;
    private double saldo;
    
    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void sacar(double valor) throws SaldoInsuficienteException{   
        if(valor > this.saldo){
            throw new SaldoInsuficienteException(this.saldo, valor);
        }
        
        this.saldo -= valor;
        System.out.printf("Saque de R$ %.2f realizado com sucesso! Novo saldo: R$ %.2f%n", valor, this.saldo);
    }
    
}
