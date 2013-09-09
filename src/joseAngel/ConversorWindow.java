package joseAngel;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConversorWindow {

	private JFrame frame;
	Conversor conversor;
	private JTextField textField;
	private JLabel resultado;
	private JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorWindow window = new ConversorWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConversorWindow() {
		conversor =new Conversor();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	textField = new JTextField();
    textField.setColumns(10);

		JButton btnconvertir = new JButton("convertir");
		btnconvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cad = textField.getText();
				double resc =conversor.cToF Double.parseDouble(cad);
				double resf= conversor.cToC( Double.parseDouble(cad));
				JLabel l = getResultado();
				l.setText(""+resc);//lo pongo en la etiqueta paso a far
				JLabel2= getResultadoF();
				l.setText(""+resf);
			}
		});
	
		JButton btnAfarenheit = new JButton("A.Farenheit");
		
		resultado = new JLabel("");
		
		lblNewLabel = new JLabel("New label");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(67)
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(12)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnAfarenheit)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnconvertir)
									.addGap(80)
									.addComponent(resultado)))))
					.addContainerGap(185, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(59)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(lblNewLabel)
							.addGap(3)))
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnconvertir)
						.addComponent(resultado))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAfarenheit)
					.addContainerGap(124, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
	public JLabel getResultado() {
		return resultado;
	}
}
