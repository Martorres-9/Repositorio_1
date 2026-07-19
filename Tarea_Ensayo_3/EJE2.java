package ENSAYO3;
/**
 * @author Maria De Los Angeles Torres Villamar
 */
import java.util.Scanner;
public class EJE2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double[] numeros = new double[10];
            double suma = 0;
            double promedio;
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Ingrese el numero " + (i + 1) + ": ");
                numeros[i] = scanner.nextDouble();
                suma = suma + numeros[i];
            }
            promedio = suma / numeros.length;
            System.out.println("Suma total: " + suma);
            System.out.println("Promedio: " + promedio);
        }
    }
}