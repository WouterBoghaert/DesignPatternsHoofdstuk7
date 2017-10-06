package be.vdab;
public class Arbeidskost implements Kost {
    private final double uurloon;
    private final int aantalGepresteerdeUren;
    
    public Arbeidskost(double uurloon, int aantalGepresteerdeUren){
        this.uurloon = uurloon;
        this.aantalGepresteerdeUren = aantalGepresteerdeUren;
    }
    
    @Override
    public double getKost(){
        return uurloon * aantalGepresteerdeUren;
    }
}
