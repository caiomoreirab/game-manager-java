package GerenciadorGames;
import java.util.ArrayList;
import java.util.Scanner;

public class CadastraGame {

    Scanner ler = new Scanner(System.in);
    private ArrayList<Game> games =  new ArrayList<>();

    public Scanner getLer() {
        return ler;
    }

    public void setLer(Scanner ler) {
        this.ler = ler;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    public void cadastraGameCompetitivo(){
        System.out.println("Cadastro de Game Competitivo: ");
        System.out.println("Nome do Game: ");
        String nome = ler.nextLine();

        System.out.println("Editora: ");
        String editora = ler.nextLine();

        System.out.println("Ano de lançamento: ");
        int anoLancamento = ler.nextInt();
        ler.nextLine();

        System.out.println("Minimo de Jogadores: ");
        int minJogadores = ler.nextInt();
        ler.nextLine();

        System.out.println("Máximo de Jogadores: ");
        int maxJogadores = ler.nextInt();
        ler.nextLine();

        System.out.println("Nível de Complexidade (de 1 a 5): ");
        int nivelComplexidade = ler.nextInt();
        ler.nextLine();

        Competitivo competitivo = new Competitivo(nome, editora, anoLancamento, minJogadores, maxJogadores, nivelComplexidade);
        games.add(competitivo);
        System.out.println(competitivo.getNome() + " Cadastrado com Sucesso!!");

    }


    public void cadastraGameCooperativo() {
        System.out.println("Cadastro de Game Cooperativo: ");
        System.out.println("Nome do Game: ");
        String nome = ler.nextLine();

        System.out.println("Editora: ");
        String editora = ler.nextLine();

        System.out.println("Ano de Lançamento: ");
        int anoLancamento = ler.nextInt();
        ler.nextLine();

        System.out.println("Máximo de Jogadores: ");
        int maxJogadores = ler.nextInt();
        ler.nextLine();

        System.out.println("Nível de Complexidade (de 1 a 5): ");
        String nivelDificuldade = ler.nextLine();

        Cooperativo cooperativo = new Cooperativo(nome, editora, anoLancamento, nivelDificuldade,maxJogadores);
        games.add(cooperativo);
        System.out.println(cooperativo.getNome() + "Adicionado com Sucesso!!");

    }

    public void cadastraGameEstrategia() {
        System.out.println("Cadastro de Game de Estratégia: ");
        System.out.println("Nome do Game: ");
        String nome = ler.nextLine();

        System.out.println("Editora: ");
        String editora = ler.nextLine();

        System.out.println("Ano de Lançamento: ");
        int anoLancamento = ler.nextInt();
        ler.nextLine();

        System.out.println("Número de Jogadores: ");
        int numJogadores = ler.nextInt();
        ler.nextLine();

        System.out.println("Tempo de Duração: ");
        double tempoDuracao = ler.nextDouble();
        ler.nextLine();

        Estrategia estrategia = new Estrategia(nome, editora, anoLancamento, numJogadores, tempoDuracao);
        games.add(estrategia);
        System.out.println(estrategia.getNome() + "Adicionado com Sucesso!!");

    }
}
