import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner opcao = new Scanner(System.in);

        String nome = "Juliana Ribas";
        String tipoConta = "Corrente";
        int escolha = 0;
        double saldo = 5000;

        System.out.println("\n--------------------------");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("\n---------------------------");

        while (escolha != 4){
            System.out.println("----Menu----");
            System.out.println("1. Consultar saldos ");
            System.out.println("2. Depósito ");
            System.out.println("3. Transferência ");
            System.out.println("4. Sair ");
            System.out.println("Digite a opção desejada: ");
            escolha = opcao.nextInt();

            if (escolha == 1){
                System.out.println("Seu saldo atualizado é " + saldo);

            } else if (escolha == 2) {
                System.out.println("Digite o valor do depósito: ");
                saldo += opcao.nextDouble();
                System.out.println("Novo saldo: " + saldo);
            } else if (escolha == 3) {
                System.out.println("Digite o valor da transferência:");
                double valor = opcao.nextDouble();
                if (valor > saldo){
                    System.out.println("Não há saldo suficiente.");
                } else {
                    saldo -= opcao.nextDouble();
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (escolha != 4) {
                System.out.println("Opção inválida.");
            }
        }
    }
}