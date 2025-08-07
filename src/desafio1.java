import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Andrei";
        String tipoConta = "Corrente";
        double saldo = 2500;
        int opcao = 0;

        System.out.println("*******************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("*******************************");

        String menu = """
                Digite a opção desejada:
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                """;

        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println(saldo);
            } else if (opcao == 2){
                System.out.println("Informe o valor a receber: ");
                double receber = leitura.nextDouble();
                System.out.println("Saldo atualizado: " + (saldo + receber));
            } else if (opcao == 3){
                System.out.println("Informe o valor que deseja transferir: ");
                double transferir = leitura.nextDouble();
                if (transferir > saldo){
                    System.out.println("Sem saldo suficiente para fazer essa transferência");
                } else {
                    System.out.println("Saldo atualizado: " + (saldo + transferir));
                }
            } else if (opcao == 4){
                System.exit(0);
            } else {
                System.out.println("Opção inválida");
            }
        }
    }
}
