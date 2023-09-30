import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBanco contaBanco = new ContaBanco();

        System.out.println("Bem-vindo ao sistema de criação de conta bancária!");

        System.out.print("Por favor, digite o nome do cliente: ");
        contaBanco.cliente(scanner.nextLine());

        System.out.print("Por favor, digite o número da agência: ");
        contaBanco.agenciaCli(scanner.nextLine());

        System.out.print("Por favor, digite o número da conta: ");
        contaBanco.numeroUsu(scanner.nextInt());

        System.out.print("Por favor, digite o saldo inicial: ");
        contaBanco.saldoConta(scanner.nextDouble());

        // Limpeza do buffer
        scanner.nextLine();

        contaBanco.imprimir();

        scanner.close();
    }
}
