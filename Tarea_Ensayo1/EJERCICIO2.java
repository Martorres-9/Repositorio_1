/**
 * @author Maria De Los Angeles Torres Villamar
 */
import java.util.Scanner;
public class EJERCICIO2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int num1, num2;
            System.out.print("Ingrese el primer numero: ");
            num1 = scanner.nextInt();
            System.out.print("Ingrese el segundo numero: ");
            num2 = scanner.nextInt();
            System.out.println("RESULTADOS");
            System.out.println("Suma: " + (num1 + num2));
            System.out.println("Resta: " + (num1 - num2));
            System.out.println("Multiplicacion: " + (num1 * num2));
            System.out.println("Division: " + ((double) num1 / num2));
            System.out.println("Residuo: " + (num1 % num2));
        }
    }
}
