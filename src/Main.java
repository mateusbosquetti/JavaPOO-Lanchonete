public class Main {
    public static void main(String[] args) {

        Produto bebida1 = new Bebida("bebida teste", 10.0,2);
        Produto lanche1 = new Lanche("lanche teste", 30.5,500);
        Produto outro1 = new Outro("Outro teste", 100.0, "Medio");
        Produto combo1 = new Combo("Combo teste", 200.25,10);

        System.out.println("Imprimir produtos");
        System.out.println(bebida1.toString());
        System.out.println(lanche1.toString());
        System.out.println(outro1.toString());
        System.out.println(combo1.toString());

        GerenciadorDeCardapio gerenciadorDeCardapio = new GerenciadorDeCardapio();

        gerenciadorDeCardapio.adicionarProduto(bebida1);
        gerenciadorDeCardapio.adicionarProduto(lanche1);
        gerenciadorDeCardapio.adicionarProduto(outro1);
        gerenciadorDeCardapio.adicionarProduto(combo1);

        System.out.println("\nImprimir produtos do cardapio");
        System.out.println(gerenciadorDeCardapio.listarProdutos());

        gerenciadorDeCardapio.removerProduto(3);
        gerenciadorDeCardapio.editarProduto(2,bebida1);
        System.out.println("\nImprimir produtos do cardapio após alterações");
        System.out.println(gerenciadorDeCardapio.listarProdutos());

        //Certo

        Cliente cliente1 = new Cliente("Cliente1", "ClienteEndereco1", 123);
        Garcom garcom1 = new Garcom("Garcom1", "GarcomEndereco1",123,5);
        Pedido pedido1 = new Pedido(cliente1);
        garcom1.cadastrarPedido(cliente1, pedido1);
        garcom1.adicionarItemAoPedido(pedido1, bebida1);
        garcom1.adicionarItemAoPedido(pedido1, lanche1);
        System.out.println(garcom1.calcularPagamento(pedido1));
        garcom1.removerItemDoPedido(pedido1, 1);
        cliente1.vizualizarPedidos();

        cliente1.cancelarPedido(pedido1);


        cliente1.vizualizarPedidos();
        garcom1.cadastrarPedido(cliente1, pedido1);
        cliente1.vizualizarPedidos();
        garcom1.confirmarPedido(pedido1);
        cliente1.vizualizarPedidos();
    }
}
