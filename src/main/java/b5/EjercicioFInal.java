package b5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


//Ejericicio Final
//Calculadora de edad. pedir fecha de nacimiento (yyyy-MM-dd) y calcular la edad de la persona.
public class EjercicioFInal {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INGRESA TU FECHA DE NACIMIENTO DE LA SIGUIENTE FORMA [AA/MM/DD]");
        String fecha = scanner.nextLine();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate birthday = LocalDate.parse(fecha, fmt);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(birthday, ahora);
        System.out.printf("Tu edad es: %s años, %s meses y %s días",
                periodo.getYears(), periodo.getMonths(), periodo.getDays());
    }
}

