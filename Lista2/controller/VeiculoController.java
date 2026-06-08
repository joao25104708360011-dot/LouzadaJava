package Lista2.controller;

import Lista2.model.Veiculo;
import Lista2.repository.VeiculoRepository;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VeiculoController {
    private final List<Veiculo> frota = new ArrayList<>();
    private final VeiculoRepository repository = new VeiculoRepository();

    public void adicionarVeiculo(Veiculo v) {
        frota.add(v);
    }

    public void salvarDadosEmArquivo(String nomeArquivo) throws IOException {
        repository.salvar(nomeArquivo, frota);
    }

    public List<String> obterLinhasDoArquivo(String nomeArquivo) throws IOException {
        return repository.ler(nomeArquivo);
    }
}
