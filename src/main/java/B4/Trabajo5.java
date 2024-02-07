package B4;



import B3.Trabajo4;

import java.util.Arrays;
import java.util.Scanner;

//Realizar el trabajo 4 con una estructura ciclica
public class Trabajo5 {
    public static void main(String[] args) {
        Trabajo4.Estudiante[] miArreglo = new Trabajo4.Estudiante[5];

        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < miArreglo.length ; i++) {
            Trabajo4.Estudiante estudiantes = new Trabajo4.Estudiante();
            System.out.print("Ingrese un Nombre: ");
            estudiantes.setNombre(scanner.next());
            System.out.print("Ingrese un Telefono: ");
            estudiantes.setTelefono(scanner.next());
            System.out.println("Ingrese sus notas para su promedio");
            int nota1 = scanner.nextInt();
            int nota2 = scanner.nextInt();
            int nota3 = scanner.nextInt();
            estudiantes.setPromedio((double) (nota1 + nota2 +nota3) /3);

            miArreglo[i]=estudiantes;
        }


    }

}
