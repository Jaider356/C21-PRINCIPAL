package B3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
//Seleccionar la estructura de dato correcta para el siguiente ejercicio.
    // Hacer un programa que capture el promedio de la nota de 5 estudiantes y que almacene los datos como nombre, y telefono.
public class Trabajo4 {
    public static class Estudiante {
        double   promedio;
        String nombre;
        String telefono;

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public void setPromedio(double promedio) {
            this.promedio = promedio;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Estudiante> estudianteList = new ArrayList<>();

        Estudiante estudiante1 = new Estudiante();
        System.out.println("A continuacion digite los datos de estudiante1:");
        System.out.println("Nombre");
        estudiante1.setNombre(scanner.next());
        System.out.println("Telefono");
        estudiante1.setTelefono(scanner.next());
        System.out.println("notas para su promedio");

        int nota1 = scanner.nextInt();
        int nota2 = scanner.nextInt();
        int nota3 = scanner.nextInt();
        estudiante1.setPromedio((double) (nota1 + nota2 +nota3) /3);


        //_________________//

        Estudiante estudiante2 = new Estudiante();
        System.out.println("A continuacion digite los datos de estudiante2:");
        System.out.println("Nombre");
        estudiante2.setNombre(scanner.next());
        System.out.println("Telefono");
        estudiante2.setTelefono(scanner.next());
        System.out.println("notas para su promedio");

        int nota4 = scanner.nextInt();
        int nota5 = scanner.nextInt();
        int nota6 = scanner.nextInt();
        estudiante2.setPromedio((double) (nota4 + nota5 +nota6) /3);


        //Estudiante estudiante2 = new Estudiante();
        //System.out.println("Escribe el nombre del segundo estudiante: ");
        //estudiante2.setNombre(scanner.next());
        //System.out.println("Digite el telefono del estudiante:");
        //estudiante2.setTelefono(scanner.nextLine());
        //System.out.println("Digita la primera nota del estudiante:");
        //int firstnota2 = scanner.nextInt();
        //System.out.println("Digita la segunda nota del estudiante:");
        //int secodnota2 = scanner.nextInt();
        //estudiante2.setPromedio((firstnota2+secodnota2)/2);

        //______________//
        Estudiante estudiante3 = new Estudiante();
        System.out.println("A continuacion digite los datos de estudiante3:");
        System.out.println("Nombre");
        estudiante3.setNombre(scanner.next());
        System.out.println("Telefono");
        estudiante3.setTelefono(scanner.next());
        System.out.println("notas para su promedio");

        int nota7 = scanner.nextInt();
        int nota8 = scanner.nextInt();
        int nota9 = scanner.nextInt();
        estudiante3.setPromedio((double) (nota7 + nota8 +nota9) /3);
        //______________//
        Estudiante estudiante4 = new Estudiante();
        System.out.println("A continuacion digite los datos de estudiante4:");
        System.out.println("Nombre");
        estudiante4.setNombre(scanner.next());
        System.out.println("Telefono");
        estudiante4.setTelefono(scanner.next());
        System.out.println("notas para su promedio");

        int nota10 = scanner.nextInt();
        int nota11 = scanner.nextInt();
        int nota12 = scanner.nextInt();
        estudiante4.setPromedio((double) (nota10 + nota11 +nota12) /3);
        //______________//
        Estudiante estudiante5 = new Estudiante();
        System.out.println("A continuacion digite los datos de estudiante5:");

        System.out.println("Nombre");
        estudiante5.setNombre(scanner.next());
        System.out.println("Telefono");
        estudiante5.setTelefono(scanner.next());
        System.out.println("notas para su promedio");

        int nota13 = scanner.nextInt();
        int nota14 = scanner.nextInt();
        int nota15 = scanner.nextInt();
        estudiante5.setPromedio((double) (nota13 + nota14 +nota15) /3);

        estudianteList.add(estudiante1);
        estudianteList.add(estudiante2);
        estudianteList.add(estudiante3);
        estudianteList.add(estudiante4);
        estudianteList.add(estudiante5);
    }
}

