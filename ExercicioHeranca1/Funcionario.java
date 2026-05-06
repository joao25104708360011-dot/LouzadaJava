package ExerciciosHeranca1.Dominio;

public abstract class Funcionario {
    private String cpf;
    private double salario;
    
    public Funcionario(String cpf, double salario){
        this.cpf = cpf;
        this.salario = salario;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public String setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public double setSalario(double salario){
        this.salario = salario;
    }
}
