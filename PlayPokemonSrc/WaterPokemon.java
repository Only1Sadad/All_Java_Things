 class WaterPokemon extends Pokemon{

    //comnstructor for WaterPokemon
    public WaterPokemon(String pokemon_name, String nickname, String region, int hp, int pp, String[] moves)
    {
        super(pokemon_name,nickname,region,hp,pp,moves);
    }
    //method to determine surf loocation by recieving in location
     //public and can be accessed by any subclasses
     public String surf(String location)
     {
        //we return our surfing location
         return location;
     }
     //battle method is inherited
}
