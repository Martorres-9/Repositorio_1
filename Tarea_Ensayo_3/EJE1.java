package ENSAYO3;
/**
 * @author Maria De Los Angeles Torres Villamar
 */
import java.util.Scanner;
public class EJE1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numeros = new int[10];
            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Ingrese el numero " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
            }
            System.out.println("Valores almacenados:");
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Posicion " + i + ": " + numeros[i]);
            }
        }
    }
}