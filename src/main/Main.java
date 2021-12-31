package main;

import pila.Pila;

public class Main {

	public static void main(String[] args) {
		Pila pila = new Pila();
		pila.apilar(3);
		pila.apilar(5);
		pila.apilar(true);
		pila.apilar("Amor");
		System.out.println(pila);
		System.out.println(pila.desapilar());
		System.out.println(pila.desapilar());
		System.out.println(pila.desapilar());
		System.out.println(pila.desapilar());
		System.out.println(pila.desapilar());
	}

}
