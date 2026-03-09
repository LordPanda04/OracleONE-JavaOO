public class Decisiones {
    static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnPlan = false;
        double notaDePelicula = 8.2;
        String  tipoPlan = "plus";

//Condiciones

        if (fechaDeLanzamiento > 2022){
            System.out.println("Películas más populares");
        } else {
            System.out.println("Películas Retro");
        }

        if (incluidoEnPlan && tipoPlan.equals("plus")){
            System.out.println("Disfruta de la película");
        } else {
            System.out.println("Película no incluida en el plan");
        }
    }
}
