package be.vdab;

import java.util.ArrayList;
import java.util.List;

public class Tekening implements Figuur {
    private final List<Figuur> figuren = new ArrayList<>();
    public void add(Figuur figuur){
        figuren.add(figuur);
    }
    @Override
    public double getOppervlakte(){
        double oppervlakte = 0;
        for (Figuur figuur: figuren){
            oppervlakte += figuur.getOppervlakte();
        }
        return oppervlakte;
    }
}
