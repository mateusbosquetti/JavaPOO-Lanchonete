public class Outro extends Produto {
    private String tamanho; //Pequeno medio grande

    public Outro(String descricao, double preco, String tamanho) {
        super(descricao, preco);
        this.tamanho = tamanho;
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
        return super.toString() + "\nOutro " +
                "tamanho: " + tamanho;
    }
}
