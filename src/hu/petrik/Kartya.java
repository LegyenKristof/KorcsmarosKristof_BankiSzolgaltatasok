package hu.petrik;

public class Kartya extends BankiSzolgaltatas{
    private String kartyaSzam;
    private Szamla szamla;

    public Kartya(Tulajdonos tulajdonos, String kartyaSzam, Szamla szamla) {
        super(tulajdonos);
        this.kartyaSzam = kartyaSzam;
        this.szamla = szamla;
    }

    public String getKartyaSzam() {
        return kartyaSzam;
    }

    public Szamla getSzamla() {
        return szamla;
    }

    public boolean vasarlas(int osszeg){
        return szamla.kivesz(osszeg);
    }
}
