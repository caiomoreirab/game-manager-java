package GerenciadorGames;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private String nome;
    private String editora;
    private int anoLancamento;

    private ArrayList<Partida> partidas;

    public Game(ArrayList<Partida> partidas) {
        this.partidas = partidas;
    }

    public ArrayList<Partida> getPartidas() {
        return partidas;
    }

    public void setPartidas(ArrayList<Partida> partidas) {
        this.partidas = partidas;
    }

    public Game(String nome, String editora, int anoLancamento) {
        this.nome = nome;
        this.editora = editora;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}


