package requerimiento3;

public class Memento {
    private GameState state;

    public Memento(GameState state) {
        this.state = state;
    }

    public GameState getState() {
        return state;
    }
}
