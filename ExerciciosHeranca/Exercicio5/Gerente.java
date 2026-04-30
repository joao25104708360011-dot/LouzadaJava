package ExerciciosHeranca.Exercicio5;

public class Gerente extends Funcionario implements Autenticavel{
    private String departamento;
    private String senha;
    
    public Gerente (String nome, double salario, String departamento, String senha){
        super(nome, salario);
        this.departamento = departamento;
        this.senha = senha;
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
    
    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
    
}
