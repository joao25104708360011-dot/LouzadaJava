package ExerciciosHeranca.Exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Animal> animais = new ArrayList<>();

        animais.add(new Cachorro("Toddy"));
        animais.add(new Gato("Nescau"));
        animais.add(new Cachorro("Nestle"));

        System.out.println("--- Sons dos Animais ---");
        
        for (Animal animal : animais) {
            animal.fazerSom(); 
        }
    }
}
