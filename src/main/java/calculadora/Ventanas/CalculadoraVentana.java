package calculadora.Ventanas;
import calculadora.Dominio.Calculadora;
import javax.swing.*;
import java.awt.event.*;
//import java.awt.event.ActionEvent;

public class CalculadoraVentana extends JFrame implements ActionListener {
	private JTextField fieldNum1;
	private JTextField fieldNum2;
	private JButton sumarButton;
	private JLabel labelNum1;
	private JLabel labelNum2;
	private JLabel labelResultado;

	@Override
	public void actionPerformed(ActionEvent e) {
		// Aquí va la implementación del método
		// Puedes dejarlo vacío si no necesitas realizar acciones específicas cuando se dispare un evento
	}

	public CalculadoraVentana(){
		initVentanaCalculadora();
		setSize(600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	private void initVentanaCalculadora(){
		JPanel panel = new JPanel();

		JLabel labelNum1 = new JLabel();
		labelNum1.setText("Numero 1: ");

		JLabel labelNum2 = new JLabel();
		labelNum2.setText("Numero 2: ");

		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado: ");

		JTextField fieldNum1 = new JTextField(10);
		JTextField fieldNum2 = new JTextField(10);

		JButton sumarButton = new JButton();
		sumarButton.setText("Sumar");
		JButton salirButton = new JButton();
		sumarButton.setText("Salir");

		panel.add(labelNum1);
		panel.add(labelNum2);
		panel.add(labelResultado);
		panel.add(sumarButton);
		panel.add(salirButton);
		panel.add(fieldNum1);
		panel.add(fieldNum2);

		this.add(panel);

		// Implementación de la interface ActionListener para el boton sumarButton
		sumarButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Calculadora calculadora = new Calculadora(Integer.parseInt(fieldNum1.getText()), Integer.parseInt(fieldNum2.getText()));
				int result = calculadora.sumar();
				labelResultado.setText("Resultado: " + result);
				fieldNum2.setText("");
				fieldNum2.setText("");
			}
		});

		salirButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int n = JOptionPane.showConfirmDialog(panel.getParent(),
						"¿Confirma que desea salir?", "Salir del sistema",
						JOptionPane.YES_NO_OPTION);
				if (n == JOptionPane.YES_OPTION) System.exit(0);
			}
		});
	}

}