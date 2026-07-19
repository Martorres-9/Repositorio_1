package ENSAYO3;
/**
 * @author Maria De Los Angeles Torres Villamar
 */
import java.util.Scanner;
public class EJE5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[12];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese un numero positivo: ");
            int numero = scanner.nextInt();
            numeros[i] = numero + i;
        }
        System.out.println("Arreglo modificado:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Numero en posicion " + i + ": " + numeros[i]);
        }
    }
}