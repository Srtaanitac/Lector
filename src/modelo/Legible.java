package modelo;

public interface Legible {
	/**
	 * Cargar la siguiente p�gina del libro.
	 */
	public void avanzarPagina();

	/**
	 * Cargar la p�gina anterior de la actual.
	 */
	public void retrocederPagina();

	/**
	 * Cargar la siguiente p�gina del libro.
	 */
	public void marcarPagina();

	/**
	 * Cargar la p�gina marcada
	 */
	public void irAMarca();
}
