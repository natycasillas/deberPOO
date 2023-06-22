import java.sql.SQLOutput;

import java.util.Scanner;

public class felinos {


    public felinos() {
            super();
        }
        Scanner entrada = new Scanner(System.in);


        String nombre;
        String tamanio;
        String tipo;
        String color;
        String peso;
        String edad;

    public felinos(String nombre, String tamanio, String tipo, String color, String peso, String edad) {

            this.nombre = nombre;
            this.tamanio = tamanio;
            this.tipo = tipo;
            this.color = color;
            this.peso = peso;
            this.edad = edad;
        }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void leon () {
            System.out.println("El leon es un felino peligroso");
        }



}