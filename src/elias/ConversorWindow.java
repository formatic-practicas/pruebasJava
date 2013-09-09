package elias;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ConversorWindow {

	private JFrame frame;
	Conversor conversor;
	private JTextField grados;
	private JLabel resultadoC;
	private JLabel resultadoF;

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
		
		JButton btnc = new JButton("Convertir");
		btnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cad = grados.getText();
				//double resc=Double.parseDouble(cad);
				double resc=conversor.cToF(Double.parseDouble(cad));
				double resf=conversor.fToC(Double.parseDouble(cad));
				JLabel l =getResultado();
				l.setText(""+resc);
				JLabel l2 =getResultadoF();
				l2.setText(""+resf);
			}
		});
		
		resultadoC = new JLabel("");
		
		resultadoF = new JLabel("");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(grados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnc)
							.addGap(70)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(resultadoF)
								.addComponent(resultadoC))))
					.addContainerGap(255, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(41)
					.addComponent(grados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnc)
						.addComponent(resultadoC))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(resultadoF)
					.addContainerGap(131, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
	public JLabel getResultado() {
		return resultadoC;
	}
	public JLabel getResultadoF() {
		return resultadoF;
	}
}
