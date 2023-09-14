import java.util.Scanner;
public class ContaTerminal {
    public static void main (String[]args){

        Scanner scanner = new Scanner(System.in);

        int conta ;
        String agencia ;
        String nomeCliente;
        double saldo ;

        System.out.println(" Digite o número da conta ");
        conta = scanner.nextInt();

        System.out.println(" Digite o número da Agência");
        agencia = scanner.next();

        System.out.println(" Digite o nome do Cliente ");
        nomeCliente = scanner.next();

        System.out.println(" digite o saldo ");
        saldo = scanner.nextDouble();

        System.out.println(" Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + conta + " e seu saldo é " + saldo + " disponível para saque");


    }
}

