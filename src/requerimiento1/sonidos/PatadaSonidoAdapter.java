package requerimiento1.sonidos;

import requerimiento1.adaptadores.SonidoBaseAdapter;


public class PatadaSonidoAdapter extends SonidoBaseAdapter {
    private static final String RUTA_SONIDO = "src/requerimiento1/efectos/PATADA.wav";

    public PatadaSonidoAdapter() {
        super(RUTA_SONIDO);
    }
}
