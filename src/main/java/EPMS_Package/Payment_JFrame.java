package EPMS_Package;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.*;
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.io.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Payment_JFrame extends JFrame {

	private JPanel contentPane;
	private JTextField SID_TF;
	private JTextField EID_TF;
	private JTextField FN_TF;
	private JTextField MN_TF;
	private JTextField LN_TF;
	private JTextField AGE_TF;
	private JTextField JT_TF;
	private JTextField PH_TF;
	private JTextField SSS_TF;
	private JTextField MD_TF;
	private JTextField BRANCH_TF;
	private JTextField EL_TF;
	private JTextField TU_TF;
	private JTextField MLS_TF;
	private JTextField RPH_TF;
	private JTextField RDOT_TF;
	private JTextField TD_TF;
	private JTextField TO_TF;
	private JTextField HRDOT_TF;
	private JTextField TS_TF;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Payment_JFrame frame = new Payment_JFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Payment_JFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 775, 726);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(10, 11, 745, 655);
		contentPane.add(p1);
		
		JLabel lb1 = new JLabel("Search ID:");
		lb1.setBounds(10, 30, 130, 30);
		p1.add(lb1);
		
		JLabel lb2 = new JLabel("Employee ID:");
		lb2.setBounds(10, 100, 130, 30);
		p1.add(lb2);
		
		JLabel lb3 = new JLabel("First Name:");
		lb3.setBounds(10, 140, 100, 30);
		p1.add(lb3);
		
		JLabel lb4 = new JLabel("Middle Name:");
		lb4.setBounds(10, 181, 100, 30);
		p1.add(lb4);
		
		JLabel lb5 = new JLabel("Last Name:");
		lb5.setBounds(10, 220, 80, 30);
		p1.add(lb5);
		
		JLabel lb6 = new JLabel("Age:");
		lb6.setBounds(10, 260, 30, 30);
		p1.add(lb6);
		
		JLabel lb7 = new JLabel("Job Title:");
		lb7.setBounds(10, 301, 60, 30);
		p1.add(lb7);
		
		JLabel lb8 = new JLabel("Branch:");
		lb8.setBounds(10, 381, 80, 30);
		p1.add(lb8);
		
		JLabel lb9 = new JLabel("Machine Damage:");
		lb9.setBounds(340, 100, 130, 30);
		p1.add(lb9);
		
		JLabel lb10 = new JLabel("Tardiness / Undertime :");
		lb10.setBounds(340, 181, 152, 30);
		p1.add(lb10);
		
		JLabel lb11 = new JLabel("Total Ovetime:");
		lb11.setBounds(10, 420, 130, 30);
		p1.add(lb11);
		
		JLabel lb12 = new JLabel("SSS:");
		lb12.setBounds(340, 260, 130, 30);
		p1.add(lb12);
		
		JLabel lb13 = new JLabel("Phil. Health:");
		lb13.setBounds(340, 300, 130, 30);
		p1.add(lb13);
		
		JLabel lb14 = new JLabel("Rate / Hour:");
		lb14.setBounds(10, 340, 130, 30);
		p1.add(lb14);
		
		JLabel lb15 = new JLabel("Money Lost / Short:");
		lb15.setBounds(340, 140, 130, 30);
		p1.add(lb15);
		
		JLabel lb16 = new JLabel("Equipment Lost:");
		lb16.setBounds(340, 220, 130, 30);
		p1.add(lb16);
		
		JLabel lb17 = new JLabel("Total Deduction:");
		lb17.setBounds(340, 341, 130, 30);
		p1.add(lb17);
		
		JLabel lb19 = new JLabel("Holiday/Rest Day Overtime:");
		lb19.setBounds(340, 420, 174, 30);
		p1.add(lb19);
		
		JLabel lb18 = new JLabel("Regular Day Overtime:");
		lb18.setBounds(340, 381, 130, 30);
		p1.add(lb18);
		
		SID_TF = new JTextField();
		SID_TF.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {

				String idText = SID_TF.getText().trim();
				if (idText.isEmpty()) {
					return;
				}

				try (Connection con = Conn_DB.connect();
				     PreparedStatement pst = con.prepareStatement(
				         "SELECT * FROM addemployee WHERE id = ?")) {

					pst.setString(1, idText);
					ResultSet rs = pst.executeQuery();
					if (rs.next()) {
						EID_TF.setText(String.valueOf(rs.getInt("id")));
						FN_TF.setText(rs.getString("first_name"));
						MN_TF.setText(rs.getString("middle_name"));
						LN_TF.setText(rs.getString("last_name"));
						AGE_TF.setText(String.valueOf(rs.getInt("age")));
						JT_TF.setText(rs.getString("job_title"));
						BRANCH_TF.setText(rs.getString("branch"));
						RPH_TF.setText(rs.getString("rate"));

						// Deduction breakdown
						MD_TF.setText(rs.getString("machinery_damage"));
						MLS_TF.setText(rs.getString("money_lost"));
						TU_TF.setText(rs.getString("tardiness"));
						EL_TF.setText(rs.getString("equipment_lost"));
						SSS_TF.setText(rs.getString("sss"));
						PH_TF.setText(rs.getString("philhealth"));
						TD_TF.setText(rs.getString("totaldeduct"));

						// Overtime breakdown
						RDOT_TF.setText(rs.getString("regularOT"));
						HRDOT_TF.setText(rs.getString("holidayOT"));
						TO_TF.setText(rs.getString("totalOT"));
						TS_TF.setText(rs.getString("total_salary"));
					}
				}catch(Exception e1) {
					// Ignore transient lookups while the user is still typing.
				}

			}
		});
		SID_TF.setColumns(10);
		SID_TF.setBounds(110, 30, 620, 30);
		p1.add(SID_TF);
		
		EID_TF = new JTextField();
		EID_TF.setColumns(10);
		EID_TF.setBounds(110, 100, 220, 30);
		p1.add(EID_TF);
		
		FN_TF = new JTextField();
		FN_TF.setColumns(10);
		FN_TF.setBounds(110, 140, 220, 30);
		p1.add(FN_TF);
		
		MN_TF = new JTextField();
		MN_TF.setColumns(10);
		MN_TF.setBounds(110, 180, 220, 30);
		p1.add(MN_TF);
		
		LN_TF = new JTextField();
		LN_TF.setColumns(10);
		LN_TF.setBounds(110, 220, 220, 30);
		p1.add(LN_TF);
		
		AGE_TF = new JTextField();
		AGE_TF.setColumns(10);
		AGE_TF.setBounds(110, 260, 220, 30);
		p1.add(AGE_TF);
		
		JT_TF = new JTextField();
		JT_TF.setColumns(10);
		JT_TF.setBounds(110, 300, 220, 30);
		p1.add(JT_TF);
		
		PH_TF = new JTextField();
		PH_TF.setColumns(10);
		PH_TF.setBounds(510, 300, 220, 30);
		p1.add(PH_TF);
		
		SSS_TF = new JTextField();
		SSS_TF.setColumns(10);
		SSS_TF.setBounds(510, 260, 220, 30);
		p1.add(SSS_TF);
		
		MD_TF = new JTextField();
		MD_TF.setColumns(10);
		MD_TF.setBounds(510, 100, 220, 30);
		p1.add(MD_TF);
		
		BRANCH_TF = new JTextField();
		BRANCH_TF.setColumns(10);
		BRANCH_TF.setBounds(110, 381, 220, 30);
		p1.add(BRANCH_TF);
		
		EL_TF = new JTextField();
		EL_TF.setColumns(10);
		EL_TF.setBounds(510, 220, 220, 30);
		p1.add(EL_TF);
		
		TU_TF = new JTextField();
		TU_TF.setColumns(10);
		TU_TF.setBounds(510, 180, 220, 30);
		p1.add(TU_TF);
		
		MLS_TF = new JTextField();
		MLS_TF.setColumns(10);
		MLS_TF.setBounds(510, 140, 220, 30);
		p1.add(MLS_TF);
		
		RPH_TF = new JTextField();
		RPH_TF.setColumns(10);
		RPH_TF.setBounds(110, 340, 220, 30);
		p1.add(RPH_TF);
		
		RDOT_TF = new JTextField();
		RDOT_TF.setColumns(10);
		RDOT_TF.setBounds(510, 380, 220, 30);
		p1.add(RDOT_TF);
		
		TD_TF = new JTextField();
		TD_TF.setColumns(10);
		TD_TF.setBounds(510, 340, 220, 30);
		p1.add(TD_TF);
		
		TO_TF = new JTextField();
		TO_TF.setColumns(10);
		TO_TF.setBounds(110, 420, 220, 30);
		p1.add(TO_TF);
		
		HRDOT_TF = new JTextField();
		HRDOT_TF.setColumns(10);
		HRDOT_TF.setBounds(510, 420, 220, 30);
		p1.add(HRDOT_TF);
		
		JButton B1 = new JButton("Generate Slip");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = EID_TF.getText();
				String first_name = FN_TF.getText();
				String middle_name = MN_TF.getText();
				String last_name = LN_TF.getText();
				String age = AGE_TF.getText();
				String job_title = JT_TF.getText();
				String rate = RPH_TF.getText();
				String branch = BRANCH_TF.getText();
				String machinery_damage = MD_TF.getText();
				String money_lost = MLS_TF.getText();
				String tardiness = TU_TF.getText();
				String equipment_lost = EL_TF.getText();
				String sss = SSS_TF.getText();
				String philhealth = PH_TF.getText();
				String totaldeduct = TD_TF.getText();
				String regularOT =RDOT_TF.getText();
				String holidayOT = HRDOT_TF.getText();
				String totalOT = TO_TF.getText();
				String TSalary = TS_TF.getText();
				
				JFileChooser dialog = new JFileChooser();
				dialog.setSelectedFile(new File(id+"_"+first_name+"_"+last_name+"_"+"-SalarySlip"+".pdf"));
				int result  = dialog.showSaveDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
					String file_path = dialog.getSelectedFile().getPath();

				try {
					Document payslip = new Document();
					PdfWriter mywriter = PdfWriter.getInstance(payslip, new FileOutputStream(file_path));
					
					payslip.open();
					
					payslip.add(new Paragraph("------------------------------------------------------------------------------",FontFactory.getFont(FontFactory.HELVETICA_BOLD,20)));
					payslip.add(new Paragraph("                                    BITE DELIGHT ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,20)));
					payslip.add(new Paragraph("                                                                     Payslip ",FontFactory.getFont(FontFactory.HELVETICA,13)));
					payslip.add(new Paragraph(" ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,15)));
					payslip.add(new Paragraph("                                  Employee Details ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,20)));
					payslip.add(new Paragraph(" ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,15)));
					payslip.add(new Paragraph(" Employee ID			: "+ "			"+id,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" Employee Name		: "+ "			"+last_name +", "+ first_name +" "+ middle_name,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" Age					: "+ "			"+age,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" Job Title			: "+ "			"+job_title,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" Branch				: "+ "			"+branch,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,15)));
					payslip.add(new Paragraph("                                  Salary Deduction ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,20)));
					payslip.add(new Paragraph(" ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,15)));
					payslip.add(new Paragraph(" Machinery Damage	: "+ "			"+machinery_damage,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" Money Lost/Short	: "+ "			"+money_lost,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" Tardinesss/Undertime: "+ "			"+tardiness,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" Equipment Lost		: "+ "			"+equipment_lost,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" PHIL. HEALTH		: "+ "			"+philhealth,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" SSS					: "+ "			"+sss,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" Total Deductions	: "+ "			"+totaldeduct,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,15)));
					payslip.add(new Paragraph("                                   Salary Earnings ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,20)));
					payslip.add(new Paragraph(" ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,15)));
					payslip.add(new Paragraph(" Rate / Hour			: "+ "			"+rate,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" Regular Overtime  	: "+ "			"+regularOT,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" Holiday/Rest Day OT	: "+ "			"+holidayOT,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" Total Salary		: "+ "			"+TSalary,FontFactory.getFont(FontFactory.TIMES,15)));
					payslip.add(new Paragraph(" ",FontFactory.getFont(FontFactory.HELVETICA_BOLD,15)));
					payslip.add(new Paragraph("------------------------------------------------------------------------------",FontFactory.getFont(FontFactory.HELVETICA_BOLD,20)));
					payslip.add(new Paragraph(new Date().toString()));
					
					payslip.close();
					JOptionPane.showMessageDialog(null, "Successfully Generated");
				}catch (Exception e2) {
					JOptionPane.showMessageDialog(null, e2);
				}	
				
				}
			}	
		});
		B1.setBounds(20, 584, 350, 60);
		p1.add(B1);
		
		JButton B2 = new JButton("Return to Menu");
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MenuAdmin_JFrame().setVisible(true);
				dispose();
			}
		});
		B2.setBounds(380, 584, 350, 60);
		p1.add(B2);
		
		TS_TF = new JTextField();
		TS_TF.setColumns(10);
		TS_TF.setBounds(110, 460, 220, 30);
		p1.add(TS_TF);
		
		JLabel lb11_1 = new JLabel("Total Salary:");
		lb11_1.setBounds(10, 460, 130, 30);
		p1.add(lb11_1);
		
		JLabel lb11_1_1 = new JLabel("Total Days:");
		lb11_1_1.setBounds(340, 460, 130, 30);
		p1.add(lb11_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(510, 460, 225, 30);
		p1.add(comboBox);
		
		
	
		
		
		
		
		
		
	}
}
