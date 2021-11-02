package hu.petrik;

public class Bank {
    private Szamla[] szamlaTomb;
    private int szamlaTombIndex = 0;

    public Bank(int szamlaTombMeret) {
        this.szamlaTomb = new Szamla[szamlaTombMeret];
    }

    public Szamla szamlaNyitas(Tulajdonos tulajdonos, double hitelkeret){
        if (szamlaTombIndex < szamlaTomb.length){
            if (hitelkeret <= 1){
                MegtakaritasiSzamla szamla = new MegtakaritasiSzamla(tulajdonos);
                szamla.setKamat(hitelkeret);
                szamlaTomb[szamlaTombIndex] = szamla;
                szamlaTombIndex++;
                return szamla;
            }
            else{
                HitelSzamla szamla = new HitelSzamla(tulajdonos, (int) hitelkeret);
                szamlaTomb[szamlaTombIndex] = szamla;
                szamlaTombIndex++;
                return szamla;
            }
        }
        else{
            return null;
        }
    }

    public Szamla[] getSzamlaTomb() {
        return szamlaTomb;
    }

    public int osszEgyenleg(Tulajdonos tulajdonos){
        int osszeg = 0;
        for (Szamla sz: szamlaTomb) {
            if (sz.getTulajdonos() == tulajdonos){
                osszeg += sz.getEgyenleg();
            }
        }
        return osszeg;
    }

    public Szamla legnagyobbEgyenleguSzamla(Tulajdonos tulajdonos){
        int index = 0;
        for (int i = 0; i < szamlaTomb.length; i++){
            if (szamlaTomb[i].getEgyenleg() > szamlaTomb[index].getEgyenleg()){
                index = i;
            }
        }
        return szamlaTomb[index];
    }

    public int osszHitelkeret(){
        int osszeg = 0;
        for (Szamla sz: szamlaTomb) {
            if (sz instanceof HitelSzamla){
                osszeg += ((HitelSzamla) sz).getHitelkeret();
            }
        }
        return osszeg;
    }
}
