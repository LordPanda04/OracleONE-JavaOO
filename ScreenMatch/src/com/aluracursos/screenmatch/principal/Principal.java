package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.models.Episodio;
import com.aluracursos.screenmatch.models.Pelicula;
import com.aluracursos.screenmatch.models.Serie;

import java.util.ArrayList;

public class Principal {
    static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.setDuracionMinutos(120);
        miPelicula.setIncluidoEnPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(20);

        System.out.println(miPelicula.getTotalDeEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie("La casa del Dragon", 2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionMinutos());

        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.setDuracionMinutos(180);
        otraPelicula.setIncluidoEnPlan(true);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver los títulos: " + calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(300);
        filtroRecomendacion.filtra(episodio);

        var peliculaDeLeo = new Pelicula("El señor de los anillos", 2001);
        peliculaDeLeo.setDuracionMinutos(180);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeLeo);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println("El tamaño de la lista es: " + listaDePeliculas.size());
        System.out.println("La primera película es: " + listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas);

        System.out.println("toString de la Película: " + listaDePeliculas.get(0).toString());
    }
}
