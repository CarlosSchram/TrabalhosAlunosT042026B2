import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double saldo = 0;
        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\n CAIXA ELETRONICO:");
            System.out.println("1- Consultar seu saldo");
            System.out.println("2- Depositar seu dinheiro");
            System.out.println("3- Sacar o dinheiro");
            System.out.println("4- Sair do sistema");
            System.out.print("Escolha uma opcao: ");
            opcao = scan.nextInt();
            if (opcao == 1) {
                System.out.printf("Saldo atual: R$ %.2f\n", saldo);
            } else if (opcao == 2) {
                System.out.print("Digite o valor do seu deposito: R$ ");
                double deposito = scan.nextDouble();
                if (deposito > 0) {
                    saldo = saldo + deposito;
                    System.out.printf("Seu deposito foi realizado! Saldo: R$ %.2f\n", saldo);
                } else {
                    System.out.println("O valor esta invalido. O deposito precisa ser maior do que zero.");
                }
            } else if (opcao == 3) {
                System.out.print("Digite o valor do saque: R$ ");
                double saque = scan.nextDouble();
                if (saque <= 0) {
                    System.out.println("O valor esta invalido. O saque deve ser maior que zero.");
                } else if (saque > saldo) {
                    System.out.println("Saldo insuficiente.");
                } else {
                    saldo = saldo - saque;
                    System.out.printf("Seu saque foi realizado! Saldo: R$ %.2f\n", saldo);
                }
            } else if (opcao == 4) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("A opcao e invalida. Tente novamente.");
            }
        }
        scan.close();
    }
}