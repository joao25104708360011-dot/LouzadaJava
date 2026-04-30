package ExerciciosHeranca.Exercicio1;

public class Moto extends Veiculo{
    private float cilindradas;
    
    public Moto (String marca, String modelo, float cilindradas){
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }
    
    @Override
    public void exibirDados(){
        System.out.println("Informações da moto");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cilindradas: " + cilindradas);
        
    }
    
}
