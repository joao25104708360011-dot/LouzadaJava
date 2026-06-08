package Lista2.repository;

import Lista2.model.Veiculo;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class VeiculoRepository {

    public void salvar(String nomeArquivo, List<Veiculo> frota) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Veiculo v : frota) {
                String tipo = v.getClass().getSimpleName();
                bw.write(tipo + "," + v.getPlaca() + "," + v.getCustoFixo() + "," + v.calcularCustoTotal());
                bw.newLine();
            }
        }
    }

    public List<String> ler(String nomeArquivo) throws IOException {
        List<String> linhas = new ArrayList<>();
        File file = new File(nomeArquivo);

        if (!file.exists()) {
            return linhas;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                linhas.add(linha);
            }
        }
        return linhas;
    }
}
