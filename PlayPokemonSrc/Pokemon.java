abstract class Pokemon {
    private String pokemon_name; // Private to adhere to encapsulation, name should be personal.
    public String nickname; // private since its unique and  because modification  has to be controlled by parent.
    protected static String region; // protected and static can be accessed by subclasses
    private int hp;// health is private can only be modified through setter and getter
    private int pp; // health point is also kept private and controlled by parent
    private String[] moves; // this is a important attribute so its best we keep it locally private.

    //constructor for parent PokeMon
    Private Pokemon(String pokemon_name, String nickname, String region, int hp, int pp, String[] moves){
        this.pokemon_name = pokemon_name;
        this.nickname = nickname;
        this.region = region;
        this.hp = hp;
        this.pp = pp;
        this.moves = moves;
    }

    // all private methods we can use set() and get() to controll access.

    //define booleoan method takes in any Pokémon object from any pokemon type and returns who won .
    //non static meaning can be accessed only through abject instance and can be overridden
    public boolean battle(Pokemon opponent){
        //the return is true if target Pokémon won or else false
        return false;//placeholder until battle logic is defined
    }
    //method to show region or location
    //public static meaning its accessable by other static methods and can't be overridden
    //are called using the class name and not an instance of a class
    public static void check_region(){
        System.out.println("We're " + region + " here");
    }



}
