package Lista1.Exercicio4

public class Main {
    public static void main(String[] args) {
        GerenciadorFrota gerenciador = new GerenciadorFrota();

        try {
            Carro cInvalido = new Carro("ABC12", 150.0, 50);
        } catch (PlacaInvalidaException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }

        Carro carro = new Carro("ABC1D23", 200.0, 100);
        Caminhao caminhao = new Caminhao("XYZ9W87", 1000.0, 5.0);
        
        gerenciador.adicionarVeiculo(carro);
        gerenciador.adicionarVeiculo(caminhao);

        gerenciador.salvarDadosEmArquivo("frota.txt");

        gerenciador.lerDadosDoArquivo("frota.txt");
    }
}
