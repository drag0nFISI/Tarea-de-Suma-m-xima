package Main;

/**
 *
 * @author Rojas Rojas Max
 */
public class ResultadoKadane {
    private int sumaMaxima;
    private int inicio;
    private int fin;

    public ResultadoKadane(int sumaMaxima, int inicio, int fin) {
        this.sumaMaxima = sumaMaxima;
        this.inicio = inicio;
        this.fin = fin;
    }

    public int getSumaMaxima() {
        return sumaMaxima;
    }

    public int getInicio() {
        return inicio;
    }

    public int getFin() {
        return fin;
    }
}
