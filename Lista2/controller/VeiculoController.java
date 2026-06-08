package Lista2.controller;

import Lista2.model.Veiculo;
import Lista2.repository.VeiculoRepository;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VeiculoController {
    private List<Veiculo> frota;
    private final VeiculoRepository repository;

    public VeiculoController(String nomeArquivo) {
        this.repository = new VeiculoRepository(nomeArquivo);
        try {
            this.frota = repository.carregar();
        } catch (IOException e) {
            this.frota = new ArrayList<>();
        }
    }

    public void adicionarVeiculo(Veiculo v) throws IOException {
        frota.add(v);
        repository.salvar(frota);
    }

    public List<Veiculo> getFrota() {
        return new ArrayList<>(frota);
    }
}
