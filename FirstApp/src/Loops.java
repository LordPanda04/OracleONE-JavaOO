import java.util.Scanner;

public class Loops {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresar nota de película");
            nota = teclado.nextDouble();
            mediaEvaluaciones += nota;
        }

        System.out.println("La media de evaluaciones es: " + mediaEvaluaciones / 3);
    }
}
