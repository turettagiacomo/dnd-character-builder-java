package razze.sottorazze;

import razze.Razza;

import java.util.ArrayList;
import java.util.HashMap;

public class ElfoDeiBoschi extends Sottorazza{

    public ElfoDeiBoschi(){
        super("ElfoDeiBoschi");
    }

    @Override
    public void sovrascriviValoreVelocità(Razza razza) {
        razza.setBaseSpeed(10.5F);
    }
    @Override
    public void applicaBonusCaratteristiche(HashMap<String, Integer> stat){
        stat.put("Saggezza", stat.get("Saggezza")+1);
    }

    @Override
    public void applicaBonusArmi(ArrayList<String> weaponProficiency){
        String[] items = {"Spade corte", "Spade lunghe", "Arco corto", "Arco lungo"};
        addBonus(items, weaponProficiency);
    }

    @Override
    public void applicaBonusExtraSottorazza(ArrayList<String> extra) {
        extra.add("Puoi nascondarti nel fogliame");
    }
}
