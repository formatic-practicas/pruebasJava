package diego;

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
	private JLabel resultadoc;
	private JLabel resultadof;

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

		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cad = grados.getText();
				double resc = conversor.cToF(Double.parseDouble(cad));
				double resf = conversor.fToC(Double.parseDouble(cad));
				JLabel l = getResultado();
				l.setText("" + resc);
				JLabel l2 = getResultadof();
				l2.setText("" + resf);
			}
		});

		resultadoc = new JLabel("");
		
		resultadof = new JLabel("");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnConvertir, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(grados, Alignment.LEADING))
					.addGap(47)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(resultadof)
						.addComponent(resultadoc))
					.addContainerGap(188, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(resultadoc)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(grados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnConvertir)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(resultadof)
					.addContainerGap(164, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

	public JLabel getResultado() {
		return resultadoc;
	}
	public JLabel getResultadof() {
		return resultadof;
	}
}
