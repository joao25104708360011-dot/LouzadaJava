package Lista1.Exercicio2;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Produto> listaDeProdutos;

    public CarrinhoDeCompras() {
        this.listaDeProdutos = new ArrayList<>();
    }

    public void adicionarProduto(Produto p) {
        listaDeProdutos.add(p);
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto p : listaDeProdutos) {
            total += p.getPreco();
        }
        return total;
    }

    public void aplicarDescontoGeral(double percentual) {
        for (Produto p : listaDeProdutos) {
            p.aplicarDesconto(percentual); 
        }
    }
}
