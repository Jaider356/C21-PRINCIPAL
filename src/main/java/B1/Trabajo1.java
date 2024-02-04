package B1;

//Calculadora
//Hacer una calculadora pidiendo 2 datos int al usuario por consola
//Hacer las 4 operaciones Basicas

import java.util.Scanner;

public class Trabajo1 {
    public class calculadora {
        public static void main(String[] args) {
            // Crear un objeto Scanner para leer la entrada del teclado
            Scanner scanner = new Scanner(System.in);

            // Pedir al usuario que ingrese un el primer numero
            System.out.print("Ingrese el primer valor: ");
            int num1 = scanner.nextInt();



            // Pedir al usuario que ingrese un Numero
            System.out.print("Ingrese el segundo valor: ");
            int num2 = scanner.nextInt();
            // Leer la entrada del usuario
            // Mostrar el calculo realizado alusuario
            System.out.println("resultado suma: " + (num1 + num2));
            System.out.println("resultado resta: " + (num1 - num2));
            System.out.println("resultado multiplicacion: " + (num1 * num2));
            System.out.println("resultado division: " + (num1/num2));

            // Cerrar el Scanner
            scanner.close();
        }
    }

}
