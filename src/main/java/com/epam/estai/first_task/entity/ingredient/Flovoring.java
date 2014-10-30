package com.epam.estai.first_task.entity.ingredient;

/**
 * Created by Estai on 26.10.14.
 * @author Estai
 */
public class Flovoring extends Item {
    private boolean isSharp;
    private double fat;

    public Flovoring(){
    }

    public Flovoring(String name, double weight, double calories, boolean isSharp,double fat) {
        super(name, weight, calories);
        this.isSharp = isSharp;
        if(fat>=0)
        this.fat=fat;
        else{throw new IllegalArgumentException("Не может быть отрицательным");}
    }

    public Flovoring(String name, double weight, double calories) {

        super(name, weight, calories);
    }

    public boolean isSharp() {
        return isSharp;
    }

    public void setSharp(boolean isSharp) {
        this.isSharp = isSharp;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        if(fat>=0)
            this.fat=fat;
        else{throw new IllegalArgumentException("Не может быть отрицательным");}
    }
    @Override
    public String toString(){
        return super.toString()+"; fat: "+fat;
    }
}
