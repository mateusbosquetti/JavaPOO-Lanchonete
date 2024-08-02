public class Garcom extends Pessoa {
    private double pagamento;

    public Garcom(String nome, String endereco, int telefone, double pagamento) {
        super(nome, endereco, telefone);
        this.pagamento = pagamento;
    }

    public void cadastrarPedido(Cliente cliente, Pedido pedido){
        cliente.fazerPedido(pedido);
    }

    public String exibirMenu(){
        return null;
    }

    public void adicionarItemAoPedido(Pedido pedido, Produto item){
        pedido.adicionarItem(item);
    }
    public void removerItemDoPedido(Pedido pedido, int codigo){
        pedido.removerItem(codigo);
    }
    public void confirmarPedido(Pedido pedido){
        pedido.confirmarPedido();
    }
    public double calcularPagamento(Pedido pedido){
        return pedido.calcularTotal();
    }
}
