package Lista1.Exercicio4

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorFrota {
    private List<Veiculo> frota = new ArrayList<>();
    
    public void adicionarVeiculo(Veiculo v) {
        frota.add(v);
    }
        
    public void salvarDadosEmArquivo(String nomeArquivo) {
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Veiculo v : frota) {
                
                String tipo = v.getClass().getSimpleName();
                
                bw.write(tipo + "," + v.getPlaca() + "," + v.getCustoFixo() + "," + v.calcularCustoTotal());
                bw.newLine();
            }
            System.out.println("Dados da frota salvos com sucesso em: " + nomeArquivo + ".");
        } catch (IOException e) {
            System.err.println("Erro ao tentar salvar os dados no arquivo: " + e.getMessage());
        }
        
    }
        
    public void lerDadosDoArquivo(String nomeArquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            System.out.println("\n--- LENDO DADOS RETROATIVOS DO ARQUIVO ---");
            
            while ((linha = br.readLine()) != null) {
                
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
