package com.epam.estai.first_task.entity.ingredient;


import com.epam.estai.first_task.entity.Pieces;


/**
 * Created by Estai on 26.10.14.
 * @author Estai
 */
public abstract class MainIngredients extends Item{
    private String color;
    private Pieces pieces;

    public MainIngredients(){}

    public MainIngredients(String name, double weight, double calories, String color,Pieces pieces) {
        super(name, weight, calories);
        this.pieces=pieces;
        this.color = color;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPieces(Pieces pieces) {
        this.pieces = pieces;
    }

    public Pieces getPieces() {
        return pieces;
    }

    @Override
    public String toString(){
        return super.toString()+"; color: "+color+"; pieces"+pieces;
    }
}
