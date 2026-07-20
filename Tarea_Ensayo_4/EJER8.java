package ENSAYO4;
/**
 * @author Maria De Los Angeles Torres Villamar
 */
import java.util.Scanner;
public class EJER8 {
    public static double calcularArea(double base, double altura) {
        return base * altura;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura: ");
        double altura = scanner.nextDouble();
        double area = calcularArea(base, altura);
        System.out.println("Area del rectangulo: " + area);
        scanner.close();
    }
}
