package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.models.Pelicula;
import com.aluracursos.screenmatch.models.Serie;
import com.aluracursos.screenmatch.models.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {
    static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.evalua(6);
        var peliculaDeLeo = new Pelicula("El señor de los anillos", 2001);
        peliculaDeLeo.evalua(10);
        Serie casaDragon = new Serie("La casa del Dragon", 2022);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeLeo);
        lista.add(casaDragon);

        for (Titulo item: lista){
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darin");
        System.out.println("Lista de artistas no ordenada" + listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada:" + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista ordenada de títulos: " + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaLanzamiento));
        System.out.println("Lista ordenada por fecha: " + lista);
    }
}
