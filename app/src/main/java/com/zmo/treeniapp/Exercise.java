package com.zmo.treeniapp;

/**
 * Created by Simo on 18.3.2014.
 */
public class Exercise {

    private String name;
    private int normalSetWeight;
    private int heavySetWeight;
    private int oneRepMax;

    public Exercise(String name) {
        this.setName(name);
        setNormalSetWeight(0);
        setHeavySetWeight(0);
        setOneRepMax(0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNormalSetWeight() {
        return normalSetWeight;
    }

    public void setNormalSetWeight(int normalSetWeight) {
        this.normalSetWeight = normalSetWeight;
    }

    public int getHeavySetWeight() {
        return heavySetWeight;
    }

    public void setHeavySetWeight(int heavySetWeight) {
        this.heavySetWeight = heavySetWeight;
    }

    public int getOneRepMax() {
        return oneRepMax;
    }

    public void setOneRepMax(int oneRepMax) {
        this.oneRepMax = oneRepMax;
    }
}
