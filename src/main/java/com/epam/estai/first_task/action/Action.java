package com.epam.estai.first_task.action;

import com.epam.estai.first_task.entity.ingredient.Item;
import com.epam.estai.first_task.entity.ingredient.Vegetables;
import com.epam.estai.first_task.entity.Salad;

import java.util.Collections;
import java.util.Comparator;

/**
 * Created by User on 29.10.14.
 */
public class Action {
    public static void sortByCalories(Salad salad){
        salad=(Salad)salad.clone();

        System.out.println("Сортировка по калориям: ");
        Collections.sort(salad.getItems(), new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {

                if (o1 instanceof Vegetables && o2 instanceof Vegetables) {
                    return ((Double) o1.getCalories()).compareTo((Double) o2.getCalories());
                }
                return 0;
            }

        });
        salad.displayVegetables();
    }
}
