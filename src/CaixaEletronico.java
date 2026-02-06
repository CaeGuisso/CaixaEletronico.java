import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) throws Exception {

            Scanner input = new Scanner(System.in);

            // MENU
            
            System.out.println("===CAIXA ELETRONICO DO GUISSO===");
            System.out.println("Opcoes:");
            System.out.println("1. Ver saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("Digite uma das opções abaixo:");
            var opcao = input.nextLine();
            

            String saldo = "1000";
            if (opcao.equals("1")) {
            System.out.println("===CAIXA ELETRONICO DO GUISSO===");
            System.out.println("Seu saldo é: " + saldo);
        }

        
            else if (opcao.equals("2")) {
            System.out.println("===CAIXA ELETRONICO DO GUISSO===");
            System.out.println("Insira o valor do deposito abaixo: ");
            String deposito = input.nextLine();
            
            Double deposito2 =Double.parseDouble(saldo);
            Double deposito3 = Double.parseDouble(deposito);

            var deposito4 = (deposito2 + deposito3);
            System.out.println("Agora seu saldo é: "+deposito4);
        }
            else if (opcao.equals("3")) {
            System.out.println("===CAIXA ELETRONICO DO GUISSO===");
            System.out.println("Insira o valor do saque abaixo: ");
            String saque = input.nextLine();
            
            Double saque2 =Double.parseDouble(saldo);
            Double saque3 = Double.parseDouble(saque);

            var saque4 = (saque2 - saque3);
            System.out.println("Agora seu saldo é: "+saque4);
        }
    }
}
