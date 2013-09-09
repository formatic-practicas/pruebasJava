package anxo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ConversorWindow {

	private JFrame frame;
	private JTextField grados;
	private JButton btnAFarenheit;
	private JTextField resultado;
	Conversor conversor;

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

	public ConversorWindow() {
		conversor = new Conversor();
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		grados = new JTextField();
		grados.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
			}
		});
		grados.setColumns(10);

		JButton btnACelsius = new JButton("... a Celsius");
		btnACelsius.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(""+ conversor.cToF(Double.parseDouble(grados.getText())));
			}
		});

		btnAFarenheit = new JButton("... a Farenheit");
		btnAFarenheit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(""+ conversor.fToC(Double.parseDouble(grados.getText())));
			}
		});

		resultado = new JTextField();
		resultado.setEditable(false);
		resultado.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(grados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(23)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnACelsius, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnAFarenheit, Alignment.LEADING))
					.addGap(18)
					.addComponent(resultado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(32, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(127)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(grados, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(resultado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(127, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(101, Short.MAX_VALUE)
					.addComponent(btnACelsius)
					.addGap(22)
					.addComponent(btnAFarenheit)
					.addGap(100))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
