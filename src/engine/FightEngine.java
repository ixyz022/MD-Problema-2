package engine;

import fighters.Fighter;
import requerimiento1.SistemaSonido;
import requerimiento1.sonidos.GolpeSonidoAdapter;
import requerimiento1.sonidos.LanzarPoderSonidoAdapter;
import requerimiento1.sonidos.PatadaSonidoAdapter;
import requerimiento1.sonidos.SaltoSonidoAdapter;
import requerimiento2.FighterFactory;
import requerimiento3.Game;
import requerimiento3.GameState;
import requerimiento3.Memento;

import java.util.Scanner;

public class FightEngine {
	private Game game; // Referencia al objeto Game

	public FightEngine(Game game) {
		this.game = game;

		// Declaracion de sonidos
		SistemaSonido golpeSonido = new GolpeSonidoAdapter();
		SistemaSonido lanzarPoder = new LanzarPoderSonidoAdapter();
		SistemaSonido patadaSonidoAdapter = new PatadaSonidoAdapter();
		SistemaSonido saltoSonidoAdapter = new SaltoSonidoAdapter();

		System.out.println("Empieza el juego!!!");
		System.out.println("Selecciona tu luchador (1 o 2): 1-Choro Portenho 2-Minero Warrior ");

		Scanner seleccion = new Scanner(System.in);
		String luchadorPlayer1 = seleccion.nextLine();

		System.out.println(luchadorPlayer1);

		FighterFactory luchadorFactory = new FighterFactory();
		Fighter player1 = luchadorFactory.fighterFactory(luchadorPlayer1);

		System.out.println("Empieza la batalla");
		System.out.println("Ingresa tu acción! :1-Golpe 2-Patada 3-Salto 4-LANZAR PODER");
		String accionLuchadorIn = seleccion.nextLine();
		int accionLuchador = Integer.parseInt(accionLuchadorIn);

		// Crear instancia de GameState y Memento
		GameState currentState = new GameState(luchadorPlayer1, accionLuchador);
		Memento memento = new Memento(currentState);

		switch (accionLuchador) {
			case 1 -> {
				System.out.println(player1.golpear());
				// Reproducir un efecto de sonido
				golpeSonido.reproducirEfecto();
			}

			case 2 -> {
				System.out.println(player1.patear());
				// Reproducir un efecto de sonido
				patadaSonidoAdapter.reproducirEfecto();
			}
			case 3 -> {
				System.out.println(player1.saltar());
				// Reproducir un efecto de sonido
				saltoSonidoAdapter.reproducirEfecto();
			}
			case 4 -> {
				System.out.println(player1.lanzarPoder());
				// Reproducir un efecto de sonido
				lanzarPoder.reproducirEfecto();
			}
		}

		// Guardar el estado del juego utilizando el memento
		game.saveGame(memento);

		System.out.println("FIN DEL JUEGO. 2...");
	}
}
