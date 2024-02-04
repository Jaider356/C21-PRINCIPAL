package b5;

public class EjemploEnums {


        public static void main(String[] args) {
            // Usando el enum
            DiasDeLaSemana today = DiasDeLaSemana.SUNDAY;

            // Switch con enum
            switch (today) {
                case MONDAY:
                    System.out.println("Es lunes, ánimo");
                    break;
                case FRIDAY:
                    System.out.println("¡Viernes al fin!");
                    break;
                default:
                    System.out.println("Otro día de la semana");
            }

            // Recorriendo todos los valores del enum
            System.out.println("Días de la semana:");
            for (DiasDeLaSemana day : DiasDeLaSemana.values()) {
                System.out.println(day);
            }
        }
    }

