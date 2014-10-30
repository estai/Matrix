package com.epam.estai.first_task.entity;


import com.epam.estai.first_task.entity.ingredient.Item;
import com.epam.estai.first_task.entity.ingredient.Vegetables;

import java.util.ArrayList;

/**
 * Created by Estai on 26.10.14.
 * @author Estai
 */
public class Salad implements Cloneable{
    private ArrayList<Item> items = new ArrayList<Item>();

    public void clear() {
        items.clear();
    }

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        items.remove(item);
    }

    public void display() {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }
    public void displayVegetables() {
        for (Item item : items) {
            if (item instanceof Vegetables)
            System.out.println(item.toString());
        }
    }
    public double getTotalCalories(){
        System.out.println("Калорийность салата: ");
        double result=0.0;
        for (Item item:items){
            result+=item.getCalories();
        }
        return result;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    @Override
    public Object clone() {
        try {
            Salad copy =(Salad)super.clone();
            copy.items = (ArrayList<Item>)items.clone();
            return copy;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(
                    "отсутствует Cloneable!");
        }
    }





    public void vegetableSearch(int min, int max) {
        System.out.println("Овощи, калорий которых в промежутке "+min+","+max+":");
        for (Item item: items){
            if (item instanceof Vegetables)
            if(item.getCalories()>=min && item.getCalories()<=max)
            {

                System.out.println(item.getName());

            }

        }
    }
}
