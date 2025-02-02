package GerenciadorGames;

public class Cooperativo extends Game{
    public Cooperativo(String nome, String editora, int anoLancamento) {
        super(nome, editora, anoLancamento);
    }

    private String nivelDificuldade;
    private int maxJogadores;

    public Cooperativo(String nome, String editora, int anoLancamento, String nivelDificuldade, int maxJogadores) {
        super(nome, editora, anoLancamento);
        this.nivelDificuldade = nivelDificuldade;
        this.maxJogadores = maxJogadores;
    }

    public String getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(String nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    public int getMaxJogadores() {
        return maxJogadores;
    }

    public void setMaxJogadores(int maxJogadores) {
        this.maxJogadores = maxJogadores;
    }
}
