public class Lanche extends Produto {

    private double peso;

    public Lanche(String descricao, double preco, double peso) {
        super(descricao, preco);
        this.peso = peso;
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
