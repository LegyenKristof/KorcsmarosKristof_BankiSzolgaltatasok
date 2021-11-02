package hu.petrik;

public class Main {

    public static void main(String[] args) {

        Tulajdonos t1 = new Tulajdonos("Jancsi");
        Tulajdonos t2 = new Tulajdonos("Sanyi");

        Bank b1 = new Bank(2);

        b1.szamlaNyitas(t1, 1000);
        b1.szamlaNyitas(t1, 2000);

        b1.getSzamlaTomb()[0].befizet(1000);
        b1.getSzamlaTomb()[1].befizet(3500);



        System.out.println(b1.legnagyobbEgyenleguSzamla(t1).getEgyenleg());
        System.out.println(b1.osszEgyenleg(t1));
        System.out.println(b1.osszHitelkeret());
    }
}
