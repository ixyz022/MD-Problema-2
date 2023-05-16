package requerimiento1.sonidos;

import requerimiento1.adaptadores.SonidoBaseAdapter;


public class LanzarPoderSonidoAdapter extends SonidoBaseAdapter {
    private static final String RUTA_SONIDO = "src/requerimiento1/efectos/LANZARPODER.wav";

    public LanzarPoderSonidoAdapter() {
        super(RUTA_SONIDO);
    }
}
