package requerimiento3;

import java.io.*;
import java.util.Scanner;

public class Game {
    private GameState currentState;

    public void play() {
        if (currentState != null) {
            System.out.println("El juego ya está en curso. No se puede continuar.");
            return;
        }

        System.out.println("Desea continuar = 1, o cargar el estado anterior = 2");
        Scanner saveAnswer = new Scanner(System.in);
        String answer = saveAnswer.nextLine();

        if (answer.equals("1")) {
            // Realizar las acciones correspondientes al inicio de un nuevo juego
            // ...
            currentState = getCurrentGameState(); // Obtén el estado actual del juego
            solicitAction(currentState.getPlayerName());
        } else if (answer.equals("2")) {
            // Cargar el estado anterior desde el save
            Memento savedMemento = loadMemento(); // Obtén el Memento guardado
            if (savedMemento != null) {
                currentState = savedMemento.getState(); // Restaura el estado del juego
                System.out.println("Se ha cargado el estado anterior del juego.");
                solicitAction(currentState.getPlayerName());
            } else {
                System.out.println("No se encontró un estado anterior guardado.");
                // Realizar las acciones correspondientes al inicio de un nuevo juego
                // ...
                currentState = getCurrentGameState(); // Obtén el estado actual del juego
                solicitAction(currentState.getPlayerName());
            }
        } else {
            System.out.println("Respuesta inválida. No se realizará ninguna acción adicional.");
            // Realizar las acciones correspondientes al inicio de un nuevo juego
            // ...
            currentState = getCurrentGameState(); // Obtén el estado actual del juego
            solicitAction(currentState.getPlayerName());
        }
    }

    public Memento saveGame() {
        if (currentState == null) {
            System.out.println("Se ha guardado tu seleccion.");
            return null;
        }

        try {
            FileOutputStream fileOut = new FileOutputStream("game_state.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(currentState);
            out.close();
            fileOut.close();
            System.out.println("El juego ha sido guardado correctamente.");
            return new Memento(currentState); // Retorna el Memento con el estado guardado
        } catch (IOException e) {
            System.out.println("Error al guardar el juego: " + e.getMessage());
        }
        return null; // No se utiliza el Memento en este caso
    }

    private GameState getCurrentGameState() {
        // Obtén el estado actual del juego (nombre del jugador, puntaje, etc.)
        String playerName = "Ejemplo"; // Ejemplo de nombre de jugador
        int score = 1000; // Ejemplo de puntaje
        return new GameState(playerName, score);
    }

    public Memento loadMemento() {
        try {
            FileInputStream fileIn = new FileInputStream("game_state.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            GameState loadedState = (GameState) in.readObject();
            in.close();
            fileIn.close();
            return new Memento(loadedState);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar el juego: " + e.getMessage());
        }
        return null;
    }

    private void solicitAction(String playerName) {
        System.out.println("Acción del jugador " + playerName + ":");
        // Solicitar la acción al jugador y realizar las operaciones correspondientes
        // ...
    }
}
