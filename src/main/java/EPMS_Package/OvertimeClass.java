package EPMS_Package;
import java.awt.EventQueue;
import java.util.Locale;

import java.awt.EventQueue;


import java.awt.Font;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.text.JTextComponent;


import java.sql.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.lang.System.Logger;




	public class OvertimeClass extends JFrame {
		JFrame frame;
		private JTextField firstNameTF;
		private JTextField middleNameTF;
		private JTextField lastNameTF;
		private JRadioButton rdbtnNewRadioButton_1;
		private JComboBox comboBox_6;
		private JLabel lblNewLabel_15;
		private JLabel lblNewLabel_17;
		private JTextField rateTF;
		private JLabel lblNewLabel_18;
		private JTextField branchTF;
		private JLabel lblNewLabel_6;
		private JButton btnDelete;
		private JButton btnUpdate_1;
		private JButton btnClear;
		DefaultTableModel model;
		private JButton btnAdd;
		private JTable table;
		private JScrollPane scrollPane;
		private JTextField idTF;
		private JLabel lblNewLabel_14;
		protected JTable jTable_Display_User;
		private JButton btnNewButton_1;
		private JTextField holidayTF;
		private JButton btnNewButton;
		private JButton btnNewButton_2;
		private JTextField regularTF;
		private JTextField currentregularTF;
		private JLabel lblNewLabel_2_3;
		private JLabel lblNewLabel_2_4;
		private JTextField currentholidayTF;
		private JLabel lblNewLabel_2_5;
		private JTextField totalTF;
		private JTextField currentTotalTF;
		private JButton btnClear_1;
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						OvertimeClass window = new OvertimeClass();
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
		public OvertimeClass() {
			initialize();
			


		}

		/**
		 * Initialize the contents of the frame.
		 */
		
		
		
		
		
		private void initialize() {
			frame = new JFrame();
			frame.setBounds(100, 100, 1200, 750);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(null);
			frame.setVisible(true);
			
			JLabel lblNewLabel = new JLabel("EMPLOYEE DEDUCTION");
			lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
			lblNewLabel.setBounds(25, 11, 204, 30);
			frame.getContentPane().add(lblNewLabel);
			
			
			idTF = new JTextField();
			idTF.setColumns(10);
	        idTF.setEditable(false);
			idTF.setBounds(117, 86, 112, 20);
			frame.getContentPane().add(idTF);
			
			lblNewLabel_14 = new JLabel("ID");
			lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_14.setBounds(25, 79, 31, 30);
			frame.getContentPane().add(lblNewLabel_14);
			
			
			
			
			JLabel lblNewLabel_1 = new JLabel("First Name");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1.setBounds(25, 110, 91, 30);
			frame.getContentPane().add(lblNewLabel_1);
			
			JLabel lblNewLabel_1_1 = new JLabel("Middle Name");
			lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_1.setBounds(25, 144, 91, 30);
			frame.getContentPane().add(lblNewLabel_1_1);
			
			JLabel lblNewLabel_1_2 = new JLabel("Last Name");
			lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_2.setBounds(25, 175, 83, 30);
			frame.getContentPane().add(lblNewLabel_1_2);
			
			firstNameTF = new JTextField();
	        firstNameTF.setEditable(false);
			firstNameTF.setBounds(117, 117, 112, 20);
			frame.getContentPane().add(firstNameTF);
			firstNameTF.setColumns(10);
			
			middleNameTF = new JTextField();
			middleNameTF.setColumns(10);
	        middleNameTF.setEditable(false);
			middleNameTF.setBounds(117, 151, 112, 20);
			frame.getContentPane().add(middleNameTF);
			
			lastNameTF = new JTextField();
			lastNameTF.setColumns(10);
	        lastNameTF.setEditable(false);
			lastNameTF.setBounds(117, 182, 112, 20);
			frame.getContentPane().add(lastNameTF);
			
			
			
			
			
			
			
			comboBox_6 = new JComboBox();
			comboBox_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					
	                String selectedOption = (String) comboBox_6.getSelectedItem();
	                
	                switch (selectedOption) {
	                case "Cashier":
	                    rateTF.setText("₱58");
	                    break;
	                case "Server":
	                    rateTF.setText("₱56");
	                    break;
	                case "Cook":
	                	rateTF.setText("₱60");
	                    break;
	                case "Dishwasher":
	                	rateTF.setText("₱56");
	                	break;
	                default:
	                	rateTF.setText(""); // Clear the text field if none of the options match
	                    break;
					
				}}
			});
			comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Cashier", "Server", "Cook", "Dishwasher"}));
			comboBox_6.setBounds(117, 220, 100, 22);
			frame.getContentPane().add(comboBox_6);
			
			lblNewLabel_17 = new JLabel("Rate/hour");
			lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_17.setBounds(25, 246, 91, 30);
			frame.getContentPane().add(lblNewLabel_17);
			
			rateTF = new JTextField();
			rateTF.setColumns(10);
			rateTF.setBounds(117, 253, 112, 20);
			rateTF.setEditable(false);
			frame.getContentPane().add(rateTF);
			
			
			lblNewLabel_18 = new JLabel("Branch");
			lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_18.setBounds(27, 277, 89, 30);
			frame.getContentPane().add(lblNewLabel_18);
			
			branchTF = new JTextField();
			branchTF.setColumns(10);
	        branchTF.setEditable(false);
			branchTF.setBounds(117, 284, 112, 20);
			frame.getContentPane().add(branchTF);
			
			
			
			btnNewButton_1 = new JButton("Back to Menu");
			btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new MenuAdmin_JFrame().setVisible(true);
					frame.dispose();
				}
			});
			btnNewButton_1.setBounds(464, 647, 110, 37);
			frame.getContentPane().add(btnNewButton_1);
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			scrollPane = new JScrollPane();
			scrollPane.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					
				}
			});
			scrollPane.setBounds(454, 38, 663, 521);
			frame.getContentPane().add(scrollPane);
			
			table = new JTable();
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					DefaultTableModel tb1Model=(DefaultTableModel)table.getModel();
					
					String tb1id = tb1Model.getValueAt(table.getSelectedRow(), 0). toString();
					String tb1first_name = tb1Model.getValueAt(table.getSelectedRow(), 1). toString();
					String tb1middle_name = tb1Model.getValueAt(table.getSelectedRow(), 2). toString();
					String tb1last_name =tb1Model.getValueAt(table.getSelectedRow(), 3). toString();
					String tb1job_title=tb1Model.getValueAt(table.getSelectedRow(), 4). toString();
					String tb1rate=tb1Model.getValueAt(table.getSelectedRow(), 5). toString();
					String tb1branch=tb1Model.getValueAt(table.getSelectedRow(), 6). toString();
					String tb1regularOT=tb1Model.getValueAt(table.getSelectedRow(), 7). toString();
					String tb1holidayOT=tb1Model.getValueAt(table.getSelectedRow(), 8). toString();
					String tb1total=tb1Model.getValueAt(table.getSelectedRow(), 9). toString();

					
					
					idTF.setText(tb1id);
					firstNameTF.setText(tb1first_name);
					middleNameTF.setText(tb1middle_name);
					lastNameTF.setText(tb1last_name);
					comboBox_6.setSelectedItem(tb1job_title);
					rateTF.setText(tb1rate);
					branchTF.setText(tb1branch);
					regularTF.setText(tb1regularOT);
					holidayTF.setText(tb1holidayOT);
					totalTF.setText(tb1total);
					
					
								}
				
				
			});
			scrollPane.setViewportView(table);
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"ID","FirstName", "MiddleName", "LastName","Job Title","R/hr","Branch","Regular OT","Holiday OT","Total"
				}
			));
			
			JLabel lblNewLabel_2 = new JLabel("OVERTIME RECORD");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel_2.setBounds(126, 333, 173, 30);
			frame.getContentPane().add(lblNewLabel_2);
			
			JLabel lblNewLabel_2_1 = new JLabel("Regular Day Overtime");
			lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_2_1.setBounds(13, 449, 165, 30);
			frame.getContentPane().add(lblNewLabel_2_1);
			
			JLabel lblNewLabel_2_3_1 = new JLabel("Holiday/Rest Day Overtime");
			lblNewLabel_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_2_3_1.setBounds(13, 522, 187, 20);
			frame.getContentPane().add(lblNewLabel_2_3_1);
			
			holidayTF = new JTextField();
	        holidayTF.setEditable(false);
			holidayTF.setBounds(213, 524, 86, 20);
			frame.getContentPane().add(holidayTF);
			holidayTF.setColumns(10);
			
			btnNewButton = new JButton("SHOW TABLE");
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//double money_lost = Double.parseDouble(lostTF.getText());
		            //String lostcurrency = String.format("₱%.2f", money_lost);
		            //lostTF.setText(lostcurrency);
		            
				
					
					try {
						Connection con = Conn_DB.connect();
						Statement stmt=con.createStatement();
						ResultSet rs=stmt.executeQuery("select * from addemployee");
						DefaultTableModel tb1Model = (DefaultTableModel)table.getModel();
						tb1Model.setRowCount(0); // avoid duplicate rows on repeated clicks
						while(rs.next()) {

							String id = String.valueOf(rs.getInt("id"));
							String first_name = rs.getString("first_name");
							String middle_name = rs.getString("middle_name");
							String last_name = rs.getString("last_name");
							String jobTitle_combo = rs.getString("job_title");
							String rate = rs.getString("rate");
							String branch = rs.getString("branch");
							String regularOT = rs.getString("regularOT");
							String holidayOT = rs.getString("holidayOT");
							String totalOT = rs.getString("totalOT");


						String tbData[] = {id,first_name,middle_name,last_name,jobTitle_combo,rate,branch,regularOT,holidayOT,totalOT};
						tb1Model.addRow(tbData);
						
						
						
				}
						
						con.close();
						
					}catch(Exception e1) {
						System.out.println(e1.getMessage());
					}}
			});
			btnNewButton.setBounds(464, 570, 122, 37);
			frame.getContentPane().add(btnNewButton);
			
			
			
			
			
			btnNewButton_2 = new JButton("COMPUTE");
			btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
			       

					 try {
						 //TOTAL HISTORY DATA
				            String first_name = firstNameTF.getText();
				            String middle_name = middleNameTF.getText();
				            String last_name = lastNameTF.getText();
				            String rate = rateTF.getText();
				            String branch = branchTF.getText();
				            String id = idTF.getText();
				            String job_title = comboBox_6.getSelectedItem().toString();
				            
				            
				            //regular
				            double regularOT = Double.parseDouble(regularTF.getText());
				            String regularcurrency = String.format("%.2f", regularOT);
				           regularTF.setText(regularcurrency);
				           
				           
				            
				            double currentregularOT = Double.parseDouble(currentregularTF.getText());
				            String currentregularcurrency = String.format("%.2f", currentregularOT);
				            currentregularTF.setText(currentregularcurrency);
				            
				            
				            
				            
				            //holiday
				            
				            double holidayOT = Double.parseDouble(holidayTF.getText());
				            String holidaycurrency = String.format("%.2f", holidayOT);
				            holidayTF.setText(holidaycurrency);
				            
				            double currentholidayOT = Double.parseDouble(currentholidayTF.getText());
				            String currentholidaycurrency = String.format("%.2f", currentholidayOT);
				            currentholidayTF.setText(currentholidaycurrency);
				            
				
				            
				           
				            
				            
				            /////////////////////////////////////////////////////SUM UP
				            double totalregular = currentregularOT +regularOT;
				            String totregular = String.format("%.2f", totalregular);
				            regularTF.setText(totregular);
				            
				            
				            double totalholiday = currentholidayOT +holidayOT;
				            String totholiday = String.format("%.2f", totalholiday);
				            holidayTF.setText(totholiday);
				            
				            
				            //////////////////////////////////////
				            
				            double currenttotalOT = currentregularOT + currentholidayOT;
				            String atar = String.format("%.2f", currenttotalOT);
				            currentTotalTF.setText(atar);
				            
				            
				            double totalOT= regularOT + holidayOT;
				            String ats = String.format("%.2f", totalOT);
				            totalTF.setText(ats);
				            
				            
				            
				            
				            
				            
				            
				            
				            
				            Connection con = Conn_DB.connect();
				            String sql = "UPDATE addemployee SET first_name=?, middle_name=?, last_name=?, job_title=?, rate=?, branch=?, regularOT=?,currentregularOT=?,holidayOT=?,currentholidayOT=?, totalOT=? WHERE id=?";
				            PreparedStatement pst = con.prepareStatement(sql);

				            // Set the values for the placeholders in the PreparedStatement
				            pst.setString(1, first_name);
				            pst.setString(2, middle_name);
				            pst.setString(3, last_name);
				            pst.setString(4, job_title);
				            pst.setString(5, rate);
				            pst.setString(6, branch);
				            
				            pst.setDouble(7, totalregular);
				            pst.setDouble(8, currentregularOT);
				            
				            
				            pst.setDouble(9, totalholiday);
				            pst.setDouble(10, currentholidayOT);

				            pst.setDouble(11, totalOT);


				            pst.setString(12, id);

				            int rowsUpdated = pst.executeUpdate();

				            if (rowsUpdated > 0) {
				                JOptionPane.showMessageDialog(null, "Record Updated");
				            } else {
				                JOptionPane.showMessageDialog(null, "No records were updated");
				            }

				            pst.close();
				            con.close();
					 } catch (NumberFormatException e1) {
						    // Handle the exception if a non-numeric value was entered
						    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
						} catch (Exception e2) {
						    // Handle other exceptions
						    JOptionPane.showMessageDialog(null, "An error occurred: " + e2.getMessage());
						}}
	    		});
	   

			btnNewButton_2.setBounds(305, 640, 112, 30);
			frame.getContentPane().add(btnNewButton_2);
			
			regularTF = new JTextField();
	        regularTF.setEditable(false);
			regularTF.setBounds(213, 456, 86, 20);
			frame.getContentPane().add(regularTF);
			regularTF.setColumns(10);
			
			JLabel lblNewLabel_1_2_1 = new JLabel("Job Title");
			lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_2_1.setBounds(25, 216, 83, 30);
			frame.getContentPane().add(lblNewLabel_1_2_1);
			
			JLabel lblNewLabel_2_2 = new JLabel("_________________________________________________");
			lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_2_2.setBounds(26, 358, 418, 30);
			frame.getContentPane().add(lblNewLabel_2_2);
			
			JLabel lblNewLabel_2_2_1 = new JLabel("_________________________________________________");
			lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_2_2_1.setBounds(27, 599, 418, 30);
			frame.getContentPane().add(lblNewLabel_2_2_1);
			
			currentregularTF = new JTextField();
			currentregularTF.setColumns(10);
			currentregularTF.setBounds(331, 456, 86, 20);
			frame.getContentPane().add(currentregularTF);
			
			lblNewLabel_2_3 = new JLabel("TOTAL HISTORY");
			lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_2_3.setBounds(198, 386, 118, 20);
			frame.getContentPane().add(lblNewLabel_2_3);
			
			lblNewLabel_2_4 = new JLabel("Input Hours");
			lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_2_4.setBounds(337, 386, 118, 20);
			frame.getContentPane().add(lblNewLabel_2_4);
			
			currentholidayTF = new JTextField();
			currentholidayTF.setColumns(10);
			currentholidayTF.setBounds(331, 524, 86, 20);
			frame.getContentPane().add(currentholidayTF);
			
			lblNewLabel_2_5 = new JLabel("Total:");
			lblNewLabel_2_5.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_2_5.setBounds(13, 571, 165, 30);
			frame.getContentPane().add(lblNewLabel_2_5);
			
			totalTF = new JTextField();
			totalTF.setEditable(false);
			totalTF.setColumns(10);
			totalTF.setBounds(213, 578, 86, 20);
			frame.getContentPane().add(totalTF);
			
			currentTotalTF = new JTextField();
			currentTotalTF.setColumns(10);
			currentTotalTF.setBounds(337, 578, 86, 20);
			frame.getContentPane().add(currentTotalTF);
			
			JComboBox comboBoxHoliday = new JComboBox();
			comboBoxHoliday.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					double salary=443;
                	double div =55.375;
                	double total=0;
                	double tots=0;
					 String selectedOption1 = (String) comboBoxHoliday.getSelectedItem();
		                
		                switch (selectedOption1) {
		               
		                	
		                    
		                case "1 hour":
		                	
		                	total = div*1.30;
		                	tots=total*1;
		                    String peso1 =  String.format("%.2f", tots);
		                    currentholidayTF.setText(peso1);
		                    break;
		                    
		                case "2 hours":
		                	total = div*1.30;
		                	tots=total*2;
		                    String peso2 =  String.format("%.2f", tots);
		                    currentholidayTF.setText(peso2);
		                    break;
		                    
		                case "3 hours":
		                	total = div*1.30;
		                	tots=total*3;
		                    String peso3 =  String.format("%.2f", tots);
		                    currentholidayTF.setText(peso3);
		                    break;
		                
		                 case "4 hours":
			                	total = div*1.30;
			                	tots=total*4;
			                    String peso4 =  String.format("%.2f", tots);
			                    currentholidayTF.setText(peso4);
			                    break;
			                
		                   case "5 hours":
			                	total = div*1.30;
			                	tots=total*5;
			                    String peso5 =  String.format("%.2f", tots);
			                    currentholidayTF.setText(peso5);
			                    break;
		                
		                   case "6 hours":
			                	total = div*1.30;
			                	tots=total*6;
			                    String peso6 =  String.format("%.2f", tots);
			                    currentholidayTF.setText(peso6);
			                    break;
			                    
		                   case "7 hours":
			                	total = div*1.30;
			                	tots=total*7;
			                    String peso7 =  String.format("%.2f", tots);
			                    currentholidayTF.setText(peso7);
			                    break;
			                    
			                    
		                   case "8 hours":
			                	total = div*1.30;
			                	tots=total*8;
			                    String peso8 =  String.format("%.2f", tots);
			                    currentholidayTF.setText(peso8);
			                    break;
		                
		                
		                
		                }
				}
			});
			comboBoxHoliday.setModel(new DefaultComboBoxModel(new String[] {"1 hour", "2 hours", "3 hours", "4 hours", "5 hours", "6 hours", "7 hours", "8 hours"}));
			comboBoxHoliday.setBounds(341, 499, 76, 22);
			frame.getContentPane().add(comboBoxHoliday);
			
			JComboBox comboBoxRegular = new JComboBox();
			comboBoxRegular.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					double salary=443;
                	double div =55.375;
                	double total=0;
                	double tots=0;
					 String selectedOption1 = (String) comboBoxHoliday.getSelectedItem();
		                
		                switch (selectedOption1) {
		              
		                case "1 hour":
		                	
		                	total = div*1.250;
		                	tots=total*1;
		                    String peso1 =  String.format("%.2f", tots);
		                    currentregularTF.setText(peso1);
		                    break;
		                    
		                case "2 hours":
		                	total = div*1.25;
		                	tots=total*2;
		                    String peso2 =  String.format("%.2f", tots);
		                    currentregularTF.setText(peso2);
		                    break;
		                    
		                case "3 hours":
		                	total = div*1.25;
		                	tots=total*3;
		                    String peso3 =  String.format("%.2f", tots);
		                    currentregularTF.setText(peso3);
		                    break;
		                
		                 case "4 hours":
			                	total = div*1.25;
			                	tots=total*4;
			                    String peso4 =  String.format("%.2f", tots);
			                    currentregularTF.setText(peso4);
			                    break;
			                
		                   case "5 hours":
			                	total = div*1.25;
			                	tots=total*5;
			                    String peso5 =  String.format("%.2f", tots);
			                    currentregularTF.setText(peso5);
			                    break;
		                
		                   case "6 hours":
			                	total = div*1.25;
			                	tots=total*6;
			                    String peso6 =  String.format("%.2f", tots);
			                    currentregularTF.setText(peso6);
			                    break;
			                    
		                   case "7 hours":
			                	total = div*1.25;
			                	tots=total*7;
			                    String peso7 =  String.format("%.2f", tots);
			                    currentregularTF.setText(peso7);
			                    break;
			                    
			                    
		                   case "8 hours":
			                	total = div*1.25;
			                	tots=total*8;
			                    String peso8 =  String.format("%.2f", tots);
			                    currentregularTF.setText(peso8);
			                    break;
		                
		                }
				}
			});
			comboBoxRegular.setModel(new DefaultComboBoxModel(new String[] {"1 hour", "2 hours", "3 hours", "4 hours", "5 hours", "6 hours", "7 hours", "8 hours"}));
			comboBoxRegular.setBounds(341, 423, 76, 22);
			frame.getContentPane().add(comboBoxRegular);
			
			btnClear_1 = new JButton("CLEAR");
			btnClear_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					

					firstNameTF.setText("");
					middleNameTF.setText("");
					lastNameTF.setText("");
					rateTF.setText("");
					branchTF.setText("");
					idTF.setText("");
					holidayTF.setText("");
					currentholidayTF.setText("");
					regularTF.setText("");
					currentregularTF.setText("");
					totalTF.setText("");
					currentTotalTF.setText("");



					
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					model.setRowCount(0);
				}
			});
			btnClear_1.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnClear_1.setBounds(628, 577, 122, 37);
			frame.getContentPane().add(btnClear_1);
			

			
			Object pass = null;
			
		

		    }
		

		public void setVisible(boolean b) {
			// TODO Auto-generated method stub
			

		}
	}
