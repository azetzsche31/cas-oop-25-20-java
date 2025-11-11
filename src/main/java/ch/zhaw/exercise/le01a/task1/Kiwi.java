package ch.zhaw.exercise.le01a.task1;

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
    public String getHerkunfsland() {
        return "Neuseeland";
    }
}
