package com.epam.estai.first_task.entity.ingredient;


import com.epam.estai.first_task.entity.Pieces;

/**
 * Created by User on 27.10.14.
 */
public class Meat extends MainIngredients{
    private boolean withBones;
    private double protein;
    public Meat(){}

    public Meat(String name, double weight, double calories, String color, Pieces pieces, boolean withBones, double protein) {
        super(name, weight, calories, color, pieces);
        this.withBones = withBones;
        if(protein>=0)
            this.protein=protein;
        else{throw new IllegalArgumentException("Не может быть отрицательным");}
    }

    public double getProtein() {
        return protein;
    }

    public boolean isWithBones() {
        return withBones;
    }

    public void setWithBones(boolean withBones) {
        this.withBones = withBones;
    }

    public void setProtein(double protein) {
        if(protein>=0)
            this.protein=protein;
        else{throw new IllegalArgumentException("Не может быть отрицательным");}
    }
}
