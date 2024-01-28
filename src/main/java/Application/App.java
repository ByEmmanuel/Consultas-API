package Application;



import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {


    public static void main( String[] args ) {
        Pokemon pokemon = new Pokemon();
            System.out.println("Bienvenido a la pokedex, ingresa el nombre del pokemon que deseas buscar");
            Scanner scanner = new Scanner(System.in);

            String pokemonABuscar = scanner.next();

            String pokemonResultado = pokemon.buscarPokemon(pokemonABuscar);

            System.out.println("¿Deseas buscar algo en especifico del pokemon? Y/n");
            if (scanner.next().equalsIgnoreCase("Y")) {
                System.out.println("¿Que deseas buscar?");
                System.out.println("1. Habilidades");
                System.out.println("2. Movimientos");
                System.out.println("3. Estadisticas");
                System.out.println("4. Tipos");
                System.out.println("5. Salir");
                switch (scanner.nextInt()) {
                    case 1:
                        System.out.println("abilities");
                        System.out.println(pokemon.buscarPokemon(pokemonABuscar, "abilities"));
                        break;
                    case 2:
                        System.out.println("moves");
                        System.out.println(pokemon.buscarPokemon(pokemonABuscar, "moves"));
                        break;
                    case 3:
                        System.out.println("stats");
                        System.out.println(pokemon.buscarPokemon(pokemonABuscar, "stats"));
                        break;
                    case 4:
                        System.out.println(pokemon.buscarPokemon(pokemonABuscar, "types"));
                        System.out.println("types");
                        break;
                    case 5:
                        System.out.println("Salir");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            } else {
                System.out.println(pokemonResultado);
                System.out.println("Gracias por usar la pokedex");
            }

        }
//    private static JSONArray filtrarPorParametro(JSONArray array) {
//        JSONArray resultado = new JSONArray();
//
//        for (int i = 0; i < array.length(); i++) {
//            JSONObject objeto = array.getJSONObject(i);
//
//            // Verifica si la ciudad coincide con el criterio de filtrado
//            if (objeto.getInt("effort") == 0) {
//                resultado.put(objeto);
//            }
//
//
//        }
//
//        return resultado;
//    }

}
