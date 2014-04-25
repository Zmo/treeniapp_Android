package com.zmo.treeniapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Simo on 18.3.2014.
 */
public class ExerciseMovementHolder {

    private ArrayList<Exercise> chestExercises;
    private ArrayList<Exercise> legExercises;
    private ArrayList<Exercise> shoulderExercises;
    private ArrayList<Exercise> tricepExercises;
    private ArrayList<Exercise> bicepExercises;
    private ArrayList<Exercise> backExercises;
    private ArrayList<Exercise> abExercises;
    private ArrayList<Exercise> allExercises;

    private Random r;

    public ExerciseMovementHolder() {

        setChestExercises(new ArrayList<Exercise>());
        getChestExercises().add(new Exercise("Penkki"));
        getChestExercises().add(new Exercise("Penkki käsipainoilla"));
        getChestExercises().add(new Exercise("Vinopenkki"));
        getChestExercises().add(new Exercise("Vinopenkki käsipainoilla"));

        setLegExercises(new ArrayList<Exercise>());
        getLegExercises().add(new Exercise("Mave"));
        getLegExercises().add(new Exercise("Kyykky"));
        getLegExercises().add(new Exercise("Pohjelaite (istualteen)"));
        getLegExercises().add(new Exercise("Pohjelaite (seisaaltaan)"));
        getLegExercises().add(new Exercise("Takajalkalaite"));

        setShoulderExercises(new ArrayList<Exercise>());
        getShoulderExercises().add(new Exercise("Pystypunnerrus tangolla"));
        getShoulderExercises().add(new Exercise("Pystypunnerrus käsipainoilla"));
        getShoulderExercises().add(new Exercise("Olankohautus"));
        getShoulderExercises().add(new Exercise("Vipunosto sivulle"));

        setTricepExercises(new ArrayList<Exercise>());
        getTricepExercises().add(new Exercise("Dipit"));
        getTricepExercises().add(new Exercise("Ranskalainen punnerrus"));
        getTricepExercises().add(new Exercise("Penkki kapealla otteella"));
        getTricepExercises().add(new Exercise("Taljassa narulla"));

        setBicepExercises(new ArrayList<Exercise>());
        getBicepExercises().add(new Exercise("Hauiskääntö tangolla"));
        getBicepExercises().add(new Exercise("Vasarakäännöt käsipainoilla"));
        getBicepExercises().add(new Exercise("21:t tangolla"));
        getBicepExercises().add(new Exercise("Taljassa narulla"));

        setBackExercises(new ArrayList<Exercise>());
        getBackExercises().add(new Exercise("Soutu tangolla"));
        getBackExercises().add(new Exercise("Soutu käsipainolla"));
        getBackExercises().add(new Exercise("Leuanveto myötäotteella"));
        getBackExercises().add(new Exercise("Ylätalja"));
        getBackExercises().add(new Exercise("Alatalja"));

        setAbExercises(new ArrayList<Exercise>());
        getAbExercises().add(new Exercise("Dragon flag"));
        getAbExercises().add(new Exercise("Windshield wipers"));
        getAbExercises().add(new Exercise("Pyöräilijä"));
        getAbExercises().add(new Exercise("Voimapyörä"));

        setAllExercises(new ArrayList<Exercise>());
        getAllExercises().addAll(chestExercises);
        getAllExercises().addAll(legExercises);
        getAllExercises().addAll(shoulderExercises);
        getAllExercises().addAll(tricepExercises);
        getAllExercises().addAll(bicepExercises);
        getAllExercises().addAll(backExercises);
        getAllExercises().addAll(abExercises);

        r = new Random();
    }

    public Exercise getRandomChestExercise() {
        return getChestExercises().get(r.nextInt(chestExercises.size()));
    }

    public Exercise getRandomLegExercise() {
        return getLegExercises().get(r.nextInt(legExercises.size()));
    }

    public Exercise getRandomShoulderExercise() {
        return getShoulderExercises().get(r.nextInt(shoulderExercises.size()));
    }

    public Exercise getRandomTricepExercise() {
        return getTricepExercises().get(r.nextInt(tricepExercises.size()));
    }

    public Exercise getRandomBicepExercise() {
        return getBicepExercises().get(r.nextInt(bicepExercises.size()));
    }

    public Exercise getRandomBackExercise() {
        return getBackExercises().get(r.nextInt(backExercises.size()));
    }

    public Exercise getRandomAbExercise() {
        return getAbExercises().get(r.nextInt(abExercises.size()));
    }

    public ArrayList<Exercise> getChestExercises() {
        return chestExercises;
    }

    public void setChestExercises(ArrayList<Exercise> chestExercises) {
        this.chestExercises = chestExercises;
    }

    public ArrayList<Exercise> getLegExercises() {
        return legExercises;
    }

    public void setLegExercises(ArrayList<Exercise> legExercises) {
        this.legExercises = legExercises;
    }

    public ArrayList<Exercise> getShoulderExercises() {
        return shoulderExercises;
    }

    public void setShoulderExercises(ArrayList<Exercise> shoulderExercises) {
        this.shoulderExercises = shoulderExercises;
    }

    public ArrayList<Exercise> getTricepExercises() {
        return tricepExercises;
    }

    public void setTricepExercises(ArrayList<Exercise> tricepExercises) {
        this.tricepExercises = tricepExercises;
    }

    public ArrayList<Exercise> getBicepExercises() {
        return bicepExercises;
    }

    public void setBicepExercises(ArrayList<Exercise> bicepExercises) {
        this.bicepExercises = bicepExercises;
    }

    public ArrayList<Exercise> getBackExercises() {
        return backExercises;
    }

    public void setBackExercises(ArrayList<Exercise> backExercises) {
        this.backExercises = backExercises;
    }

    public ArrayList<Exercise> getAbExercises() {
        return abExercises;
    }

    public void setAbExercises(ArrayList<Exercise> abExercises) {
        this.abExercises = abExercises;
    }

    public ArrayList<Exercise> getAllExercises() {
        return allExercises;
    }

    public void setAllExercises(ArrayList<Exercise> allExercises) {
        this.allExercises = allExercises;
    }
}