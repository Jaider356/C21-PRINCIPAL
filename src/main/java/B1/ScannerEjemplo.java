package B1;
import java.util.Scanner;

public class ScannerEjemplo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un texto
        System.out.print("Ingrese un texto: ");

        // Leer la entrada del usuario
        String textoIngresado = scanner.nextLine();

        // Mostrar el texto ingresado por el usuario
        System.out.println("Texto ingresado: " + textoIngresado);

        // Cerrar el Scanner
        scanner.close();
    }
}
