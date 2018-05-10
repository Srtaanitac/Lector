package modelo;

import java.util.ArrayList;

public class Libro implements Legible {

	private String lectura;
	private int actual = 0;
	private int marca = 0;
	private ArrayList<Pagina> paginas;

	public Libro() {
		super();
		lectura = "ruta al archivo";
		paginas = new ArrayList<>();
	}

	@Override
	public void avanzarPagina() {
		if (!comprobarUltimaPagina()) {
			if (cargarSiguientePagina())
				actual++;
		}

	}

	@Override
	public void retrocederPagina() {
		// TODO Auto-generated method stub
		if (!comprobarUltimaPagina()) {
			if (cargarSiguientePagina())
				actual--;
		}
	}

	private boolean cargarSiguientePagina() {
		if (cargarPagina(actual + 1)) {
			return true;
		}
		return true;
	}

	private boolean cargarPaginaAnterior() {
		if (cargarPagina(actual - 1)) {
			return true;
		}
		return true;
	}

	// le pasamos la maquina que será una lista..
	private boolean cargarPagina(int pagina) {
		return true;
	}

	private boolean comprobarUltimaPagina() {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean comprobarPrimeraPagina() {
		return false;
	}

	@Override
	public void marcarPagina() {
		// La pagina que marcamos es la pagina actual en la que estamos
		actual = marca;

	}

	@Override
	public void irAMarca() {
		// Y para ir a la marca tenemos que volver a la que era la actual

	}

	public String getLectura() {
		return lectura;
	}

	public int getActual() {
		return actual;
	}

	public int getMarca() {
		return marca;
	}

	public ArrayList<Pagina> getPaginas() {
		return paginas;
	}

}
