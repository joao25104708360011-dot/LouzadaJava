package Lista2.model;

public class PlacaInvalidaException extends RuntimeException {
    
    public PlacaInvalidaException(String placa) {
        super(String.format("Falha na operação: Quantidade de caracteres na placa (%s) é diferente de 7.", placa.length()));
    }
}
