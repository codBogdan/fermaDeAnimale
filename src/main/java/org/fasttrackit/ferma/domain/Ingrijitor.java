package org.fasttrackit.ferma.domain;

public class Ingrijitor  {


    public Farm farm = new Farm();

    public Ingrijitor(Farm farm){
        this.farm = farm;
    }

    public void addAnimals(Animals animals){
        farm.addAnimals(animals);
    }

    public void putAllAnimalsToSleep(){
        for (Animals a : farm.getAnimals()){
            a.sleep(8);
        }
    }

    public void feedAllAnimals(String aliment){
        for(Animals a : farm.getAnimals()){
            a.eat(aliment);
        }
    }

}
