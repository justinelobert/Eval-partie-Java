import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Username {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Username window = new Username();
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
	public Username() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(153, 51, 51));
		frame.getContentPane().setBackground(new Color(204, 102, 102));
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("CONNEXION");
		lblNewLabel.setBounds(172, 12, 105, 15);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(195, 49, 66, 15);
		frame.getContentPane().add(lblLogin);

		textField = new JTextField();
		textField.setBackground(new Color(255, 204, 255));
		textField.setBounds(158, 76, 124, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setBounds(177, 120, 105, 15);
		frame.getContentPane().add(lblPassword);

		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 204, 255));
		textField_1.setBounds(158, 145, 124, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		JButton btnValider = new JButton("VALIDER");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String log;
				String mp;

				log= textField.getText();
				mp= textField_1.getText();	

				System.out.println("Le mot de passe de " + log + " est " + mp);
			}
		});
		btnValider.setBackground(new Color(255, 204, 255));
		btnValider.setBounds(163, 195, 114, 25);
		frame.getContentPane().add(btnValider);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
