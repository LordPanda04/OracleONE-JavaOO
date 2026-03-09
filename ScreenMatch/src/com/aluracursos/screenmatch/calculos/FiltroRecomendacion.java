package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendacion {

    public void filtra(Clasificacion clasificacion){
        if (clasificacion.getClasificacion() >= 4){
            System.out.println("Con gran valoracion");
        } else if (clasificacion.getClasificacion() >=2) {
            System.out.println("Popular ahora");
        } else {
            System.out.println("Míralo más tarde");
        }
    }
}
