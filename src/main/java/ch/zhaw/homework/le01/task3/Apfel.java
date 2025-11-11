package ch.zhaw.homework.le01.task3;

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
}
