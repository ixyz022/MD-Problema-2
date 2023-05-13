package requerimiento1;

// Ejemplo de cómo se podría utilizar los adaptadores en el juego
public class Main {
    public static void main(String[] args) {
        // Crear el juego
        Juego juego = new Juego();

        // Crear un adaptador para el sistema de sonido de OpenAL y establecerlo como el sistema de sonido del juego
        SistemaSonido openALAdapter = new OpenALSistemaSonidoAdapter();
        juego.setSistemaSonido(openALAdapter);

        // El jugador ataca y se reproduce un efecto de sonido utilizando el sistema de sonido de OpenAL
        juego.jugadorAtaca();

        // Cambiar el sistema de sonido del juego por uno basado en DirectX
        SistemaSonido directXAdapter = new DirectXSistemaSonidoAdapter();
        juego.setSistemaSonido(directXAdapter);

        // El jugador gana y se reproduce un efecto de sonido utilizando el sistema de sonido de DirectX
        juego.jugadorGana();
    }
}
