package com.diana;

import java.util.Scanner;
/**
 * La clase ContactoEmpresa es la clase hija que hereda de la clase Contacto.
 * @version 1.0.
 * @author Diana y Estela
 */
public class ContactoEmpresa extends Contacto {

//DEFINIR VARIABLES
//-----------------
private String paginaWeb;

    /**
     * Constructor de la clase ContactoEmpresa. Se crea un objeto ContactoEmpresa
     * dado por su pogina web y lo que hereda de su clase padre.
     *
     * @param nombre Nombre de contacto.
     * @param telefono Telefono de contacto.
     * @param paginaWeb Pagina Web.
     */
//CONSTRUCTOR
//-----------
    public ContactoEmpresa(String nombre, String telefono, String paginaWeb) {
        super(nombre, telefono);
        this.paginaWeb = paginaWeb;
    }

    //GETTERS Y SETTERS
//-----------
    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }


//METODOS
//-----------
    /**
     * Metodo que crea un contacto de tipo Empresa.
     * Pide y lee el nombre, telefono y pagina web.
     *
     * @return Devuelve un objeto de tipo ContactoEmpresa.
     */
    @Override
    public ContactoEmpresa crearContacto() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca el nombre de contacto");
        String nombreContacto = leer.nextLine();
        System.out.println("Introduzca el numero de contacto");
        String numeroContacto = leer.nextLine();
        System.out.println("Introduzca la pagina web");
        String paginaWebEmpresa = leer.nextLine();

        ContactoEmpresa C = new ContactoEmpresa(nombreContacto, numeroContacto,paginaWebEmpresa );
        return C;
    }

    @Override
    public String toString() {
        return "Contacto: " +
                "nombre='" + getNombre() + '\'' +
                ", telefono='" + getTelefono() + '\'' +
                ", pagina Web='" + getPaginaWeb() + '\''
                ;
    }
}
