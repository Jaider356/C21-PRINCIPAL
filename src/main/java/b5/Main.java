package b5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("este es el Date "+date);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        LocalDate localDate = LocalDate.now();
        System.out.println("este es el local Date "+localDate);



        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("este es el localDate Time "+localDateTime);



        LocalTime localTime = LocalTime.now();

        System.out.println("_________________________________________________");
        DateTimeFormatter formato= DateTimeFormatter.ofPattern("hh:mm:a");
        System.out.println("este es el local Time "+localTime);
        String fecha=localTime.format(formato);
        System.out.println("este es el local Time "+fecha);




    }

}
