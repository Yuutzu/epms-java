package EPMS_Package;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginAdmin_JFrame extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JPasswordField pf1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginAdmin_JFrame frame = new LoginAdmin_JFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginAdmin_JFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(0, 0, 685, 390);
		contentPane.add(p1);
		
		tf1 = new JTextField();
		tf1.setColumns(10);
		tf1.setBounds(75, 160, 200, 30);
		p1.add(tf1);
		
		pf1 = new JPasswordField();
		pf1.setBounds(75, 230, 200, 30);
		p1.add(pf1);
		
		JButton b1 = new JButton("LOGIN");
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String user = "admin";
				String pass = "1234";
				
				String enteredPass = new String(pf1.getPassword());
				if(tf1.getText().equals(user) && enteredPass.equals(pass)) {
				new MenuAdmin_JFrame().setVisible(true);
				dispose();
				}
				else {
					JOptionPane.showMessageDialog(null, "Incorrect Username and Password");
				}
			}
		});
		b1.setBounds(75, 300, 100, 50);
		p1.add(b1);
		
		JButton b2 = new JButton("CLEAR");
		b2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tf1.setText("");
				pf1.setText("");
			}
		});
		b2.setBounds(175, 300, 100, 50);
		p1.add(b2);
		
		JLabel lb1 = new JLabel("USERNAME:");
		lb1.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lb1.setBounds(135, 125, 95, 30);
		p1.add(lb1);
		
		JLabel lb2 = new JLabel("PASSWORD:");
		lb2.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lb2.setBounds(130, 195, 100, 30);
		p1.add(lb2);
		
		JLabel title_lb = new JLabel("Welcome");
		title_lb.setFont(new Font("SansSerif", Font.PLAIN, 25));
		title_lb.setBounds(120, 25, 110, 50);
		p1.add(title_lb);
		
		JLabel desc_lbl = new JLabel("Please Login to Admin Dashboard");
		desc_lbl.setFont(new Font("SansSerif", Font.PLAIN, 15));
		desc_lbl.setBounds(60, 70, 230, 25);
		p1.add(desc_lbl);
	}

}
