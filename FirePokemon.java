public class FirePokemon extends Pokemon {
    private String type;
    private int height;
    private String specialAttack = "Flame Thrower";

    public FirePokemon(String name, int level, String type, int height) {
        super(name, level);
        this.type = type;
        this.height = height;
    }

    @Override
    public void displayType() {
        System.out.println(getName() + " is a Fire 🔥 type.");
    }

    public void special() {
        System.out.println(getName() + " uses " + specialAttack + "!");
    }

    // Getters en Setters voor type en height
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}