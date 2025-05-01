package Main;

/**
 *
 * @author Rojas Rojas Max
 */
public class SubSumaMaxima {
   public ResultadoKadane encontrarSubsecuenciaMaxima(int[] arr) {
        int maxActual = arr[0];
        int maxTotal = arr[0];
        int inicio = 0, fin = 0, tempInicio = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxActual + arr[i]) {
                maxActual = arr[i];
                tempInicio = i;
            } else {
                maxActual += arr[i];
            }

            if (maxActual > maxTotal) {
                maxTotal = maxActual;
                inicio = tempInicio;
                fin = i;
            }
        }

        return new ResultadoKadane(maxTotal, inicio + 1, fin + 1); // +1 para que coincida con las posiciones del ejemplo
    } 
}
