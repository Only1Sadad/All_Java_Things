class FirePokemon extends Pokemon
{
    //attribute unique to fire pokemon
    private boolean breath_fire;// cant be accessed outside of this class
    //constructor for firePokémon
    public FirePokemon(String pokemon_name, String nickname, String region, int hp, int pp, String[] moves, boolean breath_fire)
    {
        super(pokemon_name,nickname,hp,pp,moves);
        this.breath_fire = breath_fire;
    }
   //battle() is already inherited from the parent

    //function to set if the dragon breaths fire allowing outside update
    public void setFireBreathing(boolean breath_fire)
    {
        this.breath_fire = breath_fire;
    }

    //function to grant access to outsiders whether local class has fire breathing ability.
    public boolean getFireBreathing()
    {
        return breath_fire;
    }
}
