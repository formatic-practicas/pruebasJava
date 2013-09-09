package daniBabarro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class ConversorWindow {

	private JFrame frame;
	Conversor conversor;
	private JTextField grados;
	private JLabel resultadoFar;
	private JLabel resultadoCel;

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
		conversor = new Conversor();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		grados = new JTextField();
		grados.setColumns(10);

		JButton btnToC = new JButton("Convertir");
		btnToC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cad = grados.getText();
				double res = Double.parseDouble(cad);
				double resultadoToC = conversor.fToC(res);
				resultadoCel.setText(""+resultadoToC);
				double resultadoToF = conversor.cToF(res);
				resultadoFar.setText(""+resultadoToF);
			}
		});

		resultadoFar = new JLabel("Resultado en Farenheit");
		
		resultadoCel = new JLabel("Resultado en Celsius");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(150)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnToC, GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
						.addComponent(grados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(184, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(131)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(resultadoCel)
						.addComponent(resultadoFar))
					.addContainerGap(150, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(26)
					.addComponent(grados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnToC)
					.addGap(33)
					.addComponent(resultadoFar)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(resultadoCel)
					.addContainerGap(110, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
	public JLabel getResultado() {
		return resultadoFar;
	}
}
