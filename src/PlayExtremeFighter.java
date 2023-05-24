import engine.FightEngine;
import requerimiento3.Game;
import requerimiento3.Memento;
import requerimiento3.GameState;

public class PlayExtremeFighter {
	public static void main(String[] args) {
		// Crear instancia de Game
		Game game = new Game();

		// Crear instancias de GameState y Memento
		GameState initialState = new GameState("Player 1", 0);
		Memento initialMemento = new Memento(initialState);

		// Crear objeto FightEngine pasando la instancia de Game
		FightEngine fightEngine = new FightEngine(game);
	}
}
