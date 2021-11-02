package hu.petrik;

public class MegtakaritasiSzamla extends Szamla {
    private static double alapertelmezettKamat = 0.12;
    private double kamat;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.kamat = alapertelmezettKamat;
    }

    @Override
    public boolean kivesz(int osszeg) {
        if (this.getEgyenleg() - osszeg < 0){
            return false;
        }
        else{
            this.egyenleg -= osszeg;
            return true;
        }
    }

    public Kartya ujKartya(String kartyaSzam) {
        return new Kartya(this.getTulajdonos(), kartyaSzam, this);
    }

    public void kamatJovairas(){
        this.egyenleg = (int) (this.egyenleg * (1 + alapertelmezettKamat));
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }
}
