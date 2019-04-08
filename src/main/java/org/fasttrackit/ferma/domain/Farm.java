package org.fasttrackit.ferma.domain;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    public List<Animals> getAnimals() {
        return animals;
    }

    private List<Animals> animals = new ArrayList<Animals>();


    public void addAnimals(Animals animals){
        this.animals.add(animals);

    }




}
