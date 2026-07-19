/**
 * @author Maria De Los Angeles Torres Villamar
 */
import java.util.Scanner;
public class EJERCICIO8 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String contraseña;
            
            do {
                System.out.print("Ingrese la contrasenia: ");
                contraseña = scanner.nextLine();
            } while (!contraseña.equals("java2026"));
            System.out.println("Acceso concedido.");
        }
    }
}