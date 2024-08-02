import java.util.ArrayList;

public class Cliente extends Pessoa {
    ArrayList<Pedido> pedidos = new ArrayList<>();

    public Cliente(String nome, String endereco, int telefone) {
        super(nome, endereco, telefone);
    }

    public void fazerPedido(Pedido pedido){
        pedidos.add(pedido);
    }
    public void cancelarPedido(Pedido pedido){
        pedidos.remove(pedido);
    }


    public void vizualizarPedidos(){
        System.out.println(pedidos);
    }






}
