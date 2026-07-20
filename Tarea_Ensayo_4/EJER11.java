package ENSAYO4;
/**
 * @author Maria De Los Angeles Torres Villamar
 */
import java.util.Scanner;
public class EJER11 {
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();
        if (esPar(numero)) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
        scanner.close();
    }
}