package requerimiento1;

// Ejemplo de cómo se podría utilizar el adaptador para reproducir efectos de sonido en el juego
public class Juego {
    private SistemaSonido sistemaSonido;

    public void setSistemaSonido(SistemaSonido sistemaSonido) {
        this.sistemaSonido = sistemaSonido;
    }

    public void jugadorAtaca() {
        // Código para que el jugador ataque
        sistemaSonido.reproducirEfecto("efecto_ataque");
    }

    public void jugadorGana() {
        // Código para que el jugador gane
        sistemaSonido.reproducirEfecto("efecto_victoria");
    }
}
