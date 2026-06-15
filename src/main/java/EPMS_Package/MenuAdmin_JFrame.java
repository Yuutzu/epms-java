package EPMS_Package;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuAdmin_JFrame extends JFrame {

	private JPanel Menu_Pane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAdmin_JFrame frame = new MenuAdmin_JFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MenuAdmin_JFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 445);
		Menu_Pane = new JPanel();
		Menu_Pane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Menu_Pane);
		Menu_Pane.setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(10, 80, 865, 310);
		Menu_Pane.add(p1);
		
		JButton b1 = new JButton("Add Employee");
		b1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new AddEmployee_JFrame().setVisible(true);
				dispose();
			}
		});
		b1.setBounds(60, 40, 150, 90);
		p1.add(b1);
		
		JButton b2 = new JButton("Bonus");
		b2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Bonus_JFrame().setVisible(true);
				dispose();
			}
		});
		b2.setBounds(665, 40, 150, 90);
		p1.add(b2);
		
		JButton b3 = new JButton("Overtime");
		b3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new OvertimeClass();
				dispose();
			}
		});
		b3.setBounds(360, 40, 150, 90);
		p1.add(b3);
		
		JButton b4 = new JButton("Payment");
		b4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Payment_JFrame().setVisible(true);
				dispose();
			}
		});
		b4.setBounds(511, 173, 150, 90);
		p1.add(b4);
		
		JButton b6 = new JButton("Deduction");
		b6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new DeductionClass();
				dispose();
			}
		});
		b6.setFocusable(false);
		b6.setBounds(210, 173, 150, 90);
		p1.add(b6);
		
		JLabel menu_label = new JLabel("ADMIN MENU");
		menu_label.setFont(new Font("Tahoma", Font.PLAIN, 25));
		menu_label.setBounds(365, 11, 155, 75);
		Menu_Pane.add(menu_label);
	}

}
