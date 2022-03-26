package com.diana;
/**
 * La clase Contacto es la clase padre abstracta.
 * @version 1.0.
 * @author Diana y Estela
 */
public abstract class Contacto {

    //DEFINIR VARIABLES
    //-----------------
    private String nombre;
    private String telefono;


    //CONSTRUCTOR
    //-----------
    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    //GETTERS Y SETTERS
    //------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    //METODO DE CREAR CONTACTO
    //------------------------
    public abstract Contacto crearContacto();

    //OVERRIDE toString
    //-----------------

    @Override
    public String toString() {
        return "Contacto: " +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'';
    }
}
