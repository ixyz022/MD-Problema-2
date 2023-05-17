package requerimiento3;

import java.util.ArrayList;
import java.util.List;


public class Game {
    private List<Memento> mementos = new ArrayList<>();
    private GameState currentState;

    // Método para guardar el estado del juego
    public void saveGame(Memento memento) {
        memento = new Memento(currentState);
        mementos.add(memento);
    }

    // Método para restaurar el estado del juego desde un memento específico
    public void restoreGame(int index) {
        Memento memento = mementos.get(index);
        currentState = memento.getState();
    }

    public void setCurrentState(GameState currentState) {
        this.currentState = currentState;
    }

    public GameState getCurrentState() {
        return currentState;
    }
}

