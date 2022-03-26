package com.diana;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * La clase ContactoPersona es la clase hija que hereda de la clase Contacto.
 * @version 1.0.
 * @author Diana y Estela
 * @see  <a href="https://www.youtube.com/watch?v=oL2gbTqQTRk">Funny cat video</a>
 */

public class ContactoPersona extends Contacto {

    //DEFINIR VARIABLES
//-----------
    LocalDate cumpleanos;

    /**
     * Constructor de la clase ContactoEmpresa. Se crea un objeto ContactoEmpresa
     * dado por su pogina web y lo que hereda de su clase padre.
     *
     * @param nombre Nombre de contacto.
     * @param telefono Telefono de contacto.
     * @param cumpleanos Fecha cumpleanos.
     */
    //CONSTRUCTOR
//-----------
    public ContactoPersona(String nombre, String telefono, LocalDate cumpleanos) {
        super(nombre, telefono);
        this.cumpleanos = cumpleanos;
    }


    //GETTERS Y SETTERS
//-----------
    public LocalDate getCumpleanos() {
        return cumpleanos;
    }

    public void setCumpleanos(LocalDate cumpleanos) {
        this.cumpleanos = cumpleanos;
    }

    //METODOS
//-----------

    /**
     * Metodo que crea un contacto de tipo Persona.
     * Pide y lee el nombre, telefono y cumpleanos.
     *
     * @return Devuelve un objeto de tipo ContactoPersona.
     */
    @Override
    public ContactoPersona crearContacto() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca el nombre de contacto");
        String nombreContacto = leer.nextLine();
        System.out.println("Introduzca el numero de contacto");
        String numeroContacto = leer.nextLine();
        System.out.println("Introduzca la fecha nacimiento");
        String fechaNacimiento = leer.nextLine();
        LocalDate date = LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        ContactoPersona Persona = new ContactoPersona(nombreContacto, numeroContacto,date);
        return Persona;
    }

    @Override
    public String toString() {
        return "Contacto: " +
                "nombre='" + getNombre() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                ", cumpleanos='" + getCumpleanos() + '\''
                ;
    }
}
