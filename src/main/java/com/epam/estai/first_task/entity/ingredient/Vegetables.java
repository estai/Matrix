package com.epam.estai.first_task.entity.ingredient;


import com.epam.estai.first_task.entity.Pieces;

/**
 * Created by Estai on 26.10.14.
 * @author Estai
 */
public class Vegetables extends MainIngredients {
private double carbohydrates;

    public Vegetables(){}

    public Vegetables(String name, double weight, double calories, String color, Pieces pieces, double carbohydrates) {
        super(name, weight, calories, color, pieces);
        if(carbohydrates>=0)
            this.carbohydrates=carbohydrates;
        else{throw new IllegalArgumentException("Не может быть отрицательным");}
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(double carbohydrates) {
        if(carbohydrates>=0)
            this.carbohydrates=carbohydrates;
        else{throw new IllegalArgumentException("Не может быть отрицательным");}
    }

}