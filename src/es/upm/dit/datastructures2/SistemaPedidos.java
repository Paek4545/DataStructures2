package es.upm.dit.datastructures2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SistemaPedidos {
	/*
	 * Sistema de pedidos de una tienda

	- Objetivo: Usar ArrayList, LinkedList y Map juntos.
	- Instrucciones:

	a) Usa un Map<String, Double> para los productos disponibles (nombre → precio).

	b) Usa un ArrayList<String> para el carrito de un cliente.

	c) Usa un LinkedList<String> para la cola de clientes en espera.

	- Simula el proceso:

	d) Los clientes se agregan a la cola.

	e) El cliente atendido selecciona productos y se calculan los precios.

	f) Se muestra el total a pagar.

	g) Se pasa al siguiente cliente hasta vaciar la cola.
	 */
	public static void main(String[] args) {
	// Apartado a, b y c
		Map<String, Double> productos = new HashMap<String, Double>();
		List<String> carrito = new ArrayList<String>();
		List<String> cola = new LinkedList<String>();
		// Añadimos productos a la tienda:
		productos.put("Pan", 1.5);
		productos.put("Leche de 2 litros", 1.99);
		productos.put("Patatas fritas", 2.99);
	
		// Agregamos clientes a la cola:
		cola.add("Pepito");
		cola.add("Fulanito");
		cola.add("Melanito");
		
		
		while (!cola.isEmpty()) {
		
		// El primer cliente es atendido:
		String clienteActual = cola.remove(0);
		System.out.println("Atendiendo a " + clienteActual);
		
		// El cliente selecciona los productos a comprar (cada uno compra una cosa diferente)
		if (clienteActual.equals("Pepito")) {
			carrito.add("Pan");	
		} else if (clienteActual.equals("Fulanito")) {
			carrito.add("Pan");
			carrito.add("Leche de 2 litros");
		} else {
			carrito.add("Patatas fritas");
			carrito.add("Leche de 2 litros");
		}
		
		// Calculamos el precio total de los productos dentro del carrito:
		double total = 0;
		for (String producto : carrito) {
			total += productos.get(producto);
		}
		System.out.println("Total de la compra de " + clienteActual + ": " + total);
		
		// Limpiamos el carrito del cliente anterior:
		carrito.clear();
	}
		
	}
}
