import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
       Scanner scanner = new Scanner(System.in);

       int agencia;
       String conta;
       String nomeCliente = "MARIO ANDRADE";
       double saldo = 237.48;

       System.out.println("Por favor, digite o número da Agência !");
       agencia = scanner.nextInt();  //Exemplo digitado pelo usuário 4563

       System.out.println("Por favor, digite o número da Conta !");
       scanner.nextLine();
       conta = scanner.nextLine(); //Exemplo digitado pelo usuário 123-4


        System.out.println("Olá "+nomeCliente+", obrigado por acessar sua conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo "+saldo+" já está disponível para saque");
    }
}
