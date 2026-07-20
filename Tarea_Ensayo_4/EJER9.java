package ENSAYO4;
/**
 * @author Maria De Los Angeles Torres Villamar
 */
import java.util.Scanner;
public class EJER9 {
    public static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la nota 1: ");
        double n1 = scanner.nextDouble();
        System.out.print("Ingrese la nota 2: ");
        double n2 = scanner.nextDouble();
        System.out.print("Ingrese la nota 3: ");
        double n3 = scanner.nextDouble();
        double promedio = calcularPromedio(n1, n2, n3);
        System.out.println("Promedio: " + promedio);
        if (promedio >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
        scanner.close();
    }
}
