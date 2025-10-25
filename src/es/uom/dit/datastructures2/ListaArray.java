package es.uom.dit.datastructures2;

import java.util.ArrayList;
import java.util.List;

public class ListaArray {
	/*
	 * 1. Lista de números y operaciones básicas

	- Objetivo: Practicar inserción, eliminación y recorrido.
	Instrucciones:

		- Crea un ArrayList<Integer>.

		- Agrega 10 números enteros (al azar o ingresados por el usuario).

		- Muestra la lista completa.

		- Calcula:

 		a) El valor máximo y mínimo.

		b) El promedio.

		c) Elimina los números menores que el promedio.

		d) Muestra la lista actualizada.
	 */

	
	public static void main (String[] args) {
		List<Integer> lista = new ArrayList<Integer>(10);
		for (int i = 0; i < 10 ; i++) {
		int aleatorio = (int) (Math.random()*100);
			lista.add(aleatorio);
	}
		System.out.println("Números generados:");
        for (int num : lista) {
            System.out.println(num);
        }
	}
	public List<Integer> valorMaximo(List<Integer> lista) {
		return null;
	}
}
	
