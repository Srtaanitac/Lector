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

public class LectorUIEjemplo extends JFrame {

	private JPanel contentPane;
	protected JTextArea textArea;
	protected JButton btnAtras;
	protected JButton btnMarcar;
	protected JButton btnIrAMarca;
	protected JButton btnAlante;
	protected JLabel lblNumeroPagina;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LectorUIEjemplo frame = new LectorUIEjemplo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LectorUIEjemplo() {
		setBackground(SystemColor.activeCaption);
		setTitle("Lector");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 321, 490);
		setResizable(false);

		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		// para que no parta las palabras
		textArea = new JTextArea();
		textArea.setBackground(SystemColor.controlHighlight);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		contentPane.add(textArea, BorderLayout.CENTER);

		// Panel de botones
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		contentPane.add(panel, BorderLayout.SOUTH);

		lblNumeroPagina = new JLabel("0");
		btnAtras = new JButton("<<");
		btnAlante = new JButton(">>");
		btnMarcar = new JButton("Marcar");
		btnIrAMarca = new JButton("Ir a Marca");
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
