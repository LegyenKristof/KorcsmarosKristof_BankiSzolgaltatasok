package hu.petrik;

public abstract class Szamla extends BankiSzolgaltatas {
    protected int egyenleg;

    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.egyenleg = 0;
    }

    public int getEgyenleg() {
        return egyenleg;
    }

    public void befizet(int osszeg){
        this.egyenleg += osszeg;
    }

    public abstract boolean kivesz(int osszeg);

    public abstract Kartya ujKartya(String kartyaSzam);
}
