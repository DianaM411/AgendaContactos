# EjercicioAgenda

Ejercicio POO Agenda

Debemos implementar un programa que funcione como una agenda telefónica de contactos.
Un contacto tiene un nombre y un teléfono (no es necesario validarlos). Se considera que dos
contactos son iguales si sus nombres son iguales.
Una agenda de contactos está formada por un conjunto de contactos y debe permitir realizar las
siguientes operaciones:

• boolean añadirContacto(Contacto c): Añade un contacto a la agenda e indica si se ha
añadido. No se pueden meter contactos que existan, es decir, no podemos duplicar nombres
(aunque tengan distinto teléfono).

• boolean eliminarContacto(String nombre): elimina el contacto de la agenda. Indica si se ha
podido eliminar.

• boolean existeContacto(String nombre): Indica si el contacto indicado existe.

• void listarContactos(): Muestra por pantalla toda la agenda.

• int buscaContacto(String nombre): busca un contacto por su nombre y devuelve su posición
en la agenda

Implementa las clases Contacto y Agenda.

Implementa también la clase ProgramaAgenda con una función main para realizar pruebas.
Ampliación

Queremos modificar la agenda de contactos para poder almacenar personas y empresas. Las
personas tienen nombre, teléfono y cumpleaños; las empresas tienen nombre, teléfono y página
web. Tendrás que modificar la clase Contacto para que sea abstracta (y tal vez otros cambios).
Implementa las clases ContactoPersona y ContactoEmpresa, que heredarán de Contacto. Agenda
deberá seguir conteniendo una sola lista de contactos. Modifica ProgramaAgenda para realizar
pruebas con la nueva agenda.
