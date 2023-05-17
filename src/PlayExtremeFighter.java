import engine.FightEngine;
import requerimiento3.*;

public class PlayExtremeFighter {
	public static void main(String[] args) {
		// Crear instancia de Game
		Game game = new Game();

		// Crear instancias de GameState y Memento
		GameState initialState = new GameState("Player 1", 100);
		Memento initialMemento = new Memento(initialState);

		// Guardar el estado inicial en el juego
		game.setCurrentState(initialState);

		// Crear instancia de FightEngine y pasar la instancia de Game como parámetro
		FightEngine fightEngine = new FightEngine(game);

		// Lógica del juego en FightEngine
		new FightEngine(game);
	}
}

