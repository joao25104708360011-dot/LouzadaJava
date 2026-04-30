package ExerciciosHeranca.Exercicio5;

public class Cliente implements Autenticavel {
    private String email;
    private String senha;

    public Cliente(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}
