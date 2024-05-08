
//Abstract Pokemon class
public abstract class Pokemon {

    //Variabelen voor pokemon namen en levels
    private String name;
    private int level;

    //Constructor voor het creëren van Pokemon object
    public Pokemon(String name, int level) {
        this.name = name;
        this.level = level;
    }

    //Methode om de Pokemon zijn eigen naam te laten 'spreken'
    public void speaks(){
        System.out.println(name + " Says its own name!");
    }

    //Abstracte methode voor subklasse voor weergeven van type pokemon
    public abstract void displayType();

    //Getters en setters voor de naam
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Getters en setters voor het level
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
}