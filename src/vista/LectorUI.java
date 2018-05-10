package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;

public class LectorUI extends JFrame {

	private JPanel contentPane;
	protected JTextArea textArea;
	protected JButton btnAtras;
	protected JButton btnMarcar;
	protected JButton btnIrAMarca;
	protected JButton btnAlante;
	protected JLabel lblNumeroPagina;

	
	public LectorUI() {
		setBackground(SystemColor.activeCaption);
		setTitle("Lector");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 321, 490);
		setResizable(false);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(46, 139, 87));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		// para que no parta las palabras
		textArea = new JTextArea();
		textArea.setBackground(new Color(240, 248, 255));
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		contentPane.add(textArea, BorderLayout.CENTER);

		// Panel de botones
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 205, 170));
		contentPane.add(panel, BorderLayout.SOUTH);

		lblNumeroPagina = new JLabel("0");
		btnAtras = new JButton("<<");
		btnAtras.setBackground(new Color(95, 158, 160));
		btnAlante = new JButton(">>");
		btnAlante.setBackground(new Color(95, 158, 160));
		btnMarcar = new JButton("Marcar");
		btnMarcar.setBackground(new Color(95, 158, 160));
		btnIrAMarca = new JButton("Ir a Marca");
		btnIrAMarca.setBackground(new Color(95, 158, 160));
		btnIrAMarca.setForeground(SystemColor.desktop);

		panel.add(btnAtras);
		panel.add(btnMarcar);
		panel.add(btnIrAMarca);
		panel.add(btnAlante);
		panel.add(lblNumeroPagina);
		StringBuilder cadena = new StringBuilder();
		cadena.append("a");
		textArea.setText(cadena.toString());
		// al textArea se le puede preguntar por su tamaño preferido
		System.out.println(textArea.getPreferredSize().getHeight());
		System.out.println(textArea.getHeight());
		cadena.append("m\n ttttt");
		textArea.setText(cadena.toString());
		System.out.println(textArea.getPreferredSize().getHeight());
		System.out.println(textArea.getHeight());

	}

}
