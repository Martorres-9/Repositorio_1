import java.util.Scanner;

public class EJERCICIO4 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double nota;
            System.out.print("Ingrese la nota: ");
            nota = scanner.nextDouble();
            if (nota >= 7) {
                System.out.println("Aprobado");
            } else {
                System.out.println("Reprobado");
            }
        }
    }
}
