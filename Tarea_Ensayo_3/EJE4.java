package ENSAYO3;
/**
 * @author Maria De Los Angeles Torres Villamar
 */
import java.util.Scanner;
public class EJE4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[20];
        int cantidadPares = 0;
        int cantidadImpares = 0;
        int sumaPares = 0;
        int sumaImpares = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                cantidadPares++;
                sumaPares = sumaPares + numeros[i];
            } else {
                cantidadImpares++;
                sumaImpares = sumaImpares + numeros[i];
            }
        }
        System.out.println("RESULTADOS");
        System.out.println("Cantidad de numeros pares: " + cantidadPares);
        System.out.println("Cantidad de numeros impares: " + cantidadImpares);
        System.out.println("Suma de los pares: " + sumaPares);
        System.out.println("Suma de los impares: " + sumaImpares);
        scanner.close();
    }
}
