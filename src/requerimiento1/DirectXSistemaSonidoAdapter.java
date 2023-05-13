package requerimiento1;

import requerimiento1.sonidos.DirectXSistemaSonido;

// Clase que actúa como adaptador entre la interfaz "SistemaSonido" y el sistema de sonido de DirectX
public class DirectXSistemaSonidoAdapter implements SistemaSonido {
    private DirectXSistemaSonido directXSystem;

    public DirectXSistemaSonidoAdapter() {
        this.directXSystem = new DirectXSistemaSonido();
    }

    public void reproducirEfecto(String efecto) {
        this.directXSystem.PlaySound(efecto);
    }
}
