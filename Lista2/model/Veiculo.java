package Lista2.model;

public abstract class Veiculo {
    private String placa;
    private double custoFixo;
    
    public Veiculo(String placa, double custoFixo) {
        if (placa.length() != 7) {
            throw new PlacaInvalidaException(placa); 
        } 
        
        this.placa = placa;
        this.custoFixo = custoFixo;
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public double getCustoFixo(){
        return custoFixo;
    }
    
    public abstract double calcularCustoTotal();
}
