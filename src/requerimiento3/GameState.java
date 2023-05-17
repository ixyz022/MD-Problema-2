package requerimiento3;

public class GameState {
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
