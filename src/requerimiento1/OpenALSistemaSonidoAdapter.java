package requerimiento1;

import requerimiento1.sonidos.OpenALSistemaSonido;

// Clase que actúa como adaptador entre la interfaz "SistemaSonido" y el sistema de sonido de OpenAL
public class OpenALSistemaSonidoAdapter implements SistemaSonido {
    private OpenALSistemaSonido openALSystem;

    public OpenALSistemaSonidoAdapter() {
        this.openALSystem = new OpenALSistemaSonido();
    }

    public void reproducirEfecto(String efecto) {
        this.openALSystem.playEffect(efecto);
    }
}
