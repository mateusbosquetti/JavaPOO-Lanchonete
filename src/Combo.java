import java.util.ArrayList;
import java.util.Formattable;

public class Combo extends Produto {

    ArrayList<Produto> produtos = new ArrayList<>();
    private double desconto;

    public Combo(String descricao, double preco, ArrayList<Produto> produtos, double desconto) {
        super(descricao, preco);
        this.produtos = produtos;
        this.desconto = desconto;
    }

    public double calcularDesconto() {
        if (produtos.size() == 2) {
            desconto = 0.05;
            return 0.05;
        } else if (produtos.size() == 3) {
            desconto = 0.10;
            return 0.10;
        } else if (produtos.size() >= 4) {
            desconto = 0.15;
            return 0.15;
        } else {
            return 0;
        }
    }

    @Override
    public double calcularPreco(double desconto) {
        int total = 0;
        for (Produto p : produtos) {
            total += p.getPreco();
        }
        if (desconto > 0) {
            return total - total * calcularDesconto();
        } else {
            return total;
        }
    }

    @Override
    public String exibirDetalhes() {
        return toString();
    }

    @Override
    public String toString() {
        return super.toString() + "\nCombo " +
                "produtos: " + produtos +
                ", desconto: " + desconto;
    }
}
