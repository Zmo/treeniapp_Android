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
        this.name = name;
        normalSetWeight = 0;
        heavySetWeight = 0;
        oneRepMax = 0;
    }
}
