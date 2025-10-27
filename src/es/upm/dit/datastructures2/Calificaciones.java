package es.upm.dit.datastructures2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calificaciones {
/*
 * Objetivo: Combinar estructuras.
	- Instrucciones:

	a) Usa un Map<String, ArrayList<Double>>.
	- La clave será el nombre del alumno.
	- El valor será una lista de notas.

		- Permite:

	b) Agregar una nota a un alumno.

	c) Calcular el promedio de cada alumno.

	d) Mostrar el alumno con mejor promedio
 */
	public static void main(String[] args) {
		// Creamos nuestro mapa:
		Map<String,ArrayList<Double>> calificaciones = new HashMap<String, ArrayList<Double>>();
		System.out.println("Para agregar pulse 1, para calcular el promedio pulse 2, para mostrar el alumno con mejor promedio pulse 3, para salir pulse 0.");
		// Creamos el scanner para que podamos meter los alumnos:
		Scanner sc = new Scanner(System.in);
		String opciones = "";
		while (!opciones.equals("0")) {
			opciones = sc.nextLine();
			// Opción 1:
			if (opciones.equals("1")) {
				System.out.println("Introduzca el nombre de un alumno: ");
				String alumno = sc.nextLine();
				System.out.println("Agregue ahora su nota: ");
				double nota = sc.nextDouble();
				calificaciones.putIfAbsent(alumno, new ArrayList<Double>());
				calificaciones.get(alumno).add(nota);
				System.out.println("La nota ha sido agregada.");
				sc.nextLine();
			}
			// Opción 2:
			if (opciones.equals("2")) {
				for (Map.Entry<String, ArrayList<Double>> entry : calificaciones.entrySet()) {
					String alumno = entry.getKey();
					ArrayList<Double> notas = entry.getValue();
					// Calculamos el promedio de las notas:
					double suma = 0;
					for (double n : notas) {
						suma += n;
					}
					double promedio = suma / notas.size();
					System.out.println("Promedio de " + alumno + ": " + promedio);
				}
				sc.nextLine();
			}
			// Opción 3:
			if (opciones.equals("3")) {
				String mejorAlumno = null;
				double mejorPromedio = 0;
				
				for (Map.Entry<String, ArrayList<Double>> entry : calificaciones.entrySet()) {
					double suma = 0;
					ArrayList<Double> notas = entry.getValue();
					for (Double n : notas) {
						suma += n;
						double promedio = suma / notas.size();
						if (mejorAlumno == null || promedio > mejorPromedio) {
							mejorAlumno = entry.getKey();
							mejorPromedio = promedio;
						}
					}
				}
				System.out.println("El alumno con mejor promedio es " + mejorAlumno + " con una nota de: " + mejorPromedio);
				sc.nextLine();
			}
			if (opciones.equals("0")) {
				System.out.println("Saliendo...");
			}
			}
		sc.close();
		}

}
