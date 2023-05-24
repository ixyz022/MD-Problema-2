package requerimiento3;

import java.io.Serializable;

public class GameState implements Serializable {
    private String playerName;
    private int score;

    public GameState(String playerName, int score) {
        this.playerName = playerName;
        this.score = score;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getScore() {
        return score;
    }
}
