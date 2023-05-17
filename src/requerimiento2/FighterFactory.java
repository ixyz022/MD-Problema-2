package requerimiento2;

import fighters.ChoroPortenho;
import fighters.Fighter;
import fighters.MineroWarrior;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;


public class FighterFactory {
    private Map<String, Supplier<Fighter>> luchadores;

    public FighterFactory() {
        luchadores = new HashMap<>();
        luchadores.put("1", ChoroPortenho::new);
        luchadores.put("2", MineroWarrior::new);
    }

    public Fighter fighterFactory(String opcion) {
        Supplier<Fighter> luchadorSupplier = luchadores.get(opcion);
        if (luchadorSupplier != null) {
            return luchadorSupplier.get();
        } else {
            throw new IllegalArgumentException("Opción de luchador inválida");
        }
    }
}
