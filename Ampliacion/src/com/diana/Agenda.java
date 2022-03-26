package com.diana;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * La clase Agenda contiene un arraylist para almacenar datos de personas y de empresas.
 * Tambien tiene 5 metodos para gestionar estos datos.
 * @version 1.0.
 * @author Diana y Estela
 */
public class Agenda {

    //DEFINIR VARIABLES
    //-----------------
    private ArrayList<Contacto> listaContactos;

    //CREAR OBJETOS
    //-------------
    ContactoPersona Diana = new ContactoPersona("Diana", "123456", LocalDate.of(1994, 11, 4));
    ContactoPersona Cristina = new ContactoPersona("Cristina", "123456", LocalDate.of(1994, 11, 4));

    ContactoEmpresa Firma = new ContactoEmpresa("Firma", "123456", "www.paginaWeb.com");
    ContactoEmpresa Firma2 = new ContactoEmpresa("Firma2", "123456", "www.paginaWeb.com");

    public void addContactos() {
        listaContactos.add(Diana);
        listaContactos.add(Cristina);
        listaContactos.add(Firma);
        listaContactos.add(Firma2);
    }

    /**
     * Constructor de la clase Agenda. Se crea un objeto Agenda
     * dado por su arraylist.
     *
     * @param listaContactos arraylist de Contactos.
     */
    //CONSTRUCTOR
//-----------
    public Agenda(ArrayList<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }


    //GETTERS Y SETTERS
//-----------
    public ArrayList<Contacto> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(ArrayList<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }


//METODOS
//-----------
    /**
     * Metodo que anade un contacto a la agenda
     *
     * @param C un objeto Contacto
     * @return true si el contacto se puede anadir y false si ya existe en la agenda
     */
    public boolean anadirContacto(Contacto C) {
        boolean puedoAnadir = true;

        for (Contacto a : listaContactos) {
            if (a.getNombre().equalsIgnoreCase(C.getNombre())) {
                puedoAnadir = false;
            }
        }
        if (puedoAnadir == true) {
            listaContactos.add(C);
        } else System.out.println("No se puede.");
        return puedoAnadir;
    }


    /**
     * Metodo que elimina un contacto de la agenda
     *
     * @param nombre El nombre de contacto
     * @return true si el contacto se ha podido eliminar y false si no existe en la agenda
     */
    public boolean eliminarContacto(String nombre) {

        Boolean eliminar = false;
        Contacto contactoeliminar = null;
        for (Contacto c : listaContactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                eliminar = true;
                contactoeliminar = c;
            }
        }
        if (eliminar) {
            listaContactos.remove(contactoeliminar);
        }

        return eliminar;
    }

    /**
     * Metodo que verifica si un contacto existe en la agenda
     *
     * @param nombre El nombre de contacto
     * @return true si existe y false si no existe en la agenda
     */
    public boolean existeContacto(String nombre) {
        boolean existe = false;
        for (Contacto a : listaContactos) {
            if (a.getNombre().equalsIgnoreCase(nombre))
                existe = true;
        }
        return existe;
    }

    /**
     * Metodo que Busca un contacto y devuelve su index
     *
     * @param nombre El nombre de contacto
     * @return la position index del contacto o -1 si no existe en la agenda
     */
    public int buscaContacto(String nombre) {
        int position = -1;

        for (Contacto a : listaContactos) {
            if (a.getNombre().equalsIgnoreCase(nombre))
                position = listaContactos.indexOf(a);
        }

        return position;
    }

    /**
     * Metodo que Muestra por pantalla toda la agenda
     */
    public void listarContacto() {
        //IMPRIMIR TO DO EL  ARRAYLIST
        for (int i = 0; i < listaContactos.size(); i++) {
            System.out.println(listaContactos.get(i).toString());
        }
    }


}
