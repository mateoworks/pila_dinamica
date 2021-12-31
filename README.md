# Pila dinámica con Java

Una pila dinámica usa nodos o celdas para almacenar sus elementos, una de las principales características de la pila dinámica solo se limita en tamaño a la memoria del equipo, además usa los recursos del computador de una manera más eficiente, dado que conforme se van agregando elementos, esta va aumentando en tamaño.

Se le considera una estructura de datos **LIFO** (_last-in, first-out_), último en entrar, primero en salir.

# Uso de este proyecto

Este proyecto fue realizado con el IDE Eclipse, por lo tanto se recomienda abrirlo con el mismo.
Más detalles sobre la pila dinámica [aquí](https://gobitza.com/pila-dinamica-con-java/).

# Operaciones de una pila dinámica

## Crear el nodo

La clase nodo contendrá el elemento de la pila y el apuntador al nodo anterior

```java
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
```

## Interfaz de la pila

```java
public interface IPila {
	public boolean vacia();
	public void apilar(Object elemento);
	public Object desapilar();
	public Object ultimoElemento();
	public int tamanioPila();
}
```

## Atributos y constructor de la clase pila

```java
    private Nodo cima;

	public Pila() {
		this.cima = null;
	}
```

## Pila vacía

```java
    public boolean vacia() {
		return this.cima == null;
	}
```

## Agregar elementos (push)

```java
    public void apilar(Object e) {
		this.cima = new Nodo(e, this.cima);
	}
```

## Obtener el último elemento sin quitarlo (peek)

```java
    public Object ultimoElemento() {
		if(!vacia()) {
			return this.cima.elemento;
		}else {
			System.out.println("Pila vacía");
			return null;
		}
	}
```

## Quitar el último elemento

```java
    public Object desapilar() {
		if(!vacia()) {
			Object ultimo = ultimoElemento();
			this.cima = this.cima.siguiente;
			return ultimo;
		}else {
			System.out.println("Pila vacía");
			return null;
		}
	}
```

## Número de elementos de la pila usando recursividad

```java
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
```

## Imprimir la pila

```java
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
```
