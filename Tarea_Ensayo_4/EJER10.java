package ENSAYO4;
/**
 * @author Maria De Los Angeles Torres Villamar
 */
import java.util.Scanner;
public class EJER10 {
    public static int mayor(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int b = scanner.nextInt();
        int resultado = mayor(a, b);
        System.out.println("El numero mayor es: " + resultado);
    }
}