package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Pokemon {
    private static final String API_URL = "https://pokeapi.co/api/v2/pokemon/"; // Reemplaza con la URL de tu API
    private static String resultado = "";
    public String buscarPokemon(String nombreDelPokemon) {
        try {



            URL url = new URL(API_URL + nombreDelPokemon);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output;
            //System.out.println(jsonObject.get("name"));
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                //System.out.println(output);
                resultado = output;
//                JSONObject jsonObject = new JSONObject(output);
//                //String nombre = jsonObject.get("name").toString();
//                JSONArray formatoJSON = (JSONArray) jsonObject.get("stats");
//                JSONArray resultadoFiltrado = filtrarPorParametro(formatoJSON );
//                System.out.println(resultadoFiltrado.toString(4));


            }






            conn.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }
    public String buscarPokemon(String nombreDelPokemon, String parametroABuscar) {
        try {

            URL url = new URL(API_URL + nombreDelPokemon);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            String output;
            //System.out.println(jsonObject.get("name"));
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                //System.out.println(output);
                resultado = output;
//                JSONObject jsonObject = new JSONObject(output);
//                //String nombre = jsonObject.get("name").toString();
//                JSONArray formatoJSON = (JSONArray) jsonObject.get("stats");
//                JSONArray resultadoFiltrado = filtrarPorParametro(formatoJSON );
//                System.out.println(resultadoFiltrado.toString(4));


            }

            if (parametroABuscar.equals("abilities")) {
                JSONObject jsonObject = new JSONObject(resultado);
                JSONArray formatoJSON = (JSONArray) jsonObject.get("abilities");
                resultado = formatoJSON.toString(4);
            } else if (parametroABuscar.equals("moves")) {
                JSONObject jsonObject = new JSONObject(resultado);
                JSONArray formatoJSON = (JSONArray) jsonObject.get("moves");
                resultado = formatoJSON.toString(4);
            } else if (parametroABuscar.equals("stats")) {
                JSONObject jsonObject = new JSONObject(resultado);
                JSONArray formatoJSON = (JSONArray) jsonObject.get("stats");
                resultado = formatoJSON.toString(4);
            } else if (parametroABuscar.equals("types")) {
                JSONObject jsonObject = new JSONObject(resultado);
                JSONArray formatoJSON = (JSONArray) jsonObject.get("types");
                resultado = formatoJSON.toString(4);
            } else {
                resultado = "Opcion no valida";
            }

            conn.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultado;
    }

}
