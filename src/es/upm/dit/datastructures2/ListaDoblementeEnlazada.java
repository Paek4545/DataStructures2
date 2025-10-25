package es.upm.dit.datastructures2;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListaDoblementeEnlazada {
	/*
	 * 4. Lista doblemente enlazada inversa

	- Objetivo: Usar las propiedades de LinkedList para recorrer en ambos sentidos.
	Instrucciones:

	a) Crea un LinkedList<String> con los nombres de los días de la semana.

	b) Recorre la lista en orden normal y luego en orden inverso usando un ListIterator
	 */
	public static void main(String[] args) {
		// a)  Crea un LinkedList<String> con los nombres de los días de la semana.
		List<String> nombres = new LinkedList<String>();
		nombres.add("Lunes");
		nombres.add("Martes");
		nombres.add("Miércoles");
		nombres.add("Jueves");
		nombres.add("Viernes");
		nombres.add("Sábado");
		nombres.add("Domingo");
		System.out.println("Días de la semana: " +  nombres);
		
		// b) Recorre la lista en orden normal y luego en orden inverso usando un ListIterator
		// Recorremos en orden normal con ListIterator:
		System.out.println("Lista en orden normal:");
		ListIterator<String> it = nombres.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// Recorremos en orden inverso:
		System.out.println("Lista en orden inverso:");
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
		}
	}


