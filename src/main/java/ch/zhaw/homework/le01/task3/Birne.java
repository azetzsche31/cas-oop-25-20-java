package ch.zhaw.homework.le01.task3;

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
}
