import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Por favor, digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldo + " já está disponível para saque");
        scanner.close();
    }
}
