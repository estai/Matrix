package com.epam.estai.first_task.entity;



import com.epam.estai.first_task.entity.ingredient.Flovoring;
import com.epam.estai.first_task.entity.ingredient.MainIngredients;
/**
 * Created by Estai on 26.10.14.
 * @author Estai
 */
public class ChiefCook {
   private String name;

    public ChiefCook(String name) {
        this.name = name;
    }
    public void sliced(MainIngredients ingredients){
        System.out.println("я нарезаю "+ingredients.getName());
    }
    public void fill(Flovoring flovoring){
        System.out.println("Заправляю салат "+flovoring.getName());
    }
    public void taste(){
        System.out.println("Пробую на вкус");
    }



}
