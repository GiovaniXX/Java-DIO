import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Criar Conta Corrente");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Consultar Saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Titular: ");
                    String nome = sc.nextLine();
                    System.out.print("Número da Conta: ");
                    String numero = sc.nextLine();
                    Conta conta = new ContaCorrente(nome, numero);
                    banco.adicionarConta(conta);
                    System.out.println("Conta criada com sucesso!");
                }
                case 2 -> {
                    System.out.print("Número da Conta: ");
                    String numero = sc.nextLine();
                    Conta conta = banco.buscarConta(numero);
                    if (conta != null) {
                        System.out.print("Valor a depositar: ");
                        double valor = sc.nextDouble();
                        conta.depositar(valor);
                        System.out.println("Depósito realizado!");
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                }
                case 3 -> {
                    System.out.print("Número da Conta: ");
                    String numero = sc.nextLine();
                    Conta conta = banco.buscarConta(numero);
                    if (conta != null) {
                        System.out.print("Valor a sacar: ");
                        double valor = sc.nextDouble();
                        if (conta.sacar(valor)) {
                            System.out.println("Saque realizado!");
                        } else {
                            System.out.println("Saldo insuficiente.");
                        }
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                }
                case 4 -> {
                    System.out.print("Conta origem: ");
                    String origem = sc.nextLine();
                    System.out.print("Conta destino: ");
                    String destino = sc.nextLine();
                    Conta contaOrigem = banco.buscarConta(origem);
                    Conta contaDestino = banco.buscarConta(destino);
                    if (contaOrigem != null && contaDestino != null) {
                        System.out.print("Valor a transferir: ");
                        double valor = sc.nextDouble();
                        if (contaOrigem.transferir(valor, contaDestino)) {
                            System.out.println("Transferência realizada!");
                        } else {
                            System.out.println("Falha na transferência.");
                        }
                    } else {
                        System.out.println("Contas inválidas.");
                    }
                }
                case 5 -> {
                    System.out.print("Número da Conta: ");
                    String numero = sc.nextLine();
                    Conta conta = banco.buscarConta(numero);
                    if (conta != null) {
                        System.out.println("Saldo: R$ " + conta.getSaldo());
                    } else {
                        System.out.println("Conta não encontrada.");
                    }
                }
                case 0 -> {
                    System.out.println("Saindo... até logo!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}

