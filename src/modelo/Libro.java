package modelo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import control.ParaUI;

public class Libro implements Legible {

	private String lectura;
	private int actual = 0;
	private int marca = 0;
	private ArrayList<Pagina> paginas;
	private ParaUI ParaUI;
	private byte[] longuitud;

	public Libro() {
		super();
		lectura = "JuegoTronos.txt";
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

	// le pasamos una lista..
	public boolean cargarPagina(int pagina) {
		try {
			longuitud = new byte[700];
			FileInputStream Pagina = new FileInputStream(lectura);
			for (int i = 0; i < pagina; i++) {
				Pagina.read(this.longuitud);
			}
			Pagina.close();

		} catch (Exception e) {
			System.out.println("No se puede cargar la pagina");
		}
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
