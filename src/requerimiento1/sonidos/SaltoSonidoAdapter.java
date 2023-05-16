package requerimiento1.sonidos;

import requerimiento1.adaptadores.SonidoBaseAdapter;


public class SaltoSonidoAdapter extends SonidoBaseAdapter {
    private static final String RUTA_SONIDO = "src/requerimiento1/efectos/SALTAR.wav";

    public SaltoSonidoAdapter() {
        super(RUTA_SONIDO);
    }
}
