package org.fasttrackit.ferma.domain.game;

import org.fasttrackit.ferma.domain.Animals;
import org.fasttrackit.ferma.domain.Farm;
import org.fasttrackit.ferma.domain.Ingrijitor;
import org.fasttrackit.ferma.domain.exception.ValidationException;

public class FarmGame {

    public static void main (String args[])  {
        Farm myFarm = new Farm();

        Ingrijitor Ion = new Ingrijitor(myFarm);



        try {

            Animals catel = new Animals("catel", "Labus");
            Ion.addAnimals(catel);
        } catch (ValidationException ve){

            System.out.println("Am prins o exceptie " + ve.getMessage());
        }

        try {
            Animals pisica = new Animals("pisica", "mata");
            Ion.addAnimals(pisica);
            Animals oaie = new Animals("oaie", "beeee");
            Ion.addAnimals(oaie);
        }catch (ValidationException ve){
            System.out.println("Am prins o exceptie " + ve.getMessage());
        }



        Ion.feedAllAnimals("varza");
        Ion.putAllAnimalsToSleep();


        try {
            new Animals("animal5", " ");
        }catch (ValidationException ve){
            System.out.println("Am prins o exceptie " + ve.getMessage());
        }
    }

}
