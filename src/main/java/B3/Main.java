package B3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] miArreglo= {1,2,3,4};
        char[] miArregloChar ={'a','b'};
        String[] miArregloDeString = {"Hola","mundo"};

        double[] miArreglo2= new double[10];
        System.out.println(miArregloChar.length);

        llenarArreglo(1,2,3);

        Persona[] p= new Persona[5];
        List<Persona> personaList = new ArrayList<>();
        Persona persona1=new Persona();
        persona1.setEdad(22);
        Persona persona2=new Persona();
        persona2.setEdad(30);
        Persona persona3=new Persona();
        Persona persona4=new Persona();
        personaList.add(persona1);
        personaList.add(persona2);
        personaList.add(persona3);
        personaList.add(persona4);


//----------------------------------------------------------------------------------------
        List<String> miLista = new ArrayList<String>();
        miLista.add("leche");
        miLista.add("carne");
        miLista.remove("leche");
        miLista.size();
        miLista.remove(0);
        //-------------------------------------------------------------------------------

        Queue<String> miCola = new LinkedList<>();
        miCola.add("Mauricio");
        miCola.add("Carlos");
        miCola.add("Carolina");

        String elemento = miCola.poll();
        System.out.println("turno en la cola es de : "+elemento);
        elemento = miCola.poll();
        System.out.println("turno en la cola es de : "+elemento);
        miCola.add("Juan");
        elemento = miCola.poll();
        System.out.println("turno en la cola es de : "+elemento);
        //---------------------------------------------------------------------------------------

        Stack<Integer> miPila = new Stack<>();
        miPila.push(1);
        miPila.push(2);
        miPila.push(3);

        int elemento2 = miPila.pop();
        System.out.println(elemento2); // Imprimirá: 3

    }


    //---------------------------------------------------------------------------------------


     private static void llenarArreglo(int a,int b ,int c){
         int[] miArreglo= new int[3];
         miArreglo[0]=a;
         miArreglo[1]=b;
         miArreglo[2]=c;

     }
}
