package ExerciciosHeranca.Exercicio4;

public abstract class Animal {
    protected String nome;
    
    public Animal(String nome){
        this.nome = nome;
    }
    
    public abstract void fazerSom();
    
}
