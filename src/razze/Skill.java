package razze;

import java.io.Serializable;

public class Skill implements Serializable {
    private String nome;
    private String caratteristicaAssociata;
    private boolean competenza;
    private int valoreBonus;
    public Skill(String nome, String caratteristica){
        this.nome = nome;
        this.caratteristicaAssociata = caratteristica;
        this.competenza = false;
        this.valoreBonus = 0;
    }

    public String getCaratteristicaAssociata() {
        return caratteristicaAssociata;
    }

    public boolean hasCompetenza() {
        return competenza;
    }

    public void setCompetenza(boolean haCompetenza) {
        this.competenza = haCompetenza;
    }
    public int getValoreBonus() {
        return valoreBonus;
    }
    public void setValoreBonus(int valoreBonus) {
        this.valoreBonus = valoreBonus;
    }
}
