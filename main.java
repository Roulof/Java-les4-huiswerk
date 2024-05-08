public class main {
    public static void main(String[] args) {
        // Maak een FirePokemon object
        FirePokemon charizard = new FirePokemon("Charizard", 50, "Fire", 170);

        // Roep methoden aan van FirePokemon
        charizard.speaks();
        charizard.displayType();
        charizard.special();

        // Gebruik getters
        System.out.println(charizard.getName() + " is " + charizard.getHeight() + " cm tall.");
    }
}
