package Lista2.model;

public class Carro extends Veiculo implements Tributavel {
    private int quilometragem;
    
    public Carro(String placa, double custoFixo, int quilometragem) {
        super(placa, custoFixo);
        this.quilometragem = quilometragem;
    }
    
    @Override
    public double calcularIPVA(){
        return (getCustoFixo()*0.04);
    }
    
    @Override
    public double calcularCustoTotal(){
        return getCustoFixo() + (quilometragem * 0.15);
    }
}
