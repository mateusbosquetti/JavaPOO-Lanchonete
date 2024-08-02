import java.util.ArrayList;

public class Pedido {
    private Cliente cliente;
    ArrayList<Produto> itens = new ArrayList<>();
    private String status;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionarItem(Produto item){
        itens.add(item);
    }
    public void removerItem(int codigo){
        itens.remove(codigo);
    }
    public double calcularTotal(){
        int total = 0;
        for(Produto i : itens){
            total+=i.getPreco();
        }
        return total;
    }

    public void confirmarPedido(){
        System.out.println("Pedido feito!");
        itens.clear();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente.getNome() +
                ", itens=" + itens.toString() +
                ", status='" + status + '\'' +
                '}';
    }
}
