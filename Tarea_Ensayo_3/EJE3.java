package ENSAYO3;
/**
 * @author Maria De Los Angeles Torres Villamar
 */
import java.util.Scanner;
public class EJE3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[15];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el numero " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        int mayor = numeros[0];
        int menor = numeros[0];
        int posicionMayor = 0;
        int posicionMenor = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
                posicionMayor = i++;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posicionMenor = i++;
            }
        }
        System.out.println("RESULTADOS");
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Posicion del mayor: " + posicionMayor);
        System.out.println("Numero menor: " + menor);
        System.out.println("Posicion del menor: " + posicionMenor);
    }
}
