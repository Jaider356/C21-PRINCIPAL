package b2;


import java.util.Scanner;

//Crear un objeto que materialize un celular
public class Trabajo2 {

    public class celular {



        private boolean altavoz;
        private boolean microfono;
        private boolean lectordehuella;
        private boolean puertodeaudifonos;
        private int ram;
        private int almacenamiento;
        private int megapixeles;
        private int medida;
        private int ancho;
        private String display;

    public void camara() {

        System.out.println("Has abierto la camara:");

    }
    public void calculadora(){

            System.out.println("has abierto la calculadora");
        }
    public void aplicaciones(){
        System.out.println("elegiste esa app");

    }

        public int getMegapixeles() {
            return megapixeles;

        }

        public void setMegapixeles(int megapixeles) {
            this.megapixeles = megapixeles;
        }

        public int getAlmacenamiento() {
            return almacenamiento;
        }

        public void setAlmacenamiento(int almacenamiento) {
            this.almacenamiento = almacenamiento;
        }

        public int getRam() {
            return ram;
        }

        public void setRam(int ram) {
            this.ram = ram;
        }
    }}
