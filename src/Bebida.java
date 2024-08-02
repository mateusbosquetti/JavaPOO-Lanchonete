public class Bebida extends Produto {
    private double volume;

    public Bebida(String descricao, double preco, double volume) {
        super(descricao, preco);
        this.volume = volume;
    }

    @Override
    public double calcularPreco(double desconto) {
        return 0;
    }

    @Override
    public String exibirDetalhes() {
        return toString();
    }

    @Override
    public String toString() {
        return "Bebida{" +
                "volume=" + volume +
                '}';
    }
}
