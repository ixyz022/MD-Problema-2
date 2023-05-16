package requerimiento1.sonidos;

import requerimiento1.adaptadores.SonidoBaseAdapter;


public class GolpeSonidoAdapter extends SonidoBaseAdapter {
    private static final String RUTA_SONIDO = "src/requerimiento1/efectos/GOLPE.wav";

    public GolpeSonidoAdapter() {
        super(RUTA_SONIDO);
    }
}
