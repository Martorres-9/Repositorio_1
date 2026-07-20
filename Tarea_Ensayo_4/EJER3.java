package ENSAYO4;
/**
 * @author Maria De Los Angeles Torres Villamar
 */
import java.util.Scanner;
public class EJER3 {
    public static void saludar(String nombre) {
        System.out.println("Bienvenido " + nombre);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        saludar(nombre);
        scanner.close();
    }
}
