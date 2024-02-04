package b2;

//El enunciado para un trabajo en Java que utiliza la declaración if podría ser algo como:

//Enunciado: Verificación de Números

import java.util.Scanner;

//Escribe un programa en Java que solicite al usuario ingresar un número entero.
// El programa debe utilizar la declaración if para determinar si el número ingresado es positivo,
// negativo o igual a cero. A continuación, imprime un mensaje en la consola indicando el resultado
// de la verificación.
public class Trabajo3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el numero: ");

        Integer numero = scanner.nextInt();
        if (numero > 0) {
            System.out.println("el numero es positivo");
        } else if (numero < 0){
            System.out.println("el numero es negativo");
        } else if (numero == 0){
            System.out.println("el numero es 0");

        }

        else{
            System.out.println("debe ingresar un numero");
        }




        scanner.close();
    }
}
