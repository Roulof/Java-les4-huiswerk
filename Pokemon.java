
//Abstract Pokemon class
public abstract class Pokemon {

    //Variabelen voor pokemon namen en levels
    private String name;
    private int level;


    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void speaks(){
        System.out.println(name + " Says its own name!");
    }

    // Laat het type van de pokemon zien
    public abstract void displayType();


    //Getters en setters voor het ophalen van de pokemon name en levels

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}