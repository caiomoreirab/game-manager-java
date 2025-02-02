package GerenciadorGames;
import java.util.ArrayList;
import  java.util.Scanner;

import java.util.Date;

public class Partida {
    Date date = new Date();

    public Partida() {

    }

    public String toString() {
        return "Partida{ Data:  " + data + " Participantes:  " + participantes + " Vencedor:  " + resultado + "}";
    }

    Scanner ler = new Scanner(System.in);
    private String data;
    private String participantes;
    private String resultado;


    public Partida(String data, String participantes, String resultado) {
        this.data = data;
        this.participantes = participantes;
        this.resultado = resultado;
    }

    public String getData() {
        return data;
    }

    public void setDate(Date date) {
        this.data = date.toString(); // Converte a data para String
    }

    public String getParticipantes() {
        return participantes;
    }

    public void setParticipantes(String participantes) {
        this.participantes = participantes;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }


    public void cadastraPartida(ArrayList<Game> games) {

        System.out.println("--Cadastro de Partida-- ");

        System.out.println("Nome do Game em que Deseja Cadastrar a Partida: ");
        String nome = ler.nextLine();

        boolean gameEncontrado = false;

        for (int i = 0; i < games.size(); i++) {
            Game game = games.get(i);
            if (game.getNome().equals(nome)) {

                gameEncontrado = true;

                System.out.println("Game Encontrado!!");

                System.out.println("Data da Partida: ");
                String data = ler.nextLine();

                System.out.println("Participantes: ");
                String participantes = ler.nextLine();

                System.out.println("Vencedor: ");
                String resultado = ler.nextLine();

                Partida partida = new Partida(data, participantes, resultado);

                if (game.getPartidas() == null) {  //resolução do erro Null. (a lista sempre será null se n for inicializada em algum lugar
                    // Certifique-se de inicializar a lista se for nula
                    game.setPartidas(new ArrayList<>());
                }

                game.getPartidas().add(partida);
                System.out.println("Partida Cadastrada com Sucesso!!");
                break;
            }
        }
        if (!gameEncontrado) {
            System.out.println("Game não Encontrado!!");
        }
    }

    public void relatorioPartidasPorGame(ArrayList<Game> games) {
        System.out.println("--Relátorio de Partidas--");
        System.out.println("Nome do Game: ");
        String nome = ler.nextLine();

        boolean gameEncontrado = false;

        for (int i = 0; i < games.size(); i++) {
            Game game = games.get(i);

            if (game.getNome().equals(nome)) {
                gameEncontrado = true;
                System.out.println("Relátório de Partidas para: " + game.getNome());
                for (int j = 0; j < game.getPartidas().size(); j++) {
                    Partida partida = game.getPartidas().get(j);
                    System.out.println(partida);
                }
            } else {
                System.out.println("Nenhuma partida Cadastrada para esse Game!!");
            }
            break;
        }

        if (!gameEncontrado) {
            System.out.println("Game não encontrado!! ");

        }
    }
}