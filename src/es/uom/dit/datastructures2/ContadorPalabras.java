package es.uom.dit.datastructures2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class ContadorPalabras {
	/*
	 * 5. Contador de palabras

	- Objetivo: Asociar claves y valores.
	- Instrucciones:

	a) Usa un Map<String, Integer>.

	b) Pide una frase al usuario.

	c) Cuenta cuántas veces aparece cada palabra.

	d) Muestra los resultados ordenados alfabéticamente por palabra
	 */
	public static void main(String[] args) {
		// a) Usa un Map<String, Integer>.
		Map<String, Integer> palabras = new HashMap<String, Integer>();
		// b) Pide una frase al usuario.
		System.out.println("Escriba un frase:");
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();
		// c) Cuenta cuántas veces aparece cada palabra.
		String[] listaPalabras = frase.split("\\s+");
		
		for (String palabra : listaPalabras) {
			// Cambiamos mayúsculas a minúsculas:
			palabra = palabra.toLowerCase();
			// Vemos si coinciden las palabras:
			if (palabras.containsKey(palabra)) {
			// En caso de que coincidan contamos cuantas veces aparece en pantalla:
				palabras.put(palabra, palabras.get(palabra) +1); // Aparece la primera vez + las veces que se repita
			} else {
			// Si no coinciden solo aparece la dicha palabra 1 sola vez
				palabras.put(palabra, 1);
			}
		}
		Map<String, Integer> ordenado = new HashMap<>(palabras);
		System.out.println("Frecuencia de palabras:");
		for (Entry<String, Integer> entry : ordenado.entrySet()) {
		    System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
	}

}
