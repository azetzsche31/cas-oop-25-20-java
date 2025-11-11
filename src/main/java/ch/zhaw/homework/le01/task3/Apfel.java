package ch.zhaw.homework.le01.task3;

import java.util.Objects;

public class Apfel extends Obst {

   double gewichtInKg;
   double preisProKg;

    public Apfel(double gewichtInKg, double preisProKg) {

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
        return new Apfel(this.gewichtInKg, this.preisProKg);
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Apfel apfel = (Apfel) o;
        return Double.compare(gewichtInKg, apfel.gewichtInKg) == 0 && Double.compare(preisProKg, apfel.preisProKg) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gewichtInKg, preisProKg);
    }
}
