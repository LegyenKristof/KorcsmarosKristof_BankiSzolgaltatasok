package hu.petrik;

public class MegtakaritasiSzamla extends Szamla {
    private static int alapertelmezettKamat = 12;
    private int kamat;

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

    public void kamatJovairas(){
        this.egyenleg = (int) (this.egyenleg * (1 + alapertelmezettKamat / 100.0));
    }

    public int getKamat() {
        return kamat;
    }

    public void setKamat(int kamat) {
        this.kamat = kamat;
    }
}
