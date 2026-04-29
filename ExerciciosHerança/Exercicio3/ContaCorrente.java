package ExerciciosHerança.Exercicio3;

public class ContaCorrente extends Conta{
    private double limite;
    
    public ContaCorrente (String nome, int id, double saldo, double limite){
        super(nome, id, saldo);
        this.limite = limite;
    }
    
    @Override
    public void sacar(double valor){
        if(saldo + limite < limite){
            System.out.println("Limite insuficiente.");
        } else {
            this.saldo -= valor; 
            System.out.println("Valor sacado com sucesso.");
        }
    }
    
}
