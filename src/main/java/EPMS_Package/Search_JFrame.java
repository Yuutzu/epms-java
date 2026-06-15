package EPMS_Package;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Search_JFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable tb1;
	private JScrollPane spTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search_JFrame frame = new Search_JFrame();
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
	public Search_JFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 795, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(100, 10, 675, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				loadResults(textField.getText().trim());
			}
		});
		
		JLabel lblSearchID = new JLabel("Search ID:");
		lblSearchID.setBounds(10, 10, 130, 30);
		contentPane.add(lblSearchID);
		
		JPanel p1 = new JPanel();
		p1.setBounds(10, 51, 765, 520);
		contentPane.add(p1);
		p1.setLayout(null);
		
		spTable = new JScrollPane();
		spTable.setBounds(10, 11, 745, 500);
		p1.add(spTable);
		
		tb1 = new JTable();
		spTable.setViewportView(tb1);
		tb1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		tb1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Last Name", "First Name", "Middle Name", "Age", "Birthdate", "Sex", "Gender", "Job Title", "Rate / Hour", "Date Hired", "Branch"
			}
		));
		
		// Load the full list on open.
		loadResults("");
	}

	/**
	 * Reloads the results table. When {@code idFilter} is non-empty, only
	 * employees whose ID starts with that value are shown; otherwise all
	 * employees are listed.
	 */
	private void loadResults(String idFilter) {
		DefaultTableModel tbModel = (DefaultTableModel) tb1.getModel();
		tbModel.setRowCount(0);

		String sql = "SELECT * FROM addemployee";
		boolean filtered = idFilter != null && !idFilter.isEmpty();
		if (filtered) {
			sql += " WHERE CAST(id AS TEXT) LIKE ?";
		}
		sql += " ORDER BY id";

		try (Connection con = Conn_DB.connect();
		     PreparedStatement pst = con.prepareStatement(sql)) {

			if (filtered) {
				pst.setString(1, idFilter + "%");
			}
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				String birthdate = rs.getString("month_combo") + " "
						+ rs.getString("day_combo") + ", " + rs.getString("year_combo");
				Object[] row = {
						rs.getInt("id"),
						rs.getString("last_name"),
						rs.getString("first_name"),
						rs.getString("middle_name"),
						rs.getInt("age"),
						birthdate,
						rs.getString("gender_combo"),
						rs.getString("cstatus_combo"),
						rs.getString("job_title"),
						rs.getString("rate"),
						rs.getString("date_hired"),
						rs.getString("branch")
				};
				tbModel.addRow(row);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
