package be.vdab;

import java.util.ArrayList;
import java.util.List;

public class BouwProject implements Kost {
    private final List<Kost> kosten = new ArrayList<>();
    
    public void add(Kost kost){
        kosten.add(kost);
    }
    
    @Override
    public double getKost(){
        double totaleKost = 0;
        for (Kost kost: kosten){
            totaleKost += kost.getKost();
        }
        return totaleKost;
    }   
}
