package Lista2.view;

import Lista2.controller.VeiculoController;
import Lista2.model.Carro;
import Lista2.model.Caminhao;
import Lista2.model.PlacaInvalidaException;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VeiculoController gerenciador = new VeiculoController();

        try {
            Carro cInvalido = new Carro("ABC12", 150.0, 50);
        } catch (PlacaInvalidaException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }

        Carro carro = new Carro("ABC1D23", 200.0, 100);
        Caminhao caminhao = new Caminhao("XYZ9W87", 1000.0, 5.0);
        
        gerenciador.adicionarVeiculo(carro);
        gerenciador.adicionarVeiculo(caminhao);

        try {
            gerenciador.salvarDadosEmArquivo("frota.txt");
            System.out.println("Dados da frota salvos com sucesso em: frota.txt.");
        } catch (IOException e) {
            System.err.println("Erro ao tentar salvar os dados no arquivo: " + e.getMessage());
        }

        try {
            List<String> linhas = gerenciador.obterLinhasDoArquivo("frota.txt");
            
            System.out.println("\n--- LENDO DADOS RETROATIVOS DO ARQUIVO ---");
            for (String linha : linhas) {
                String[] dados = linha.split(",");
                String tipo = dados[0];
                String placa = dados[1];
                String custoFixo = dados[2];
                String custoTotal = dados[3];
                
                System.out.printf("Tipo: %s | Placa: %s | Custo Fixo: R$ %s | Custo Total Calculado: R$ %s%n", 
                        tipo, placa, custoFixo, custoTotal);
            }
            System.out.println("------------------------------------------");
            
        } catch (IOException e) {
            System.err.println("Erro ao tentar ler o arquivo: " + e.getMessage());
        }
    }
}
