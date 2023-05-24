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

		// Crear instancia de GameState y Memento
		GameState currentState = new GameState(luchadorPlayer1, 0);
		Memento memento = new Memento(currentState);

		// Guardar el estado del juego utilizando el memento
		game.saveGame();

		FighterFactory luchadorFactory = new FighterFactory();
		Fighter player1 = luchadorFactory.fighterFactory(luchadorPlayer1);

		boolean continuar = true;
		while (continuar) {
			System.out.println("Empieza la batalla");
			System.out.println("Ingresa tu acción! :1-Golpe 2-Patada 3-Salto 4-LANZAR PODER");
			String accionLuchadorIn = seleccion.nextLine();
			int accionLuchador = Integer.parseInt(accionLuchadorIn);

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

			System.out.println("Desea continuar = 1, o cargar el estado anterior = 2");
			String answer = seleccion.nextLine();

			if (answer.equals("1")) {
				System.out.println("Continuando el juego...");
				continuar = false; // Salir del bucle
			} else if (answer.equals("2")) {
				// Cargar el estado anterior desde el save
				Memento savedMemento = game.loadMemento();
				if (savedMemento != null) {
					currentState = savedMemento.getState();
					luchadorPlayer1 = currentState.getPlayerName();
					System.out.println("Se ha cargado el estado anterior del juego.");
				} else {
					System.out.println("No se encontró un estado anterior guardado.");
				}
			} else {
				System.out.println("Respuesta inválida. No se realizará ninguna acción adicional.");
			}
		}

		System.out.println("FIN DEL JUEGO. ...");
	}
}
