package modelo;

public interface Legible {
	/**
	 * Cargar la siguiente página del libro.
	 */
	public void avanzarPagina();

	/**
	 * Cargar la página anterior de la actual.
	 */
	public void retrocederPagina();

	/**
	 * Cargar la siguiente página del libro.
	 */
	public void marcarPagina();

	/**
	 * Cargar la página marcada
	 */
	public void irAMarca();
}
