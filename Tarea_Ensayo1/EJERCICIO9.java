import java.util.Scanner;
public class EJERCICIO9 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero;
            System.out.print("Ingrese un numero: ");
            numero = scanner.nextInt();
            
            for (int i = 1; i <= 12; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
                
            }
        }
    }
}