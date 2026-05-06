package ExerciciosHeranca1.Controle;
import ExerciciosHeranca1.Dominio.Funcionario;
import ExerciciosHeranca1.Dominio.Vendedor;
import ExerciciosHeranca1.Dominio.Diretor;

import java.util.scanner;
import java.text.DecimalFormat;

public class ControlaFuncionario {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new Decimalformat("#.0");
        
        System.out.println("Digite o cpf do vendedor: ");
        String cpf = sc.nextString();
        
        System.out.println("Diga o salario dele: ");
        double salario = sc.nextDouble();
        
        System.out.println("Diga a comissão dele: ");
        double comissao = sc.nextDouble();
        
        Vendedor vendedor = new Vendedor(cpf, salario, comissao);
        
        System.out.println("Digite o cpf do diretor: ");
        cpf = sc.nextString();
        
        System.out.println("Diga o salario dele: ");
        salario = sc.nextDouble();
        
        System.out.println("Diga a bonificação dele: ");
        double bonificacao = sc.nextDouble();
        
        Diretor diretor = new Diretor(cpf, salario, bonificacao);
        
        System.out.println("\nDados do vendedor: \n");
        System.out.println("CPF: " + vendedor.getCpf());
        System.out.println("Salario: " + vendedor.getSalario());
        System.out.println("Comissão: " + vendedor.getComissao());
        
        System.out.println("\nDados do diretor: \n");
        System.out.println("CPF: " + diretor.getCpf());
        System.out.println("Salario: " + diretor.getSalario());
        System.out.println("Comissão: " + diretor.getBonificacao());
        

        sc.close();
    }
}
