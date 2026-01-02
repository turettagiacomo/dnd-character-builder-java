package razze;

import java.util.ArrayList;
import java.util.HashMap;

public class Dragonborn extends Razza {
    private String tipoDanno;
    private String tipoSoffio;

    //costruttore della Classe nano @super serve perchè è sottoclasse di Razza
    public Dragonborn(String discendenza){
        super("Dragonborn", 9, false);

        //applicazione bonus da discendenza draconica
        tipoDanno = "";
        tipoSoffio = "";
        switch (discendenza) {
            case "Nero":
                tipoDanno = "Acido";
                tipoSoffio = "1.5m x 9m linea";
                break;
            case "Blu":
                tipoDanno = "Fulmine";
                tipoSoffio = "1.5m x 9m linea";
                break;
            case "Ottone":
                tipoDanno = "Fuoco";
                tipoSoffio = "1.5m x 9m linea";
                break;
            case "Bronzo":
                tipoDanno = "Fulmine";
                tipoSoffio = "1.5m x 9m linea";
                break;
            case "Rame":
                tipoDanno = "Fuoco";
                tipoSoffio = "1.5m x 9m linea";
                break;
            case "Oro":
                tipoDanno = "Acido";
                tipoSoffio = "4.5m cono";
                break;
            case "Verde":
                tipoDanno = "Veleno";
                tipoSoffio = "4.5m cono";
                break;
            case "Rosso":
                tipoDanno = "Fuoco";
                tipoSoffio = "4.5m cono";
                break;
            case "Argento":
                tipoDanno = "Gelo";
                tipoSoffio = "4.5m cono";
                break;
            case "Bianco":
                tipoDanno = "Gelo";
                tipoSoffio = "4.5m cono";
                break;
        }
    }
    @Override
    public void applicaBonusRazziali(HashMap<String, Integer> stat) {
        stat.put("Forza",stat.get("Forza")+2);
        stat.put("Carisma",stat.get("Carisma")+1);
    }
    @Override
    public void knownLanguages(ArrayList<String> languages) {
        String[] items = {"Comune", "Draconico"};
        addBonus(items, languages);
    }
    @Override
    public void applicaResistenze(ArrayList<String> resistance) {
        resistance.add("Resistenza a danni da: " + tipoDanno.toLowerCase() + " (da discendenza draconica)");
    }
    @Override
    public void applicaBonusExtra(ArrayList<String> extras) {
        extras.add("Arma a Soffio (Azione): " +tipoSoffio + " di " + tipoDanno + ". TS (CD 8 + Mod COS + Comp). " + "Danno: 2d6 (salva per dimezzare)");
    }
}