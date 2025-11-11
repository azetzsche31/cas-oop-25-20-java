package ch.zhaw.exercise.le01a.task1;

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
