package ch.zhaw.homework.le01.task3;

public class Obstkorb {
    int anzahlFruechte = 0;

    Obst inhalt[] = new Obst[10];

    boolean legeInKorb(Obst o) {

        if(anzahlFruechte < inhalt.length) {
            System.out.println("Obst " + o + " in den Korb gelegt (Platz " + anzahlFruechte + "/" + (inhalt.length - 1) + ").");

            inhalt[anzahlFruechte] = o;
            anzahlFruechte++;
            return true;
        } else {
            System.out.println("Korb schon voll");
            return false;
        }
    }

    double getGesamtPreis() {
        double preis = 0.0;

        for (int i = 0; i < anzahlFruechte; i++) {
            preis = preis + inhalt[i].getPreisInEuro();
        }
        return preis;
    }

    void printHerkunfslaender() {
        for (int i = 0; i < anzahlFruechte; i++) {
            Obst o = inhalt[i];

            if (o instanceof Herkunfsland) {
                Herkunfsland h = (Herkunfsland) o;

                System.out.println("Obst " + o + " in Korb " + this + " kommt aus " + h.getHerkunfsland());
            } else {
                System.out.println("Obst " + o + " hat keinen Schimmer wo es herkommt");
            }
        }
    }
}
