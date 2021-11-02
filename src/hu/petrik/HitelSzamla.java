package hu.petrik;

public class HitelSzamla extends Szamla{
    private int hitelkeret;

    public HitelSzamla(Tulajdonos tulajdonos, int hitelkeret) {
        super(tulajdonos);
        this.hitelkeret = hitelkeret;
    }

    @Override
    public boolean kivesz(int osszeg) {
        if (this.getEgyenleg() - osszeg < this.hitelkeret * (-1)){
            return false;
        }
        else{
            this.egyenleg -= osszeg;
            return true;
        }
    }
}
