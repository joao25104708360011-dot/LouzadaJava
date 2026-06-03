package Lista1.Exercicio3;

public class SaldoInsuficienteException extends Exception {
    
    public SaldoInsuficienteException(double saldoDisponivel, double valorSolicitado) {
        super(String.format("Falha na operação: Saldo insuficiente! Saldo disponível: R$ %.2f | Valor solicitado: R$ %.2f", 
                saldoDisponivel, valorSolicitado));
    }
}
