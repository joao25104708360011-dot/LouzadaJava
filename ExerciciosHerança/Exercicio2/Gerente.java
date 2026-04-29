package ExerciciosHerança.Exercicio2;

public class Gerente extends Funcionario{
    private String departamento;
    
    public Moto (String nome, double salario, String departamento){
        super(nome, salario);
        this.departamento = departamento;
    }
    
    public double salarioDepartamento(){
        if(departemento.equal("Finanças")){
            return salario + (50\100);
        } else {
            return salario;
        }
    }
    
    public double salarioNome(){
        if(nome.charAt(0) == 'J'){
            return salarioDepartamento() + (25/100);
        } else {
            return salarioDepartamento();
        }
    }
    
}
