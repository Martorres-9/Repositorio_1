/**
 * @author Maria De Los Angeles Torres Villamar
 */
import java.util.Scanner;
public class EJERCICIO5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota;
        System.out.print("Ingrese una calificacion entre 0 y 10: ");
        nota = scanner.nextDouble();

        if (nota >= 9) {
            System.out.println("Excelente");
        } else if (nota >= 8) {
            System.out.println("Muy Bueno");
        } else if (nota >= 7) {
            System.out.println("Bueno");
        } else if (nota >= 5) {
            System.out.println("Regular");
        } else {
            System.out.println("Deficiente");
        }
    }
}