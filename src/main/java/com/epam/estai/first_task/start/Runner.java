package com.epam.estai.first_task.start;


import com.epam.estai.first_task.action.Action;
import com.epam.estai.first_task.entity.ChiefCook;

import com.epam.estai.first_task.entity.ingredient.*;
import com.epam.estai.first_task.entity.Pieces;

import com.epam.estai.first_task.entity.Salad;

/**
 * Created by Estai on 26.10.14.
 * @author Estai
 */
public class Runner {
    public static void main(String[] args) {
        ChiefCook cook=new ChiefCook("Estai");
        Salad salad=new Salad();
         Vegetables vegetables=new Vegetables("Морковь",2.5,125,"RED", Pieces.ROLL_CUTTING,25);

        Vegetables vegetables1=new Vegetables("Свекла",3.5,155,"RED",Pieces.ROLL_CUTTING,25);
        Vegetables vegetables2=new Vegetables("Помидор",5.5,110,"RED",Pieces.MINCING,25);
        Flovoring flovoring=new Flovoring("Соус",1.1,120,true,25.5);
        Vegetables vegetables3=new Vegetables("Свекла",3.5,110,"RED",Pieces.ROLL_CUTTING,25);

        salad.add(vegetables);
        salad.add(vegetables1);
        salad.add(vegetables3);
        salad.add(flovoring);
        salad.display();
        System.out.println("---------------");
        cook.sliced(vegetables);
        cook.sliced(vegetables1);
        cook.sliced(vegetables2);
        cook.fill(flovoring);
        System.out.println("---------------");


        //List<Vegetables> vegetableses=Arrays.asList(vegetables,vegetables1,vegetables2);
             /**
                 * @see Action */
      //  Action.sortByCalories(salad);
      //  Action.display(salad);
        Action.sortByCalories(salad);
        System.out.println("---------------");
        salad.display();
        System.out.println("---------------");
        System.out.println(salad.getTotalCalories());
        System.out.println("---------------");
        salad.vegetableSearch(25,110);

        //Action.vegetableSearch(salad, 0, 150);




    }

}
