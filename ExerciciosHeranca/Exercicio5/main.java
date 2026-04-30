package ExerciciosHeranca.Exercicio5;

public class SistemaLogin {
    
    public void fazerLogin(Autenticavel usuario, String senha) {
        if(usuario.autenticar(senha)) {
            System.out.println("Acesso liberado!");
        } else {
            System.out.println("Acesso negado.");
        }
    }
}
