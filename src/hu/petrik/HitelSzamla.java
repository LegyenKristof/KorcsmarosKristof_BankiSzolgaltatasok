package hu.petrik;

public class HitelSzamla extends Szamla{
    private int hitelkeret;

    public HitelSzamla(Tulajdonos tulajdonos, int hitelkeret) {
        super(tulajdonos);
        this.hitelkeret = hitelkeret;
    }

    public int getHitelkeret() {
        return hitelkeret;
    }

    @Override
    public Kartya ujKartya(String kartyaSzam) {
        return new Kartya(this.getTulajdonos(), kartyaSzam, this);
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
