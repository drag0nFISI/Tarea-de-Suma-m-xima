package AlgoritmoKadane;
import java.util.Scanner;

/**
 *
 * @author Rojas Rojas Max
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de valores para la cadena:\t");
        int n = scanner.nextInt();

        int[] arreglo = new int[n];

        System.out.println("Ingrese los " + n + " numeros para la cadena.\t");
        for (int i = 0; i < n; i++) {
            System.out.print("\tPosicion " + (i + 1) + ":\t");
            arreglo[i] = scanner.nextInt();
        }

        SumaMaxima calculadora = new SumaMaxima();
        ResultadoKadane resultado = calculadora.encontrarSubsecuenciaMaxima(arreglo);

        System.out.println("\nLa suma maxima es:\t" + resultado.getSumaMaxima());
        System.out.println("La suma se encuentas desde la posicion " + resultado.getInicio() + " hasta la posicion " + resultado.getFin()+ ".");

        scanner.close();
    }
}
