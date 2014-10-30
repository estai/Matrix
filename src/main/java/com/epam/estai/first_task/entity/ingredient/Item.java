package com.epam.estai.first_task.entity.ingredient;

/**
 * Created by Estai on 26.10.14.
 * @author Estai
 */
public abstract class Item{
    private String name;
    private double weight;
    private double calories;

    public Item(){}

    public Item(String name, double weight, double calories) {
        if(weight>=0 && calories>=0){
        this.name = name;
        this.weight = weight;
        this.calories = calories;}
        else{throw new IllegalArgumentException("Не может быть отрицательным");}

    }

    public double getCalories() {

        return calories;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        if(weight>=0)
        this.weight = weight;
        else throw new IllegalArgumentException("Не может быть отрицательным");
    }

    public void setCalories(double calories) {
        if(calories>=0)
            this.calories = calories;
        else throw new IllegalArgumentException("Не может быть отрицательным");
    }

    @Override
    public String toString(){
        return "name: "+name+"; weight: "+weight+"; calories: "+calories;}


}
