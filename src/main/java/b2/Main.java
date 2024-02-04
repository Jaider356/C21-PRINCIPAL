package b2;

public class Main {

    public static void main(String[] args) {
        Persona persona= new Persona(20,'F');

        System.out.println(persona.getEdad()>18?"soy mayor de edad":"Soy menor de edad");


        if ((persona.getEdad() >18) || (persona.getGenero()=='F')) {
            System.out.println("es mujer mayor de edad");
        } else{
            System.out.println("Es mujer menor de edad");
        }

        int diaDelaSemana =2;

        String nombreDia= switch (diaDelaSemana){
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "sabado";
            case 7 -> "Doming";
            default -> "Dia no valido";
        };
        System.out.println(nombreDia);
    }
}
