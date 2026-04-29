package fase05.L05Exercicio08.dominio;

public abstract class Veiculo {
    protected String marca;
    protected String modelo;
    
    public Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public abstract exibirDados();
    
}
