/**
 * @author Maria De Los Angeles Torres Villamar
 */
import java.util.Scanner;
public class EJERCICIO1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String nombre;
            int edad;
            String carrera;
            double estatura;
            
            System.out.print("Ingrese su nombre: ");
            nombre = scanner.nextLine();
            System.out.print("Ingrese su edad: ");
            edad = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Ingrese su carrera: ");
            carrera = scanner.nextLine();
            System.out.print("Ingrese su estatura: ");
            estatura = scanner.nextDouble();
            
            System.out.println("DATOS INGRESADOS");
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Carrera: " + carrera);
            System.out.println("Estatura: " + estatura);
        }
    }
}
