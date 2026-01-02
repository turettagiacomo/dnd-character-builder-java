package classi.sottoclassi;

import java.util.ArrayList;

public class DraconicBloodline extends Sottoclasse{
    private String tipoDanno;

    public DraconicBloodline(String discendenza) {
        super("Discendenza draconica");
        tipoDanno = "";
        switch (discendenza.toLowerCase()) {
            case "nero":
                tipoDanno = "Acido";
                break;
            case "blu":
                tipoDanno = "Fulmine";
                break;
            case "ottone":
                tipoDanno = "Fuoco";
                break;
            case "bronzo":
                tipoDanno = "Fulmine";
                break;
            case "rame":
                tipoDanno = "Fuoco";
                break;
            case "oro":
                tipoDanno = "Acido";
                break;
            case "verde":
                tipoDanno = "Veleno";
                break;
            case "rosso":
                tipoDanno = "Fuoco";
                break;
            case "argento":
                tipoDanno = "Gelo";
                break;
            case "bianco":
                tipoDanno = "Gelo";
                break;
        }
    }

    @Override
    public void addResistance(ArrayList<String> resistance) {
        String[] items = {"Resistenza a danni da: " + tipoDanno.toLowerCase() + " (da discendenza draconica)"};
        addBonus(items, resistance);
    }

    @Override
    public void applicaPrivilegiSottoclasse(ArrayList<String> privilegiSottoclasse){
        privilegiSottoclasse.add("Se fai una prova abilità su carisma contro un drago hai 2x bonus competenza");
    }
}
