package ch.zhaw.homework.le01.task3;

import java.io.Serializable;

public abstract class Obst implements Cloneable {

    abstract double getPreisInEuro();

    abstract double getGewichtInKg();

    @Override
    public abstract Obst clone();
}
