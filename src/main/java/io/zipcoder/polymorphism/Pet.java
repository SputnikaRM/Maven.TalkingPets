package io.zipcoder.polymorphism;

public abstract class Pet {
    public String name;


    public String speak(){return "WHY";}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet (String name){this.name=name;}


}
