import java.util.ArrayList;

public class Combo extends Produto {

    ArrayList<Produto> produtos = new ArrayList<>();
    private double desconto;

    public Combo(String descricao, double preco, double desconto) {
        super(descricao, preco);
        this.desconto = desconto;
    }

    public double calcularDesconto(){
        return 0.0;
    }

    @Override
    public double calcularPreco(double desconto) {
        return 0;
    }

    @Override
    public String exibirDetalhes() {
        return null;
    }
}
