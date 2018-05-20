package control.accion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;

public class Marcar implements ActionListener{
	
	private ParaUI ParaUI;

	public Marcar(ParaUI ParaUI) {
		this.ParaUI = ParaUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ParaUI.getLibro().marcarPagina();
	
	}

}
