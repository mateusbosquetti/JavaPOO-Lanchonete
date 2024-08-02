public abstract class Produto {
    private int codigo;
    private static int geradorCodigo = 0;
    private String descricao;
    private double preco;

    public Produto(String descricao, double preco) {
        geradorCodigo++;
        codigo = geradorCodigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public abstract double calcularPreco(double desconto); //retorna o preco do produto com desconto ja
    public abstract String exibirDetalhes(); //retorna os detalhes do produto

    @Override
    public String toString() {
        return "Produto{" +
                "codigo='" + codigo + '\'' +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
