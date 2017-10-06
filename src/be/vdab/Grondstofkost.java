package be.vdab;
public class Grondstofkost implements Kost {
    private final double eenheidsprijs;
    private final double hoeveelheidGrondstof;
    
    public Grondstofkost(double eenheidsprijs, double hoeveelheidGrondstof){
        this.eenheidsprijs = eenheidsprijs;
        this.hoeveelheidGrondstof = hoeveelheidGrondstof;
    }
    
    @Override
    public double getKost(){
        return eenheidsprijs * hoeveelheidGrondstof;
    }
    
}
