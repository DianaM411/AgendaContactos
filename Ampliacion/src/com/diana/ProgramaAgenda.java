package com.diana;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * La clase ProgramaAgenda es la clase Main.
 * Tiene un menu que nos deja probar las funcionalidades de nuestro programa.
 * @version 1.0.
 * @author Diana y Estela
 */
public class ProgramaAgenda {

    public static void main(String[] args) {
        //LLAMO A LA FUNCION MENU AGENDA
        //------------------------------
        menuAgenda();
    }

    //FUNCION MENU
    //-----------
    public static void menuAgenda() {
        Scanner leer = new Scanner(System.in);

        Agenda agenda = new Agenda(new ArrayList<>());
        ContactoEmpresa empresa = new ContactoEmpresa("Empresa", "123456", "www.pagina.com");
        ContactoPersona persona = new ContactoPersona("Persona", "123456", LocalDate.of(1994, 11, 4));
        agenda.addContactos();


        boolean bucleMenu = true;

        while (bucleMenu) {
            //IMPRIMIR POR PANTALLA EL MENU
            //-----------------------------
            System.out.println("      ");
            System.out.println("Que accion quieres realizar?");
            System.out.println("   ");
            System.out.println("1. Añade un contacto a la agenda.");
            System.out.println("2. Elimina un contacto de la agenda. ");
            System.out.println("3. Indica si el contacto indicado existe.");
            System.out.println("4. Muestra por pantalla toda la agenda. ");
            System.out.println("5. Busca un contacto por su nombre. ");
            System.out.println("6. Salir.");
            System.out.println("   ");

            int opcion;


            while (!leer.hasNextInt()) {
                //SI EL USUARIO NO INTRODUCE UN INT LE SALE EL SIGUIENTE ERROR
                System.out.println("Error, introduce un número del '1' al '6' ");
                leer.next();
            }
            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    //ANADIR CONTACTO
                    //---------------
                    boolean sal = false;
                    while (!sal) {
                        System.out.println("Que tipo de contacto quieres anadir? (1. persona) (2. empresa) (3. salir)");
                        int newContacto = leer.nextInt();

                        switch (newContacto) {
                            case 1:
                                //SI EL CONTACTO ES UNA PERSONA
                                //-----------------------------
                                ContactoPersona newPersona = persona.crearContacto();
                                System.out.println(agenda.anadirContacto(newPersona)? "Contacto anadido correctamente." : "El contacto introducido ya existe.");
                                System.out.println(newPersona);
                                break;
                            case 2:
                                //SI EL CONTACTO ES UNA EMPRESA
                                //-----------------------------
                                ContactoEmpresa newEmpresa = empresa.crearContacto(); //algo no va bien aqui
                                System.out.println(agenda.anadirContacto(newEmpresa)? "Contacto anadido correctamente." : "El contacto introducido ya existe.");
                                System.out.println(newEmpresa);
                                break;
                            case 3:
                                sal = true;
                                break;
                            default:
                                System.out.println("ERROR!Esta operacion no existe.");
                        }
                    }

                    System.out.println("----------------------------------------");
                    break;
                case 2:
                    //ELIMINAR CONTACTO
                    //---------------
                    Scanner leer2 = new Scanner(System.in);
                    System.out.println("Que contacto quieres eliminar de agenda?");
                    String nombre = leer2.nextLine();
                    System.out.println((agenda.eliminarContacto(nombre) ? "Contacto eliminado correctamente." : "El contacto introducido no existe."));
                    System.out.println("----------------------------------------");
                    break;
                case 3:
                    //COMPROBAR SI EL CONTACTO EXISTE
                    //-------------------------------
                    System.out.println("Que contacto buscas?");
                    String existe = leer.nextLine();
                    System.out.println(agenda.existeContacto(existe)? "El contacto existe." : "Este contacto no existe.");
                    System.out.println("----------------------------------------");
                    break;
                case 4:
                    //IMPRIMIR TODA LA AGENDA DE CONTACTOS
                    //------------------------------------
                    agenda.listarContacto();
                    System.out.println("----------------------------------------");
                    break;
                case 5:
                    //BUSCAR CONTACTO POR NOMBRE Y DEVOLVER INDEX
                    //-------------------------------------------
                    System.out.println("Que contacto buscas?");
                    String busca = leer.nextLine();
                    int position = agenda.buscaContacto(busca);
                    if (position==-1)
                        System.out.println("El contacto no existe.");
                    else
                        System.out.println( "El contacto esta en la posicion: "+ position);
                    System.out.println("----------------------------------------");
                    break;
                case 6:
                    System.out.println("Adios!");
                    bucleMenu = false;
                    break;

                default:
                    System.out.println("ERROR!Esta operacion no existe.");
            }
        }
    }
}
