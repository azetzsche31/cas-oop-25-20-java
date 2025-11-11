package ch.zhaw.homework.le01.task3;

import java.util.Arrays;

public class Obstkorb implements Cloneable, Comparable<Obstkorb> {

    public Obstkorb() {
    }

    public Obstkorb(Obstkorb other) {}
    this.anzahlFruechte = other.anzahlFruechte;
    this.obst = new Obst[other.obst.length];
    for(int i = 0; i < other.anzahlFruechte; i++) {
        this.obst[i] = other.obst[i].clone();
    }

    int anzahlFruechte = 0;
    Obst [] obst = new Obst[10];

    boolean legeInKorb(Obst o) {

        if(anzahlFruechte < obst.length) {
            //System.out.println("Obst " + o + " in den Korb gelegt (Platz " + anzahlFruechte + "/" + (inhalt.length - 1) + ").");

            obst[anzahlFruechte] = o;
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
            preis = preis + obst[i].getPreisInEuro();
        }
        return Math.round(preis * 100.0) / 100.0;
    }

    public double getGewichtInKg() {
        double gewicht = 0.0;

        for (int i = 0; i < anzahlFruechte; i++) {
            gewicht = gewicht + obst[i].getGewichtInKg();
        }
        return Math.round(gewicht * 100.0) / 100.0;
    }

    void printHerkunfslaender() {
        for (int i = 0; i < anzahlFruechte; i++) {
            Obst o = obst[i];

            if (o instanceof Herkunfsland) {
                Herkunfsland h = (Herkunfsland) o;

                System.out.println("Obst " + o + " in Korb " + this + " kommt aus " + h.getHerkunfsland());
            } else {
                System.out.println("Obst " + o + " hat keinen Schimmer wo es herkommt");
            }
        }
    }

    @Override
    public Obstkorb clone() {
        try {
            Obstkorb cloned = (Obstkorb) super.clone();
            cloned.obst = new Obst(this.obst.length);
            for (int i = 0; i < this.anzahlFruechte; i++) {
            }
            // anzahlFruechte bleibt gleich
            cloned.anzahlFruechte = this.anzahlFruechte;
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Clone nicht unterstützt", e);
        }
    }

    @Override
    public int compareTo(Obstkorb o) {
        return 0;
    }
}
