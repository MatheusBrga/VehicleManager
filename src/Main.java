import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Detran detran = new Detran();
        int opcao;

        do{
            System.out.println("=== SISTEMA DETRAN ===\n");
            System.out.println("1 - Cadastrar Proprietário");
            System.out.println("2 - Cadastrar Veículo");
            System.out.println("3 - Buscar Veículo por Placa");
            System.out.println("4 - Listar Veículos por Proprietário");
            System.out.println("5 - Sair\n");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.print("Digite o nome do proprietário: ");
                    String cadastroProprietario = scanner.nextLine();
                    System.out.print("Digite o CPF: ");
                    String cadastroCPFProprietario = scanner.nextLine();
                    Proprietario proprietario = new Proprietario(cadastroProprietario, cadastroCPFProprietario);
                    detran.cadastrarProprietario(proprietario);
                    break;

                case 2:
                    System.out.print("Informe o CPF do proprietário: ");
                    String cpfProprietario = scanner.nextLine();
                    System.out.print("Digite a marca do veículo: ");
                    String marcaVeiculo = scanner.nextLine();
                    System.out.print("Digite o modelo: ");
                    String modeloVeiculo = scanner.nextLine();
                    System.out.print("Digite a placa: ");
                    String placaVeiculo = scanner.nextLine();
                    System.out.println("Digite o ano: ");
                    int anoVeiculo = scanner.nextInt();
                    Veiculo veiculo = new Veiculo(marcaVeiculo, modeloVeiculo, placaVeiculo, anoVeiculo);
                    detran.cadastrarVeiculo(cpfProprietario, veiculo);
                    break;

                case 3:
                    System.out.print("Informe a placa do veículo: ");
                    String buscarPorPlaca = scanner.nextLine();
                    detran.buscarVeiculoPorPlaca(buscarPorPlaca);
                    break;

                case 4:
                    System.out.print("Informe seu CPF: ");
                    String buscarPorCPF = scanner.nextLine();
                    detran.buscarVeiculoPorProprietario(buscarPorCPF);
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("você informou uma opção inválida!");
                    break;

            }

        } while(opcao != 5);

        scanner.close();
    }
}
