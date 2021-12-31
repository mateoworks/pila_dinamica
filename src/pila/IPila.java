package pila;

public interface IPila {
	public boolean vacia();
	public void apilar(Object elemento);
	public Object desapilar();
	public Object ultimoElemento();
	public int tamanioPila();
}
