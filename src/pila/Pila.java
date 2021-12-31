package pila;

/**
 * Clase que simula una pila din�mica LIFO
 * usando nodos para guardar los datos en la pila
 * 
 * @author Mateo Mtz. 
 * @since  1.0.0
 *
 */
public class Pila implements IPila{
	
	/**
	 * Cima de la pila
	 */
	private Nodo cima;

	public Pila() {
		this.cima = null;
	}

	/**
	 * Comprueba si la pila esta vac�a
	 * @return verdadero si la pila esta vac�a
	 * 		   falso si la pila contiene elementos
	 */
	@Override
	public boolean vacia() {
		return this.cima == null;
	}

	/**
	 * Agrega elementos a la pila (push)
	 * @param e elemento que se desea agregar
	 */
	@Override
	public void apilar(Object e) {
		this.cima = new Nodo(e, this.cima);
	}

	/**
	 * Quitar un elemento de la pila (pop)
	 * 
	 * @return elemento retirado
	 */
	@Override
	public Object desapilar() {
		if(!vacia()) {
			Object ultimo = ultimoElemento();
			this.cima = this.cima.siguiente;
			return ultimo;
		}else {
			System.out.println("Pila vac�a");
			return null;
		}
	}

	/**
	 * Obtener el �ltimo elemento sin quitarlo
	 * 
	 * @return �ltimo elemento
	 */
	@Override
	public Object ultimoElemento() {
		if(!vacia()) {
			return this.cima.elemento;
		}else {
			System.out.println("Pila vac�a");
			return null;
		}
	}
	
	/**
	 * M�todo recursivo para obtener el n�mero de elementos de la pila
	 * 
	 * @param   nodo referencia a la pila
	 * @return  n�mero de elementos que contiene la pila
	 */
	private int contarElementos(Nodo nodo) {
		if(nodo != null) {
			return contarElementos(nodo.siguiente) + 1;
		}
		return 0;
	}
	@Override
	public int tamanioPila() {
		Nodo nodo = this.cima;
		int tamanio = contarElementos(nodo);
		return tamanio;
	}
	
	/**
	 * Mostrar la pila en formato [elemento, elementoN, ...]
	 */
	public String toString() {
		String cadena = "[";
		Nodo auxiliar = this.cima;
		while(auxiliar != null) {
			if(auxiliar.siguiente != null) {
				cadena += auxiliar.elemento + ", ";
				auxiliar = auxiliar.siguiente;
			}else {
				cadena += auxiliar.elemento + "]";
				auxiliar = auxiliar.siguiente;
			}
		}
		return cadena;
	}
}
