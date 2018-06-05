package leccion;

public class Leccion {

    public static void main(String[] args) {
        //Inicializacion de Variables
        String cadena;
        int[] arreglo1 = {110, 220, 430, 140, 250, 460};
        int[] arreglo2 = {10, 20, 30, 40, 50, 60};
        double[] arreglo3 = new double[6];
        double suma;
        double prom;
        //Cadena (Imprime Primera cadena)
        cadena = String.format("%-13s%-13s%-13s\n", "Arreglo1", "Arreglo2", "Resultado");
        //Ciclo For (para hacer las operaciones de suma y division ; almacena promedio en el arreglo3 y formatea cadena) 
        for (int contador = 0; contador < arreglo1.length; contador++) {
            suma = arreglo1[contador] + arreglo2[contador];
            prom = suma / 2;
            arreglo3[contador] = prom;
            cadena = cadena + String.format("%-13d%-13d%-13.2f\n", arreglo1[contador], arreglo2[contador], arreglo3[contador]);
        }

        //Impresion de cadena
        System.out.printf(cadena);

    }

}
