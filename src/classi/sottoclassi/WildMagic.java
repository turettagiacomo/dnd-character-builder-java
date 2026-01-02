package classi.sottoclassi;

import java.util.ArrayList;

public class WildMagic extends Sottoclasse{
    public WildMagic() {
        super("Wild magic");
    }

    @Override
    public void applicaPrivilegiSottoclasse(ArrayList<String> privilegiSottoclasse) {
        privilegiSottoclasse.add("Ondata di Magia Selvaggia: Dopo un incantesimo di livello 1+, il DM può farti tirare un d20. Se esce 1, tiri sulla tabella.");
        privilegiSottoclasse.add("Maree del Caos: Puoi ottenere vantaggio a un tiro per colpire, prova di caratteristica o tiro salvezza (ricarica con riposo lungo o Ondata).");
    }
}