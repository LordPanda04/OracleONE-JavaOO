import java.util.Scanner;

public class Evaluaciones {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        double totalEvaluaciones = 0;

        while (nota != -1){
            System.out.println("Ingresar nota de película");
            nota = teclado.nextDouble();

            if (nota != -1 ){
                mediaEvaluaciones += nota;
                totalEvaluaciones++;
            }
        }

        System.out.println("La media de evaluaciones es: " + mediaEvaluaciones/totalEvaluaciones);
    }
}
