package antonio;

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
	private JTextField grados;
	private JLabel resultado;

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
		
		JButton btnACelsius = new JButton("A Celsius");
		btnACelsius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cad = grados.getText();
				double res = Double.parseDouble(cad);
				double far = conversor.cToF(res);
				JLabel l = getResultado();
				l.setText(""+far);
				
			}
		});
		
		JButton btnAFarenheit = new JButton("A Farenheit");
		
		resultado = new JLabel("");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(33)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAFarenheit)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnACelsius)
							.addGap(115)
							.addComponent(resultado))
						.addComponent(grados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(132, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(39)
					.addComponent(grados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnACelsius)
						.addComponent(resultado))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAFarenheit)
					.addContainerGap(132, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
	public JLabel getResultado() {
		return resultado;
	}
}
