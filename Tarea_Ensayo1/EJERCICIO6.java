/**
 * @author Maria De Los Angeles Torres Villamar
 */
import java.util.Scanner;
public class EJERCICIO6 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero;
            System.out.print("Ingrese un numero entre 1 y 7: ");
            numero = scanner.nextInt();
            
            switch (numero) {
                
                case 1 -> System.out.println("Lunes");
                    
                case 2 -> System.out.println("Martes");
                    
                case 3 -> System.out.println("Miércoles");
                    
                case 4 -> System.out.println("Jueves");
                    
                case 5 -> System.out.println("Viernes");
                    
                case 6 -> System.out.println("Sábado");
                    
                case 7 -> System.out.println("Domingo");
                    
                default -> System.out.println("Numero inválido");
            }
        }
    }
}
