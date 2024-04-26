import java.util.ArrayList;
import java.util.Scanner;

class Item {
    String nome;
    int quantidade;
    double preco;

    public Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Quantidade: " + quantidade + ", Preço: " + preco;
    }
}

public class Estoque {
    public static void main(String[] args) {
        ArrayList<Item> listaEstoque = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Cadastrar novo item no estoque");
            System.out.println("2. Listar todos os itens cadastrados");
            System.out.println("3. Sair do programa");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nCADASTRAR NOVO OBJETO");
                    System.out.print("Nome do objeto: ");
                    String nome = scanner.next();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();

                    Item novoItem = new Item(nome, quantidade, preco);
                    listaEstoque.add(novoItem);
                    System.out.println("Item cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("\nLISTA DE OBJETOS CADASTRADOS");
                    if (listaEstoque.isEmpty()) {
                        System.out.println("Nenhum objeto cadastrado.");
                    } else {
                        for (Item item : listaEstoque) {
                            System.out.println(item);
                        }
                    }
                    break;
                case 3:
                    System.out.println("\nSaindo do programa...");
                    break;
                default:
                    System.out.println("\nOpção inválida! Tente outra opçao.");
                    break;
            }
        } while (opcao != 3);

        scanner.close();
    }
}
