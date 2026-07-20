package ENSAYO4;
/**
 * @author Maria De Los Angeles Torres Villamar
 */
public class EJER6 {
    public static int obtenerNumero() {
        int numero = (int)(Math.random() * 100) + 1;
        return numero;
    }
    public static void main(String[] args) {
        int numero = obtenerNumero();
        System.out.println("Numero generado: " + numero);
    }
}
