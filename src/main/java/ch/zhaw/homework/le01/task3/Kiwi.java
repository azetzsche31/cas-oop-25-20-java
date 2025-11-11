package ch.zhaw.homework.le01.task3;

import java.util.Objects;

public class Kiwi extends Obst implements Herkunfsland {

    double preisProStueck;

    public Kiwi(double preisProStueck) {
        this.preisProStueck = preisProStueck;

    }

    @Override
    double getPreisInEuro() {
        return preisProStueck;
    }

    @Override
    double getGewichtInKg() {
        return 0;
    }



    @Override
    public String getHerkunfsland() {
        return "Neuseeland";
    }

    @Override
    public Obst clone() {
        return new Kiwi(this.preisProStueck);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Kiwi kiwi = (Kiwi) o;
        return Double.compare(preisProStueck, kiwi.preisProStueck) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(preisProStueck);
    }
}
