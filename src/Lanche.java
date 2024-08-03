public class Lanche extends Produto {

    private double peso;

    public Lanche(String descricao, double preco, double peso) {
        super(descricao, preco);
        this.peso = peso;
    }

    @Override
    public double calcularPreco(double desconto) {
        return getPreco() - getPreco() * (desconto / 100);
    }

    @Override
    public String exibirDetalhes() {
        return toString();
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLanche " +
                "peso: " + peso;
    }
}
