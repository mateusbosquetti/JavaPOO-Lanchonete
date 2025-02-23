public class Bebida extends Produto {
    private double volume;

    public Bebida(String descricao, double preco, double volume) {
        super(descricao, preco);
        this.volume = volume;
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
        return super.toString() + "\nBebida " +
                "volume: " + volume;
    }
}
