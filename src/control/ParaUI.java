package control;

import modelo.Libro;
import vista.LectorUI;
import control.accion.*;

public class ParaUI extends LectorUI {
	private Libro libro;

	public ParaUI() {
		this.libro = libro;
		// acciones();

	}

	private void acciones() {
		btnAtras.addActionListener(new AccionRetrocederPagina(this));
		//btnIrAMarca.addActionListener(new IrAMarca(this));
		//btnMarcar.addActionListener(new Marcar(this));
		//btnAlante.addActionListener(new AccionSiguientePagina(this));

	}

	public Libro getLibro() {
		return libro;
	}

	public void mostrarPagina() {
		textArea.setText(libro.getLectura());
	}

	public void actualizarNumeroPagina() {
		// va modificando el numero
		lblNumeroPagina.setText(String.valueOf(libro.getActual()));
	}

	public void cargarMarca() {
		libro.cargarPagina(libro.getActual());

	}

}
