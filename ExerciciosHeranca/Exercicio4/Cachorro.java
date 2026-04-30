package ExerciciosHeranca.Exercicio4;

public abstract class Cachorro extends Animal {
   
    public Cachorro(String nome){
        super(nome);
    }
    
    @Override
    public void fazerSom(){
        System.out.printf(nome + " Diz: Au! Au!");
    }
    
}
