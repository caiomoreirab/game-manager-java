package GerenciadorGames;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        CadastraGame cadastraGame = new CadastraGame();
        ConsultarGame consultarGame = new ConsultarGame();
        Partida partida = new Partida();

        boolean continuar = true;

        while (continuar) {
            System.out.println("======================================================");
            System.out.println("========= Bem vindo ao Gerenciador de Games ==========");
            System.out.println("======================================================");
            System.out.println("1. Cadastrar Game. ");
            System.out.println("2. Consultar Game. ");
            System.out.println("3. Registrar Partida. ");
            System.out.println("4. Relatório de Partidas. ");
            System.out.println("5. Sair. ");
            System.out.println("Digite uma opção: ");

            int opcao;
            try {
                opcao = Integer.parseInt(ler.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor, digite um número válido!");
                continue;
            }

            switch (opcao) {
                case 1:
                    boolean submenu = true;
                    while (submenu) {
                        System.out.println("Qual tipo de Game deseja Cadastrar:");
                        System.out.println("===================================");
                        System.out.println("1. Game Competitivo");
                        System.out.println("2. Game Cooperativo");
                        System.out.println("3. Game Estratégia");
                        System.out.println("4. Voltar ao menu principal");
                        System.out.println("Escolha uma opção: ");

                        int opcao2;
                        try {
                            opcao2 = Integer.parseInt(ler.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Por favor, digite um número válido!");
                            continue;
                        }

                        switch (opcao2) {
                            case 1:
                                cadastraGame.cadastraGameCompetitivo();
                                break;
                            case 2:
                                cadastraGame.cadastraGameCooperativo();
                                break;
                            case 3:
                                cadastraGame.cadastraGameEstrategia();
                                break;
                            case 4:
                                submenu = false;
                                break;
                            default:
                                System.out.println("Opção inválida!");
                        }
                    }
                    break;
                case 2:
                    consultarGame.consultaGame(cadastraGame.getGames());
                    break;
                case 3:
                    partida.cadastraPartida(cadastraGame.getGames());
                    break;
                case 4:
                    partida.relatorioPartidasPorGame(cadastraGame.getGames());
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        ler.close();
    }
}
