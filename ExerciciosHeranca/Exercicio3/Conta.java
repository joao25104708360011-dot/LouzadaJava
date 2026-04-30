package ExerciciosHeranca.Exercicio3;

public abstract class Conta {
    protected String nome;
    protected int id;
    protected double saldo;
    
    public Conta(String nome, int id, double saldo){
        this.nome = nome;
        this.id = id;
        this.saldo = saldo;
    }
    
    public abstract void sacar(double valor);
    
    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Valor deposirado com sucesso.");
    }
}
