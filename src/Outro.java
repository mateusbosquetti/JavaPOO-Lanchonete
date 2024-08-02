public class Outro extends Produto {
    private String tamanho; //Pequeno medio grande

    public Outro(String descricao, double preco, String tamanho) {
        super(descricao, preco);
        this.tamanho = tamanho;
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
