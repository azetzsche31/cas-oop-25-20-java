package ch.zhaw.homework.le01.task3;

import java.util.Objects;

public class Birne extends Obst {

    double preisProKg;
    double gewichtInKg;

    public Birne(double gewichtInKg, double preisProKg) {
        this.gewichtInKg = gewichtInKg;
        this.preisProKg = preisProKg;
    }

    @Override
    double getPreisInEuro() {
        return gewichtInKg * preisProKg;
    }

    @Override
    double getGewichtInKg() {
        return gewichtInKg;
    }

    @Override
    public Obst clone() {
        return new Birne(this.gewichtInKg, this.preisProKg);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Birne birne = (Birne) o;
        return Double.compare(preisProKg, birne.preisProKg) == 0 && Double.compare(gewichtInKg, birne.gewichtInKg) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(preisProKg, gewichtInKg);
    }




}
