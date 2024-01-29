package Application;

public class Comparaciones {

    public String comparar(String pokemonUno, String pokemonDos){
        Pokemon pokemon = new Pokemon();
        String pokemon1 = pokemon.buscarPokemon(pokemonUno);
        String pokemon2 = pokemon.buscarPokemon(pokemonDos);
        pokemon.buscarPokemon(pokemonDos);
        System.out.println(pokemon1 + " " + pokemon2);
        return "Comparando " + pokemonUno + " con " + pokemonDos;
    }

}
