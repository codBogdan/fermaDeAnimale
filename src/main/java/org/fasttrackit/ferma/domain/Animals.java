package org.fasttrackit.ferma.domain;

import org.fasttrackit.ferma.domain.exception.ValidationException;

public class Animals {


    private String name;
    private String porecla;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPorecla() {
        return porecla;
    }

    public void setPorecla(String porecla) {
        this.porecla = porecla;
    }

    public Animals(String name, String porecla) throws ValidationException {
        if(name == null || name.equals(" ") || name.contains("5")){
            throw  new ValidationException("The name for " + " the animal is invalid");
        }
        this.name = name;
        this.porecla = porecla;
    }



    public void eat(String aliment){
        System.out.println("Animalul " + name + " a mancat " + aliment);

    }

    public void sleep(int hoursOfSleep){
        System.out.println("Animalul " + name + " doarme " + hoursOfSleep + " ore.");
    }


}
