package control.accion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import control.ParaUI;

public class IrAMarca implements ActionListener{
	
	private ParaUI ParaUI;

	public IrAMarca(ParaUI ParaUI) {
		this.ParaUI = ParaUI;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ParaUI.getLibro().irAMarca();
	
	}
}
