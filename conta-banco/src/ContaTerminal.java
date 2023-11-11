import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
            
        Scanner sc = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        System.out.println("Por favor Insira o seu número de Conta: ");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor Insira o seu número de Agência:");
        agencia = sc.nextLine();

        System.out.println("Por favor Insira o seu nome:");
        nomeCliente =sc.nextLine();

        System.out.println("Por favor Insira o seu Saldo:");
        saldo = sc.nextFloat();
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
        sc.close();
    }
}
