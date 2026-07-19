import java.util.Scanner;

public class EJERCICIO10 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero;
            int suma = 0;
            double promedio;
            for (int i = 1; i <= 10; i++) {
                System.out.print("Ingrese el numero " + i + ": ");
                numero = scanner.nextInt();
                suma = suma + numero;
            }
            promedio = (double) suma / 10;
            System.out.println("Suma: " + suma);
            System.out.println("Promedio: " + promedio);
        }
    }
}
