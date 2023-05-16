package engine;

import fighters.ChoroPortenho;
import fighters.MineroWarrior;
import requerimiento1.SistemaSonido;
import requerimiento1.sonidos.GolpeSonidoAdapter;
import requerimiento1.sonidos.LanzarPoderSonidoAdapter;
import requerimiento1.sonidos.PatadaSonidoAdapter;
import requerimiento1.sonidos.SaltoSonidoAdapter;

import java.util.Scanner;

public class FightEngine {
	public FightEngine(){
		String luchadorPlayer1;
		String accionLuchadorIn;
		int accionLuchador;
		String opcionChoroPortenho = "1";
		String opcionMineroWarrior = "2";

		// Declaracion de sonidos
		SistemaSonido golpeSonido = new GolpeSonidoAdapter();
		SistemaSonido lanzarPoder = new LanzarPoderSonidoAdapter();
		SistemaSonido patadaSonidoAdapter = new PatadaSonidoAdapter();
		SistemaSonido saltoSonidoAdapter = new SaltoSonidoAdapter();


		System.out.println("Empieza el juego!!!");
		System.out.println("Selecciona tu luchador (1 o 2): 1-Choro Portenho 2-Minero Warrior ");

		Scanner seleccion = new Scanner(System.in);

		luchadorPlayer1 = seleccion.nextLine();

		System.out.println(luchadorPlayer1);

		if (luchadorPlayer1.equals(opcionChoroPortenho)){
				System.out.println("Choro Portenho inicia a batalla!");
				ChoroPortenho player1CP = new ChoroPortenho();

				System.out.println("Ingresa tu accion! :1-Golpe 2-Patada 3-Salto 4-LANZAR PODER");
				accionLuchadorIn =seleccion.nextLine();
				accionLuchador = Integer.parseInt(accionLuchadorIn);

			switch (accionLuchador) {
				case 1 -> {
					System.out.println(player1CP.golpear());
					// Reproducir un efecto de sonido
					golpeSonido.reproducirEfecto();
				}

				case 2 -> {
					System.out.println(player1CP.patear());
					// Reproducir un efecto de sonido
					lanzarPoder.reproducirEfecto();
				}
				case 3 -> {
					System.out.println(player1CP.saltar());
					// Reproducir un efecto de sonido
					saltoSonidoAdapter.reproducirEfecto();
				}
				case 4 -> {
					System.out.println(player1CP.lanzarPoder());
					// Reproducir un efecto de sonido
					lanzarPoder.reproducirEfecto();
				}
			}
		}

		if (luchadorPlayer1.equals(opcionMineroWarrior)){
			System.out.println("Minero Warrior inicia a batalla!");

			MineroWarrior player1MW = new MineroWarrior();

			System.out.println("Ingresa tu accion! :1-Golpe 2-Patada 3-Salto 4-LANZAR PODER");
			accionLuchadorIn =seleccion.nextLine();
			accionLuchador = Integer.parseInt(accionLuchadorIn);

			switch (accionLuchador) {
				case 1 -> System.out.println(player1MW.golpear());
				case 2 -> System.out.println(player1MW.patear());
				case 3 -> System.out.println(player1MW.saltar());
				case 4 -> System.out.println(player1MW.lanzarPoder());
			}

		}

		System.out.println("FIN DEL JUEGO. 2...");

	}

}
