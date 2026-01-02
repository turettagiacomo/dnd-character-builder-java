package classi.sottoclassi;

import java.util.ArrayList;

public class TrickeryDomain extends Sottoclasse{
    public TrickeryDomain() {
        super("Dominio dell'inganno");
    }

    @Override
    public void addSpell(ArrayList<String> incantesimiConosciuti) {
        String[] items = {"Charm su persone", "Travestirsi"};
        addBonus(items, incantesimiConosciuti);
    }

    @Override
    public void applicaPrivilegiSottoclasse(ArrayList<String> privilegiSottoclasse) {
        privilegiSottoclasse.add("Benedizione dell'Ingannatore: Con un'azione tocchi una creatura (non te stesso) per darle vantaggio alle prove di Furtività per 1 ora.");
    }
}
