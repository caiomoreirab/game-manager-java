package GerenciadorGames;

public class Estrategia extends Game{
    public Estrategia(String nome, String editora, int anoLancamento) {
        super(nome, editora, anoLancamento);
    }

    private int numJogadores;
    private double tempoDuracao;

    public Estrategia(String nome, String editora, int anoLancamento, int numJogadores, double tempoDuracao) {
        super(nome, editora, anoLancamento);
        this.numJogadores = numJogadores;
        this.tempoDuracao = tempoDuracao;
    }

    public int getNumJogadores() {
        return numJogadores;
    }

    public void setNumJogadores(int numJogadores) {
        this.numJogadores = numJogadores;
    }

    public double getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(double tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }
}
