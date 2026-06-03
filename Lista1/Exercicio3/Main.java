package Lista1.Exercicio3;

public class Main {
    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria("Carlos Eduardo", 500.00);
        
        System.out.println("--- Tentativa de Saque Transacional ---");
        
        try {
            conta.sacar(600.00);
            
            System.out.println("Transação concluída com sucesso.");
            
        } catch (SaldoInsuficienteException e) {
            System.err.println("[ALERTA DO SISTEMA]");
            System.err.println(e.getMessage());
        }
        
        System.out.println("--------------------------------------");
        System.out.println("Programa encerrado com segurança (operação mitigada).");
    }
}
