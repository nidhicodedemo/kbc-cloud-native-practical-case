package src.main.java.com.springrest.springrest.entities;

public class Cocktails {


    private String cocktailId;
    private String name;
    private String glass;
    private String instructions;
    private String image;


    public Cocktails(String cocktailId, String name, String glass, String instructions, String image, String ingredients) {

        super();

        this.cocktailId = cocktailId;
        this.name = name;
        this.glass = glass;
        this.instructions = instructions;
        this.image = image;

    }
    public Cocktails (){

        super();
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }



    @Override
    public String toString() {
        return "Cocktails{" +
                "cocktailId='" + cocktailId + '\'' +
                ", name='" + name + '\'' +
                ", glass='" + glass + '\'' +
                ", instructions='" + instructions + '\'' +
                ", image='" + image + '\'' +
                ", ingredients='" + ingredients + '\'' +
                '}';
    }
}
