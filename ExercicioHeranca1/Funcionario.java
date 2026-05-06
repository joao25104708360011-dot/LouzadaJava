package ExerciciosHeranca1.Dominio;

public abstract class Funcionario {
    private String cpf;
    private double salario;
    
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public double getSalario(){
        return salario;
    }
}
