package ch.zhaw.homework.le01.task3;

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
