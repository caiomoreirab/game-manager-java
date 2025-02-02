package GerenciadorGames;

import java.util.ArrayList;
import java.util.Scanner;


public class ConsultarGame {

    Scanner ler = new Scanner(System.in);

    public void consultaGame(ArrayList<Game> games) {
        System.out.println("Consulte algum Game!");
        System.out.println("Nome: ");
        String nome = ler.nextLine();

        System.out.println("Editora: ");
        String editora = ler.nextLine();

        System.out.println("Ano de Lançamento: ");
        int anoLancamento = ler.nextInt();
        ler.nextLine();
        boolean gameEncontrado = false;


        for (int i = 0; i < games.size(); i++) {
            Game game = games.get(i);
            if (game.getNome().equals(nome) && game.getEditora().equals(editora) && game.getAnoLancamento() == anoLancamento) {
                gameEncontrado = true;
                System.out.println("Game: " + game.getNome() + "\nEditora: " + game.getEditora() + "\nLançamento: " + game.getAnoLancamento());
                break;
            }
        }
        if (!gameEncontrado) {
            System.out.println("Game não Encontrado!!");
        }
    }
}

