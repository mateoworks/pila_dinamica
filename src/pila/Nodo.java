package pila;

public class Nodo {
	public Object elemento;
	public Nodo siguiente;
	
	public Nodo() {
		this.elemento = null;
		this.siguiente = null;
	}
	
	public Nodo(Object e, Nodo sig) {
		this.elemento = e;
		this.siguiente = sig;
	}
}
