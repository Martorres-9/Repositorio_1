import java.util.Scanner;

public class EJERCICIO7 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero;
            int cantidad = 0;
            int suma = 0;
            do {
                System.out.print("Ingrese un numero positivo: ");
                numero = scanner.nextInt();
                if (numero >= 0) {
                    cantidad++;
                    suma += numero;
                }
            } while (numero >= 0);
            System.out.println("Cantidad de numeros ingresados: " + cantidad);
            System.out.println("Suma total: " + suma);
        }
    }
}