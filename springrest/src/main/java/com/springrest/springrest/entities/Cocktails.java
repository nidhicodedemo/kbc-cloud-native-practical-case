package com.springrest.springrest.entities;

public class Cocktails {

    public String cocktailId;
    public String name;
    public String glass;
    public String instructions;


    /*creating constructor*/
    public Cocktails(String cocktailId, String name, String glass, String instructions) {

        super();
        this.cocktailId = cocktailId;
        this.name = name;
        this.glass = glass;
        this.instructions = instructions;
    }

    public String getCocktailId() {
        return cocktailId;
    }

    public void setCocktailId(String cocktailId) {
        this.cocktailId = cocktailId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGlass() {
        return glass;
    }

    public void setGlass(String glass) {
        this.glass = glass;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }


    @Override
    public String toString() {
        return "Cocktails{" +
                "cocktailId='" + cocktailId + '\'' +
                ", name='" + name + '\'' +
                ", glass='" + glass + '\'' +
                ", instructions='" + instructions + '\'' +
                '}';
    }
}





































