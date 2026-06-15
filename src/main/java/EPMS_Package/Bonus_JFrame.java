package EPMS_Package;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Bonus_JFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bonus_JFrame frame = new Bonus_JFrame();
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
	public Bonus_JFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 755);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(10, 11, 765, 275);
		contentPane.add(p1);
		
		JLabel lblSearchID = new JLabel("Search ID:");
		lblSearchID.setBounds(20, 10, 130, 30);
		p1.add(lblSearchID);
		
		JLabel lblEmployeeId = new JLabel("Employee ID:");
		lblEmployeeId.setBounds(20, 70, 130, 30);
		p1.add(lblEmployeeId);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(20, 110, 130, 30);
		p1.add(lblFirstName);
		
		JLabel lblMiddleName = new JLabel("Middle Name:");
		lblMiddleName.setBounds(20, 150, 130, 30);
		p1.add(lblMiddleName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(20, 190, 130, 30);
		p1.add(lblLastName);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(20, 230, 130, 30);
		p1.add(lblAge);
		
		JLabel lblBirthDate = new JLabel("Birthdate:");
		lblBirthDate.setBounds(381, 70, 130, 30);
		p1.add(lblBirthDate);
		
		JLabel lblSex = new JLabel("Sex:");
		lblSex.setBounds(381, 110, 130, 30);
		p1.add(lblSex);
		
		JLabel lblJT = new JLabel("Job Title:");
		lblJT.setBounds(381, 150, 130, 30);
		p1.add(lblJT);
		
		JLabel lblTS = new JLabel("Total Salary:");
		lblTS.setBounds(381, 190, 130, 30);
		p1.add(lblTS);
		
		JLabel lblBranch = new JLabel("Branch:");
		lblBranch.setBounds(381, 230, 130, 30);
		p1.add(lblBranch);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(100, 10, 655, 30);
		p1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(100, 70, 270, 30);
		p1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(100, 110, 270, 30);
		p1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(100, 150, 270, 30);
		p1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(100, 190, 270, 30);
		p1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(100, 230, 270, 30);
		p1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(485, 70, 270, 30);
		p1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(485, 230, 271, 30);
		p1.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(485, 190, 270, 30);
		p1.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(485, 150, 270, 30);
		p1.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(485, 110, 270, 30);
		p1.add(textField_10);
		
		JPanel p2 = new JPanel();
		p2.setBounds(10, 297, 765, 392);
		contentPane.add(p2);
		p2.setLayout(null);
		
		JLabel lblYearsOfService = new JLabel("Years of Service:");
		lblYearsOfService.setBounds(65, 50, 110, 30);
		p2.add(lblYearsOfService);
		
		JLabel lblYearlyBonus = new JLabel("        Yearly Bonus");
		lblYearlyBonus.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblYearlyBonus.setBounds(10, 10, 205, 30);
		p2.add(lblYearlyBonus);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchEmployee();
			}
		});
		btnNewButton.setBounds(10, 150, 205, 50);
		p2.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Record");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				computeBonus();
			}
		});
		btnNewButton_1.setBounds(10, 210, 205, 50);
		p2.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Save");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saveBonus();
			}
		});
		btnNewButton_2.setBounds(10, 270, 205, 50);
		p2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Return to Menu");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MenuAdmin_JFrame().setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(10, 330, 205, 50);
		p2.add(btnNewButton_3);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(10, 94, 205, 45);
		p2.add(textField_11);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(225, 10, 530, 371);
		p2.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "L. Name", "F. Name", "M. Name", "Job Title", "YoS", "Total Salary"
			}
		));

		// Populate the bonus table on open.
		loadBonusTable();
	}

	/** Looks up an employee by the Search ID field and fills the detail fields. */
	private void searchEmployee() {
		String idText = textField.getText().trim();
		if (idText.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Enter an Employee ID to search.");
			return;
		}
		try (Connection con = Conn_DB.connect();
		     PreparedStatement pst = con.prepareStatement("SELECT * FROM addemployee WHERE id = ?")) {
			pst.setString(1, idText);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				textField_1.setText(String.valueOf(rs.getInt("id")));     // Employee ID
				textField_2.setText(rs.getString("first_name"));
				textField_3.setText(rs.getString("middle_name"));
				textField_4.setText(rs.getString("last_name"));
				textField_5.setText(String.valueOf(rs.getInt("age")));
				textField_6.setText(rs.getString("month_combo") + " "
						+ rs.getString("day_combo") + ", " + rs.getString("year_combo")); // Birthdate
				textField_10.setText(rs.getString("gender_combo"));      // Sex
				textField_9.setText(rs.getString("job_title"));
				textField_8.setText(String.valueOf(rs.getDouble("total_salary")));
				textField_7.setText(rs.getString("branch"));
				textField_11.setText(String.valueOf(rs.getInt("years_of_service")));
			} else {
				JOptionPane.showMessageDialog(this, "No employee found with ID " + idText);
			}
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "Search error: " + ex.getMessage());
		}
	}

	/**
	 * Computes a yearly bonus from years of service and shows it in the
	 * Total Salary field: base monthly salary plus 5% per year of service.
	 */
	private void computeBonus() {
		try {
			int yos = Integer.parseInt(textField_11.getText().trim());
			double base = parseTotal(textField_8.getText());
			if (base <= 0) {
				base = 10000; // fallback base bonus when no salary is on record yet
			}
			double bonus = base * (1 + (yos * 0.05));
			textField_8.setText(String.format("%.2f", bonus));
			JOptionPane.showMessageDialog(this,
					"Computed bonus for " + yos + " year(s) of service: ₱" + String.format("%.2f", bonus));
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(this, "Years of Service must be a whole number.");
		}
	}

	/** Persists the years of service and computed total salary for the searched employee. */
	private void saveBonus() {
		String idText = textField_1.getText().trim();
		if (idText.isEmpty()) {
			JOptionPane.showMessageDialog(this, "Search for an employee first.");
			return;
		}
		try (Connection con = Conn_DB.connect();
		     PreparedStatement pst = con.prepareStatement(
		         "UPDATE addemployee SET years_of_service = ?, total_salary = ? WHERE id = ?")) {
			pst.setInt(1, Integer.parseInt(textField_11.getText().trim()));
			pst.setDouble(2, parseTotal(textField_8.getText()));
			pst.setInt(3, Integer.parseInt(idText));
			int rows = pst.executeUpdate();
			JOptionPane.showMessageDialog(this, rows > 0 ? "Bonus record saved." : "No matching employee.");
			loadBonusTable();
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(this, "Years of Service and ID must be numeric.");
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(this, "Save error: " + ex.getMessage());
		}
	}

	/** Loads all employees into the bonus summary table. */
	private void loadBonusTable() {
		DefaultTableModel tbModel = (DefaultTableModel) table.getModel();
		tbModel.setRowCount(0);
		try (Connection con = Conn_DB.connect();
		     PreparedStatement pst = con.prepareStatement(
		         "SELECT id, last_name, first_name, middle_name, job_title, years_of_service, total_salary "
		         + "FROM addemployee ORDER BY id")) {
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				tbModel.addRow(new Object[] {
						rs.getInt("id"),
						rs.getString("last_name"),
						rs.getString("first_name"),
						rs.getString("middle_name"),
						rs.getString("job_title"),
						rs.getInt("years_of_service"),
						String.format("%.2f", rs.getDouble("total_salary"))
				});
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private static double parseTotal(String s) {
		if (s == null) return 0;
		s = s.replace("₱", "").replace(",", "").trim();
		if (s.isEmpty()) return 0;
		try { return Double.parseDouble(s); } catch (NumberFormatException e) { return 0; }
	}
}
