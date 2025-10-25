package es.upm.dit.datastructures2;

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
		// Nos creamos la lista con 10 valores
		List<Integer> lista = new ArrayList<Integer>(10);
		// Nos agregamos 10 números enteros del 0 al 100 con Math.random
		for (int i = 0; i < 10 ; i++) {
		int aleatorio = (int) (Math.random()*100);
			lista.add(aleatorio);
	}
		// Mostramos la lista:
		System.out.println("Números generados:");
        for (int num : lista) {
            System.out.println(num);
        }
       // a) Obtenemos los máximos y mínimos de la lista
        int maximo = lista.get(0);
        int minimo = lista.get(0);
        
        for (int num : lista) {
        	if (num > maximo) {
        		maximo = num;
        	}
        	if (num < minimo) {
        		minimo = num;
        	}
        	}
        System.out.println("Obtenemos el máximo y el mínimo:");
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        
        // b) Obtenemos el promedio
        double suma = 0;
        for (int num : lista) {
        	suma += num;
        	}
        double promedio = suma / lista.size();
        System.out.println("Promedio: " + promedio);
        
        // c) Elimina los números menores que el promedio --> Recorremos desde el final, no desde el inicio
        for (int i = lista.size() - 1; i >= 0; i--) {
        	if (lista.get(i) < promedio) {
        		lista.remove(i);
        	}
        }	
    	// d) Muestra la lista actualizada.
    	System.out.println("Después de eliminar los valores menores que el promedio queda:" + lista);
        }
        }
		
   
		
        
	


	
