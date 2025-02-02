package GerenciadorGames;

public class Competitivo extends Game {
    public Competitivo(String nome, String editora, int anoLancamento) {
        super(nome, editora, anoLancamento);
    }

    private int minJogadores;
    private  int maxJogadores;
    private int nivelComplexidade; //de 1 a 5 por exemplo;

    public Competitivo(String nome, String editora, int anoLancamento, int minJogadores, int maxJogadores, int nivelComplexidade) {
        super(nome, editora, anoLancamento);
        this.minJogadores = minJogadores;
        this.maxJogadores = maxJogadores;
        this.nivelComplexidade = nivelComplexidade;
    }

    public int getMinJogadores() {
        return minJogadores;
    }

    public void setMinJogadores(int minJogadores) {
        this.minJogadores = minJogadores;
    }

    public int getMaxJogadores() {
        return maxJogadores;
    }

    public void setMaxJogadores(int maxJogadores) {
        this.maxJogadores = maxJogadores;
    }

    public int getNivelComplexidade() {
        return nivelComplexidade;
    }

    public void setNivelComplexidade(int nivelComplexidade) {
        this.nivelComplexidade = nivelComplexidade;
    }


}
