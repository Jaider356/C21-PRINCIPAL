package b2;

public class Persona {


    Persona(int edad,char genero){
        this.edad=edad;
        this.genero=genero;
    }
    public Persona(){

    }


    private  String tamano;
    private  int edad;
    private  char genero;
    private   boolean tienePelo;
    private  String colorPelo;
    private  String profecion;


    public void respirar(){
            System.out.println("respire.");
        }

    private void hablar(){
            System.out.println("hablar.");
        }
    private void conducir(){
            System.out.println("conducir.");
        }
    private void dormir(){
            System.out.println("dormir.");
        }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }
}
