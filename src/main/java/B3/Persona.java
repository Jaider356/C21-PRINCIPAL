package B3;

public class Persona {


    Persona(int edad, char genero){
        this.edad=edad;
        this.genero=genero;
    }
    public Persona(){

    }

    private  String nombre;
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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public boolean isTienePelo() {
        return tienePelo;
    }

    public void setTienePelo(boolean tienePelo) {
        this.tienePelo = tienePelo;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public String getProfecion() {
        return profecion;
    }

    public void setProfecion(String profecion) {
        this.profecion = profecion;
    }
}
