package Application;



import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    static Pokemon pokemon = new Pokemon();
    static Comparaciones comparaciones = new Comparaciones();
    static Scanner teclado = new Scanner(System.in);
    public static void main( String[] args ) {

            System.out.println("Bienvenido a la pokedex, ingresa la opcion que deseas realizar");
            System.out.println("1. Buscar pokemon");
            System.out.println("2. Comparar pokemon");
            System.out.println("3. Salir");
            switch (teclado.nextInt()) {
                case 1:
                    System.out.println("Ingrese el nombre del pokemon");
                    String nombre = teclado.next();
                    pokemon.buscarPokemon(nombre);
                    FiltrarResultados(nombre);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del primer pokemon");
                    String nombre1 = teclado.next();
                    System.out.println("Ingrese el nombre del segundo pokemon");
                    String nombre2 = teclado.next();
                    comparaciones.comparar(nombre1, nombre2);
                    break;
                case 3:
                    System.out.println("Gracias por usar la pokedex");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
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

    private static void FiltrarResultados(String pokemonABuscar) {
        String pokemonResultado = pokemon.buscarPokemon(pokemonABuscar);

        System.out.println("¿Deseas buscar algo en especifico del pokemon? Y/n");
        if (teclado.next().equalsIgnoreCase("Y")) {
            System.out.println("¿Que deseas buscar?");
            System.out.println("1. Habilidades");
            System.out.println("2. Movimientos");
            System.out.println("3. Estadisticas");
            System.out.println("4. Tipos");
            System.out.println("5. Salir");
            switch (teclado.nextInt()) {
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


}
