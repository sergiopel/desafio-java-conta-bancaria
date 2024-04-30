import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Conta! ");
        numero = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Por favor, digite o código da Agência! ");
        agencia = scan.nextLine();
        
        System.out.println("Por favor, digite o nome do Cliente! ");
        nomeCliente = scan.nextLine();
        
        System.out.println("Por favor, digite o saldo do Cliente! ");
        saldo = scan.nextDouble();        

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta " + 
        "em nosso banco, sua Agência é " + agencia + ", conta " + numero + 
        " e seu saldo " + saldo + " já está disponível para saque");

    }
}
