package com.angelpuentesdevv.screenmatch.principal;

import com.angelpuentesdevv.screenmatch.excepcion.ErrorEnConversionDeDuracionException;
import com.angelpuentesdevv.screenmatch.modelos.Titulo;
import com.angelpuentesdevv.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner lectura = new Scanner(System.in);
        System.out.println("Nombre de la película: ");
        var busqueda = lectura.nextLine();

        String direccion = "http://www.omdbapi.com/?i=tt3896198&apikey=8e4ab839&t="+
                busqueda.replace(" ", "+");

        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();
            TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(miTituloOmdb);

            Titulo miTitulo = new Titulo(miTituloOmdb);
            System.out.println(miTitulo);
            System.out.println("Titulo convertido: " + miTitulo);
        }catch (NumberFormatException exception){
            System.out.println("Ha ocurrido un error: ");
            System.out.println(exception.getMessage());
        }catch (IllegalArgumentException exception){
            System.out.println("Error en la URI, verifica la dirección");
        }catch (ErrorEnConversionDeDuracionException exception){
            System.out.println(exception.getMessage());
        }
        System.out.println("Finalizó la ejecución del programa");
    }
}
