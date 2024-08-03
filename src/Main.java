import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeCardapio gerenciadorDeCardapio = new GerenciadorDeCardapio();
        Scanner sc = new Scanner(System.in);
        int opcaoInicial, opcaoProduto;

        System.out.println("Bem vindo ao sistema de gerenciamento de pedidos da lanchonete TopLanch!");
        do {

            System.out.print("Digite a opção que você quer acessar!\n" +
                    "__________________________________\n" +
                    "| Cod | Descricao                |\n" +
                    "|  1  | Produtos do cardápio     |\n" +
                    "|  2  | Pessoas                  |\n" +
                    "|  4  | Ações de Garçom          |\n" +
                    "|  5  | Sair                     |\n" +
                    "----------------------------------\n" +
                    "R: ");
            opcaoInicial = sc.nextInt();

            switch (opcaoInicial) {
                case 1:
                    System.out.println("Bem vindo a aba de Produtos do cardápio!");
                    System.out.println("" +
                            "__________________________________\n" +
                            "| Cod | Descricao                |\n" +
                            "|  1  | Adicionar Produtos       |\n" +
                            "|  2  | Remover Produtos         |\n" +
                            "|  3  | Editar Produtos          |\n" +
                            "|  4  | Listar Produtos          |\n" +
                            "|  5  | Voltar                   |\n" +
                            "----------------------------------\n" +
                            "R: ");
                    opcaoProduto = sc.nextInt();

                    switch (opcaoProduto) {
                        case 1:
                            adicionarProduto(sc, gerenciadorDeCardapio);
                            // Metodo adicionar Produto
                            break;
                        case 2:
                            // Metodo remover Produto
                            break;
                        case 3:
                            // Metodo editar Produto
                            break;
                        case 4:
                            System.out.println(gerenciadorDeCardapio.listarProdutos());

                            break;
                        case 5:
                            //Voltar
                            break;
                        default:
                            System.out.println("Opção inválida");
                    }
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:
                    System.out.println("Opção inválida");
            }

        } while (opcaoInicial != 5);
        sc.close();
    }

    //PRODUTOS
    public static void adicionarProduto(Scanner sc, GerenciadorDeCardapio gerenciadorDeCardapio) {
        int opcaoAdd;
        System.out.println("Selecione a categoria do produto que deseja adicionar!\n" +
                "___________________\n" +
                "| Cod | Descricao |\n" +
                "|  1  | Lanches   |\n" +
                "|  2  | Bebidas   |\n" +
                "|  3  | Outros    |\n" +
                "|  4  | Combo     |\n" +
                "|  5  | Voltar    |\n" +
                "-------------------\n" +
                "R: ");
        opcaoAdd = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite a descrição do produto: ");
        String descricao = sc.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        switch (opcaoAdd) {
            case 1:
                System.out.print("Digite o peso do produto: ");
                double peso = sc.nextDouble();
                Lanche lanche = new Lanche(descricao, preco, peso);
                gerenciadorDeCardapio.adicionarProduto(lanche);
                System.out.println("Produto adicionado com sucesso!");
                break;
            case 2:
                System.out.print("Digite o volume do produto: ");
                double volume = sc.nextDouble();
                Bebida bebida = new Bebida(descricao, preco, volume);
                gerenciadorDeCardapio.adicionarProduto(bebida);
                System.out.println("Produto adicionado com sucesso!");
                break;
            case 3:
                System.out.print("Digite o peso do produto: ");
                String tamanho = sc.nextLine();
                Outro outro = new Outro(descricao, preco, tamanho);
                gerenciadorDeCardapio.adicionarProduto(outro);
                System.out.println("Produto adicionado com sucesso!");
                break;
            case 4:
//                System.out.print("Digite o peso do produto: ");
//                double peso = sc.nextDouble();
//                Lanche lanche = new Lanche(descricao, preco, peso);
                break;
            case 5:
                break;
            default:
                System.out.println("Opção inválida!");
        }

    }

    public static void listarProduto() {

    }

    public static void removerProduto(Scanner sc) {

    }

    public static void editarProduto(Scanner sc) {

    }

}
