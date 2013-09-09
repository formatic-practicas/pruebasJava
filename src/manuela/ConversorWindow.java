package manuela;

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
	private JLabel ResultadoC;
	private JLabel ResultadoF;

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

		JButton convertir = new JButton("convertir");
		convertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cad = grados.getText();
				double res = Double.parseDouble(cad);
				double far = conversor.cToF(res);
				JLabel l = getResultadoF();
				// l.setText("" + res);
				l.setText("" + far);
				double cel = conversor.fToC(res);
				JLabel c = getResultadoC();
				// l.setText("" + res);
				c.setText("" + cel);

			}
		});
		
		ResultadoC = new JLabel("");
		
		ResultadoF = new JLabel("");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(48)
					.addComponent(grados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
					.addComponent(ResultadoC)
					.addGap(85))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(74)
					.addComponent(convertir)
					.addContainerGap(277, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(386, Short.MAX_VALUE)
					.addComponent(ResultadoF)
					.addGap(62))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(34)
							.addComponent(grados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(42)
							.addComponent(convertir)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ResultadoF))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(46)
							.addComponent(ResultadoC)))
					.addContainerGap(138, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

		public JLabel getResultadoF() {
		return ResultadoF;
	}
	public JLabel getResultadoC() {
		return ResultadoC;
	}
}
