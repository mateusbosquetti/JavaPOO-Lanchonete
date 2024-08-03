import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
                            // Metodo adicionar Produto
                            break;
                        case 2:
                            // Metodo remover Produto
                            break;
                        case 3:
                            // Metodo editar Produto
                            break;
                        case 4:
                            // Metodo listar Produto
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
    }
}
