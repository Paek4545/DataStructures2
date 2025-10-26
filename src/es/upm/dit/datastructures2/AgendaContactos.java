package es.upm.dit.datastructures2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AgendaContactos {
/*
 * Objetivo: Aplicar HashMap o TreeMap.
Instrucciones:

a) Crea un Map<String, String> donde la clave sea el nombre y el valor el número de teléfono.

	- Permite:

	b) Agregar contactos.

	c) Buscar un contacto por nombre.

	d) Eliminar un contacto.

	e) Mostrar todos los contactos.

	f) Usa un menú simple con opciones (1-Agregar, 2-Buscar, 3-Eliminar, 4-Listar, 0-Salir).
 */
	public static void main (String[] args) {
		// a) Crea un Map<String, String> donde la clave sea el nombre y el valor el número de teléfono.
		Map<String, String> contactos = new HashMap<String, String>();
		// f) Usa un menú simple con opciones (1-Agregar, 2-Buscar, 3-Eliminar, 4-Listar, 0-Salir).
		Scanner sc = new Scanner(System.in);
		String opciones = "";
		while (!opciones.equals("0")) {
			System.out.println("Escriba un número del 0 al 4 según quiera: 1-Agregar, 2-Buscar, 3-Eliminar, 4-Listar, 0-Salir");
				opciones = sc.nextLine();
				// b) Agregar contactos.
				if (opciones.equals("1")) {
					System.out.println("Ponga el nombre del contacto:");
					String nombre = sc.nextLine();
					System.out.println("Ponga su número de telefono:");
					String telefono = sc.nextLine();
					contactos.put(nombre, telefono);
					System.out.println("Se ha añadido el siguiente contacto: " + contactos);
					
				}
				// c) Buscar un contacto por nombre.
				if (opciones.equals("2")) {
					System.out.println("Ponga el nombre del contacto");
					String nombre = sc.nextLine();
					if (contactos.containsKey(nombre)) {
						contactos.get(nombre);
					}
					System.out.println("Teléfono de " + nombre + ": " + contactos.get(nombre));
				}
				// d) Eliminar un contacto.
				if (opciones.equals("3")) {
					System.out.println("Escriba el contacto que quiera eliminar:");
					String nombre = sc.nextLine();
					if (contactos.containsKey(nombre)) {
						contactos.remove(nombre);
						}
					System.out.println("El contacto de " + nombre + " ha sido eliminado.");
					}
				// e) Mostrar todos los contactos.
				if (opciones.equals("4")) {
					System.out.println("A continuación se muestran en una lista todos los contactos actuales:");
					for (Map.Entry<String, String> entry : contactos.entrySet()) {
						System.out.println("Nombre: " + entry.getKey() + " | Teléfono: " + entry.getValue()); 
						System.out.println();
						
					}
					
				}
				}
		if(opciones.equals("0")) {
					System.out.println("Saliendo...");
				}
				}
			}	
		

