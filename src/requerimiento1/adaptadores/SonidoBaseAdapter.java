package requerimiento1.adaptadores;

import requerimiento1.SistemaSonido;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;


public abstract class SonidoBaseAdapter implements SistemaSonido {
    protected String rutaSonido;

    public SonidoBaseAdapter(String rutaSonido) {
        this.rutaSonido = rutaSonido;
    }

    @Override
    public void reproducirEfecto() {
        try {
            File archivoSonido = new File(rutaSonido);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(archivoSonido);
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            CountDownLatch latch = new CountDownLatch(1);
            clip.addLineListener(evt -> {
                if (evt.getType() == LineEvent.Type.STOP) {
                    evt.getLine().close();
                    latch.countDown();
                }
            });
            clip.start();
            latch.await();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
