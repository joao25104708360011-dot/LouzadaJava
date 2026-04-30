package ExerciciosHeranca.Exercicio4;

public abstract class Gato extends Animal {
   
    public Gato(String nome){
        super(nome);
    }
    
    @Override
    public void fazerSom(){
        System.out.printf(nome + " Diz: Miau.");
    }
    
}
