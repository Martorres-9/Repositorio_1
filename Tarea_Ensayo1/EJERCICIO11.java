/**
 * @author Maria De Los Angeles Torres Villamar
 */
import java.util.Scanner;
public class EJERCICIO11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int mayor;
        int menor;
        System.out.print("Ingrese el numero 1: ");
        numero = scanner.nextInt();
        mayor = numero;
        menor = numero;
        for (int i = 2; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            numero = scanner.nextInt();
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
    }
}
