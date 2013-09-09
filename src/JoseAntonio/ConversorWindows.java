package JoseAntonio;

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

public class ConversorWindows {

	private JFrame frame;
	Conversor conversor;
	private JTextField grados;
	private JLabel resultado_1;
	private JLabel resultado_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorWindows window = new ConversorWindows();
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
	public ConversorWindows() {
		conversor = new Conversor ();
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
		
		JButton Convertir = new JButton("Convertir");
		Convertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String cad = grados.getText();
				double res = Double.parseDouble(cad);
				double far =  conversor.cToF(res);
				JLabel l = getResultado();
				l.setText(""+far);
				
				
			}
		
		});
		
		resultado_1 = new JLabel("");
		
		resultado_2 = new JLabel("");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(37)
							.addComponent(Convertir)
							.addGap(77)
							.addComponent(resultado_1))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(144)
							.addComponent(grados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(190, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(238, Short.MAX_VALUE)
					.addComponent(resultado_2)
					.addGap(140))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(23)
					.addComponent(grados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(13)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(resultado_1)
						.addComponent(Convertir))
					.addGap(41)
					.addComponent(resultado_2)
					.addContainerGap(135, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
	public JLabel getResultado() {
		return resultado_1;
	}
}
