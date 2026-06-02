package Lista1.Exercicio1;

public class Principal {
    public static void main(String[] args) {
        
        Funcionario funcionario1 = new Gerente("Alice Souza", 5000.0, 1500.0);
        Funcionario funcionario2 = new Desenvolvedor("Bruno Costa", 4000.0, 10);
        
        Funcionario[] equipe = { funcionario1, funcionario2 };

        System.out.println("--- Processamento Dinâmico de Salários --- \n");

        for (Funcionario f : equipe) {
            System.out.println("Funcionário: " + f.getNome());
            System.out.printf("Salário Final: R$ %.2f%n", f.calcularSalario());
            System.out.println("---------------------------------------");
        }
    }
}
