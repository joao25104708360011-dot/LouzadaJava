package ExerciciosHeranca.Exercicio3;

public class ContaPoupanca extends Conta{
    private int diaRendimento;
    
    public ContaPoupanca (String nome, int id, double saldo, int diaRendimento){
        super(nome, id, saldo);
        this.diaRendimento = diaRendimento;
    }
    
    @Override
    public void sacar(double valor){
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente!");
        } else {
            this.saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        }
    }
    
    public void taxas(double taxa){
        this.saldo += (this.saldo * taxa);
    }
    
}
