package hu.petrik;

public class Main {

    public static void main(String[] args) {

        Tulajdonos t1 = new Tulajdonos("asd");
        MegtakaritasiSzamla h1 = new MegtakaritasiSzamla(t1);

        System.out.println(h1.getEgyenleg());
        h1.befizet(561);
        h1.kamatJovairas();
        System.out.println(h1.getEgyenleg());

    }
}
