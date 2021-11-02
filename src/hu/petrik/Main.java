package hu.petrik;

public class Main {

    public static void main(String[] args) {

        Tulajdonos t1 = new Tulajdonos("asd");
        HitelSzamla h1 = new HitelSzamla(t1, 1000);

        System.out.println(h1.getEgyenleg());
        h1.befizet(1000);
        h1.kivesz(2000);
        System.out.println(h1.getEgyenleg());

    }
}
