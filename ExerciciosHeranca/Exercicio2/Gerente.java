package ExerciciosHeranca.Exercicio2;

public class Gerente extends Funcionario{
    private String departamento;
    
    public Gerente (String nome, double salario, String departamento){
        super(nome, salario);
        this.departamento = departamento;
    }
    
    public double salarioDepartamento(){
        if(departamento.equals("Finanças")){
            return salario + (salario * (50.0/100.0));
        } else {
            return salario;
        }
    }
    
    public double salarioNome(){
        if(nome.charAt(0) == 'J'){
            return salarioDepartamento() + (salarioDepartamento() * (25.0/100.0));
        } else {
            return salarioDepartamento();
        }
    }
    
}
