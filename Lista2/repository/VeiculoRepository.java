package Lista2.repository;

import Lista2.model.Veiculo;
import Lista2.model.Carro;
import Lista2.model.Caminhao;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class VeiculoRepository {
    private final String nomeArquivo;

    public VeiculoRepository(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void salvar(List<Veiculo> frota) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Veiculo v : frota) {
                String tipo = v.getClass().getSimpleName();
                bw.write(tipo + "," + v.getPlaca() + "," + v.getCustoFixo());
                bw.newLine();
            }
        }
    }

    public List<Veiculo> carregar() throws IOException {
        List<Veiculo> frotaCarregada = new ArrayList<>();
        File file = new File(nomeArquivo);
        
        if (!file.exists()) {
            return frotaCarregada;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");
                if (dados.length < 3) continue;

                String tipo = dados[0];
                String placa = dados[1];
                double custoFixo = Double.parseDouble(dados[2]);

                if (tipo.equalsIgnoreCase("Carro")) {
                    frotaCarregada.add(new Carro(placa, custoFixo, 0)); 
                } else if (tipo.equalsIgnoreCase("Caminhao")) {
                    frotaCarregada.add(new Caminhao(placa, custoFixo, 0.0));
                }
            }
        }
        return frotaCarregada;
    }
}
