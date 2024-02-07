package B4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        int contador =0;

        while (contador<5){
         //   System.out.println("El contador vale "+contador);
            contador++;
        }
        contador=0;

        do {
       //     System.out.println("El contador vale "+contador);
            contador++;
        }while (contador <5);

        int[] miArreglo= {1,2,3,4};

        List<String> miListaString = List.of("mauricio","Carlos","carolina");

        for (int i = 0; i < miListaString.size(); i++) {
        //    System.out.println(miListaString.get(i));
        }

        for(String nombre:miListaString){
        //    System.out.println(nombre);
        }


        List<String> listaStream=List.of("ROJO","verde","Azul","amarillo");

        for (int i = 0; i < listaStream.size(); i++) {
            System.out.println( listaStream.get(i).toUpperCase());
        }
        System.out.println("____________________________________________");
        listaStream.stream().map(String::toLowerCase).forEach(System.out::println);

        List<Integer> arrayInt = Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer> impares= arrayInt.stream().filter(n-> n % 2 ==0).toList();
        System.out.println(impares);

        int suma = arrayInt.stream().mapToInt(Integer::intValue).sum();

        System.out.println(suma);
    }
}
