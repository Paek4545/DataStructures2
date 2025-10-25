package es.uom.dit.datastructures2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PalabrasUnicas {
/* 
 * 2. Lista de palabras únicas

	-´Objetivo: Usar un ArrayList<String> para gestionar texto.
	Instrucciones:

		a) Pide al usuario una frase.

		b) Divide la frase en palabras.

		c) Agrega cada palabra a un ArrayList, evitando duplicados.

		d) Muestra el listado de palabras únicas en orden alfabético.
 */
	public static void main(String[] args) {
		// a)  Pide al usuario una frase.
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba una frase:");
		String frase = sc.nextLine().toLowerCase();
		
		// b) Divide la frase en palabras
		String[] palabras = frase.split("\\s");
		
		
		// c) Agrega cada palabra a un ArrayList, evitando duplicados.
		List<String> lista = new ArrayList<String>();
		
		for (String palabra : palabras) {
			if (!lista.contains(palabra)) {
				lista.add(palabra);
			}
		}
		// d) Muestra el listado de palabras únicas en orden alfabético.
		System.out.println("Lista de palabras únicas: ");
		for (String palabra : lista) {
			System.out.println(palabra);
		}
		sc.close();
	}

}
