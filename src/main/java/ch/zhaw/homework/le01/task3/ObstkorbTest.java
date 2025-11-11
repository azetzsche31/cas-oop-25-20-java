package ch.zhaw.homework.le01.task3;

public class ObstkorbTest {

    static void main(String[] args) {

        Obstkorb korb = new Obstkorb();
        Obstkorb korb2 = new Obstkorb();

        Apfel a1 = new Apfel(0.3, 1.5);
        Birne b1 = new Birne(0.4, 2);
        Birne b2 = new Birne(0.45, 2);

        Kiwi k1 = new Kiwi(0.35);
        Kiwi k2 = new Kiwi(0.35);
        Kiwi k3 = new Kiwi(0.35);


        korb.legeInKorb(a1);
        korb.legeInKorb(b1);
        korb.legeInKorb(k2);
        korb.legeInKorb(k3);

        korb2.legeInKorb(b2);
        korb2.legeInKorb(k1);

        System.out.println("Gesamtpreis Korb1: " + korb.getGesamtPreis() + " EUR");
        System.out.println("Gesamtpreis Korb2: " + korb2.getGesamtPreis() + " EUR");

        korb.printHerkunfslaender();
        korb2.printHerkunfslaender();

    }
}
