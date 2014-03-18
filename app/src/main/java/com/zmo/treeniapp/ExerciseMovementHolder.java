package com.zmo.treeniapp;

import java.util.HashMap;
import java.util.Random;

/**
 * Created by Simo on 18.3.2014.
 */
public class ExerciseMovementHolder {

    private HashMap<Integer, Exercise> chestExercises = new HashMap<Integer, Exercise>();
    private HashMap<Integer, Exercise> legExercises = new HashMap<Integer, Exercise>();
    private HashMap<Integer, Exercise> shoulderExercises = new HashMap<Integer, Exercise>();
    private HashMap<Integer, Exercise> tricepExercises = new HashMap<Integer, Exercise>();
    private HashMap<Integer, Exercise> bicepExercises = new HashMap<Integer, Exercise>();
    private HashMap<Integer, Exercise> backExercises = new HashMap<Integer, Exercise>();
    private HashMap<Integer, Exercise> abExercises = new HashMap<Integer, Exercise>();

    Random r;

    public ExerciseMovementHolder() {
        chestExercises.put(1, new Exercise("Penkki"));
        chestExercises.put(2, new Exercise("Penkki käsipainoilla"));
        chestExercises.put(3, new Exercise("Vinopenkki"));
        chestExercises.put(4, new Exercise("Vinopenkki käsipainoilla"));

        legExercises.put(1, new Exercise("Mave"));
        legExercises.put(2, new Exercise("Kyykky"));
        legExercises.put(3, new Exercise("Pohjelaite (istualteen)"));
        legExercises.put(4, new Exercise("Pohjelaite (seisaaltaan)"));
        legExercises.put(5, new Exercise("Takajalkalaite"));

        shoulderExercises.put(1, new Exercise("Pystypunnerrus tangolla"));
        shoulderExercises.put(2, new Exercise("Pystypunnerrus käsipainoilla"));
        shoulderExercises.put(3, new Exercise("Olankohautus"));
        shoulderExercises.put(4, new Exercise("Vipunosto sivulle"));

        tricepExercises.put(1, new Exercise("Dipit"));
        tricepExercises.put(2, new Exercise("Ranskalainen punnerrus"));
        tricepExercises.put(3, new Exercise("Penkki kapealla otteella"));
        tricepExercises.put(4, new Exercise("Taljassa narulla"));

        bicepExercises.put(1, new Exercise("Hauiskääntö tangolla"));
        bicepExercises.put(2, new Exercise("Vasarakäännöt käsipainoilla"));
        bicepExercises.put(3, new Exercise("21:t tangolla"));
        bicepExercises.put(4, new Exercise("Taljassa narulla"));

        backExercises.put(1, new Exercise("Soutu tangolla"));
        backExercises.put(2, new Exercise("Soutu käsipainolla"));
        backExercises.put(3, new Exercise("Leuanveto myötäotteella"));
        backExercises.put(4, new Exercise("Ylätalja"));
        backExercises.put(5, new Exercise("Alatalja"));

        abExercises.put(1, new Exercise("Dragon flag"));
        abExercises.put(2, new Exercise("Windshield wipers"));
        abExercises.put(3, new Exercise("Pyöräilijä"));
        abExercises.put(4, new Exercise("Voimapyörä"));

        r = new Random();
    }


    public HashMap<Integer, Exercise> getChestExercises() {
        return chestExercises;
    }

    public Exercise getRandomChestExercise() {
        return chestExercises.get(r.nextInt());
    }

    public HashMap<Integer, Exercise> getLegExercises() {
        return legExercises;
    }

    public Exercise getRandomLegExercise() {
        return legExercises.get(r.nextInt());
    }

    public HashMap<Integer, Exercise> getShoulderExercises() {
        return shoulderExercises;
    }

    public Exercise getRandomShoulderExercise() {
        return shoulderExercises.get(r.nextInt());
    }

    public HashMap<Integer, Exercise> getTricepExercises() {
        return tricepExercises;
    }

    public Exercise getRandomTricepExercise() {
        return tricepExercises.get(r.nextInt());
    }

    public HashMap<Integer, Exercise> getBicepExercises() {
        return bicepExercises;
    }

    public Exercise getRandomBicepExercise() {
        return bicepExercises.get(r.nextInt());
    }

    public HashMap<Integer, Exercise> getBackExercises() {
        return backExercises;
    }

    public Exercise getRandomBackExercise() {
        return backExercises.get(r.nextInt());
    }

    public HashMap<Integer, Exercise> getAbExercises() {
        return abExercises;
    }

    public Exercise getRandomAbExercise() {
        return abExercises.get(r.nextInt());
    }
}
