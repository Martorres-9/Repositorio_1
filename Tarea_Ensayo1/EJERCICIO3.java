/**
 * @author Maria De Los Angeles Torres Villamar
 */
import java.util.Scanner;
public class EJERCICIO3 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int edad;
            System.out.print("Ingrese la edad: ");
            edad = scanner.nextInt();
            if (edad >= 18) {
                System.out.println("Es mayor de edad.");
            }
        }
    }
}
