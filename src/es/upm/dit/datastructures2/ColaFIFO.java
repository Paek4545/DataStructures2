package es.upm.dit.datastructures2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ColaFIFO {
	/*
	 * 3. Cola de atención

	Objetivo: Simular una cola (FIFO).
	Instrucciones:

	a) Usa un LinkedList<String> para representar una cola de clientes.

	b) Permite agregar nuevos clientes (al final de la cola).
	
	c) Atiende (elimina) al cliente al frente.

	d) Muestra en cada paso la cola actual.

	e) Cuando la cola esté vacía, muestra un mensaje “No hay más clientes”
	 */
	public static void main(String[] args) {
		// a) Usa un LinkedList<String> para representar una cola de clientes.
		List<String> cola = new LinkedList<String>();
		// b) Permite agregar nuevos clientes (al final de la cola).
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese los nombres de los clientes (si termina ponga 'fin'): ");
		
		while(true) {
			String nombre = sc.nextLine();
			if (nombre.equalsIgnoreCase("fin")) {
				break;
			}
			cola.add(nombre);
			System.out.println("Cola acutal: " + cola);
		}
		// c) Atiende (elimina) al cliente al frente.
		while(!cola.isEmpty()) {
			String atendido = cola.remove(0); // Eliminamos al primer cliente de la cola
			System.out.println("Se ha atendido a: " + atendido);
		// d) Muestra en cada paso la cola actual.
			System.out.println("Clientes que quedan en la cola: " + cola);
		}
		// e) Cuando la cola esté vacía, muestra un mensaje “No hay más clientes”
		System.out.println("No hay más clientes");

	}

}
