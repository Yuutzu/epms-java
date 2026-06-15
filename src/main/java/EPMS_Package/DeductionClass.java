package EPMS_Package;

import java.awt.EventQueue;
import javax.swing.JComboBox;
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




	public class DeductionClass extends JFrame {
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
		private JTextField sssTF;
		private JTextField phTF;
		private JButton btnNewButton;
		private JButton btnNewButton_2;
		private JTextField totalTF;
		private JTextField lostTF;
		private JTextField currentsssTF;
		private JTextField currentphTF;
		private JTextField currenttotalTF;
		private JTextField currentlostTF;
		private JLabel lblNewLabel_2_3;
		private JLabel lblNewLabel_2_4;
		private JTextField damageTF;
		private JTextField eqTF;
		private JTextField currenttardTF;
		private JTextField currentdamageTF;
		private JTextField currenteqTF;
		private JTextField tardTF;
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						DeductionClass window = new DeductionClass();
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
		public DeductionClass() {
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
		                case "Cashier","Server","Cook","Dishwasher":
		                    rateTF.setText("₱443");
		                    break;
		              
		                default:
		                	rateTF.setText(""); // Clear the text field if none of the options match
		                    break;
						
					}}
				});
			comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Cashier", "Server", "Cook", "Dishwasher"}));
	        comboBox_6.setEditable(false);
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
			scrollPane.setBounds(439, 38, 690, 521);
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
					String tb1moneylost=tb1Model.getValueAt(table.getSelectedRow(), 7). toString();
					
					String tb1machinery_damage=tb1Model.getValueAt(table.getSelectedRow(), 8). toString();
					String tb1equipment_lost=tb1Model.getValueAt(table.getSelectedRow(), 9). toString();
					String tb1tardiness=tb1Model.getValueAt(table.getSelectedRow(), 10). toString();

					
					String tb1sss=tb1Model.getValueAt(table.getSelectedRow(), 11). toString();
					String tb1philhealth=tb1Model.getValueAt(table.getSelectedRow(), 12). toString();
					String tb1total=tb1Model.getValueAt(table.getSelectedRow(), 13). toString();

					
					
					idTF.setText(tb1id);
					firstNameTF.setText(tb1first_name);
					middleNameTF.setText(tb1middle_name);
					lastNameTF.setText(tb1last_name);
					comboBox_6.setSelectedItem(tb1job_title);
					rateTF.setText(tb1rate);
					branchTF.setText(tb1branch);
					lostTF.setText(tb1moneylost);
					damageTF.setText(tb1equipment_lost);
					eqTF.setText(tb1machinery_damage);
					tardTF.setText(tb1tardiness);
					sssTF.setText(tb1sss);
					phTF.setText(tb1philhealth);
					totalTF.setText(tb1total);
					
					
					
								}
				
				
			});
			scrollPane.setViewportView(table);
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"ID","F.Name", "M.Name", "L.Name","Job Title","R/hr","Branch","M.Damage","EquipLost","Tardiness","Money Lost","SSS","PhHealth","Total"
				}
			));
			
			JLabel lblNewLabel_2 = new JLabel("DEDUCTION RECORD");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblNewLabel_2.setBounds(127, 315, 173, 30);
			frame.getContentPane().add(lblNewLabel_2);
			
			JLabel lblNewLabel_2_1 = new JLabel("Money Lost/Short");
			lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_2_1.setBounds(22, 372, 130, 30);
			frame.getContentPane().add(lblNewLabel_2_1);
			
			JLabel lblNewLabel_2_3_1 = new JLabel("SSS");
			lblNewLabel_2_3_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_2_3_1.setBounds(25, 568, 103, 20);
			frame.getContentPane().add(lblNewLabel_2_3_1);
			
			JLabel lblNewLabel_2_3_2 = new JLabel("PHILHEALTH");
			lblNewLabel_2_3_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_2_3_2.setBounds(25, 599, 103, 20);
			frame.getContentPane().add(lblNewLabel_2_3_2);
			
			sssTF = new JTextField();
			sssTF.setBounds(131, 570, 86, 20);
			frame.getContentPane().add(sssTF);
			sssTF.setColumns(10);
			
			phTF = new JTextField();
			phTF.setColumns(10);
			phTF.setBounds(143, 601, 86, 20);
			frame.getContentPane().add(phTF);
			
			btnNewButton = new JButton("SHOW TABLE");
			btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//double money_lost = money(lostTF.getText());
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
					
							String money_lost = rs.getString("money_lost");
							String machinery_damage = rs.getString("machinery_damage");
							String equipment_lost = rs.getString("equipment_lost");
							String tardiness = rs.getString("tardiness");
							String sss = rs.getString("sss");
							String philhealth = rs.getString("philhealth");
							String totaldeduct = rs.getString("totaldeduct");


							
						String tbData[] = {id,first_name,middle_name,last_name,jobTitle_combo,rate,branch,money_lost,machinery_damage,equipment_lost,tardiness,sss,philhealth,totaldeduct};
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
				            
							


				            
				            //moneyLOST
				          
				            double money_lost = money(lostTF.getText());
				            String lostcurrency = String.format("₱%.2f", money_lost);
				            lostTF.setText(lostcurrency);
				            
				            double currentmoney_lost = money(currentlostTF.getText());
				            String currentlostcurrency = String.format("₱%.2f", currentmoney_lost);
				            currentlostTF.setText(currentlostcurrency);
				            
				            
				            
				            //machineryDamage
				            
				            double machinery_damage = money(damageTF.getText());
				            String damagecurrency = String.format("₱%.2f", machinery_damage);
				            damageTF.setText(damagecurrency);
				            
				            double currentmachinery_damage = money(currentdamageTF.getText());
				            String currentdamagecurrency = String.format("₱%.2f", currentmachinery_damage);
				            currentdamageTF.setText(currentdamagecurrency);
				            
				            
				            //equipmentLost
				            
				            
				            double equipment_lost = money(eqTF.getText());
				            String eqcurrency = String.format("₱%.2f", equipment_lost);
				            eqTF.setText(eqcurrency);
				            
				            double currentequipment_lost = money(currenteqTF.getText());
				            String currenteqcurrency = String.format("₱%.2f", currentequipment_lost);
				            currenteqTF.setText(currenteqcurrency);
				            
				            
				            //tardiness

				            double tardiness = money(tardTF.getText());
				            String tardinesscurrency = String.format("₱%.2f", tardiness);
				            tardTF.setText(tardinesscurrency);
				            
				            double currenttardiness = money(currenttardTF.getText());
				            String currenttardinesscurrency = String.format("₱%.2f", currenttardiness);
				            currenttardTF.setText(currenttardinesscurrency);
				            
				            
				            
				            //SSS
				            
				            double sss = money(sssTF.getText());
				            String ssscurrency = String.format("₱%.2f", sss);
				            sssTF.setText(ssscurrency);
				            
				            double currentsss = money(currentsssTF.getText());
				            String currentssscurrency = String.format("₱%.2f", currentsss);
				            currentsssTF.setText(currentssscurrency);
				            
				
				            
				            //philHealth
				      
				            double philhealth = money(phTF.getText());
				            String phcurrency = String.format("₱%.2f", philhealth);
				            phTF.setText(phcurrency);
				            
				            double currentphilhealth = money(currentphTF.getText());
				            String currentphilhealthcurrency = String.format("₱%.2f", currentphilhealth);
				            currentphTF.setText(currentphilhealthcurrency);
		    
				            
				            
				            /////////////////////////////////////////////////////SUM UP
				            
				            
				            double totallost = currentmoney_lost +money_lost;
				            String totlost = String.format("₱%.2f", totallost);
				            lostTF.setText(totlost);
				            
				            
				            double totaldamage = currentmachinery_damage +machinery_damage;
				            String totdamage = String.format("₱%.2f", totaldamage);
				            damageTF.setText(totdamage);
				            
				            
				            double totaleqlost = currentequipment_lost +equipment_lost;
				            String totdeqlost = String.format("₱%.2f", totaleqlost);
				            eqTF.setText(totdeqlost);
				            
				            
				            double totaltardiness= currenttardiness +tardiness;
				            String tottardiness = String.format("₱%.2f", totaltardiness);
				            tardTF.setText(tottardiness);
				            
				            
				            double totalsss = currentsss +sss;
				            String totsss = String.format("₱%.2f", totalsss);
				            sssTF.setText(totsss);
				            
				            
				            double totalph = currentphilhealth +philhealth;
				            String totph = String.format("₱%.2f", totalph);
				            phTF.setText(totph);
				            
				            
				            
				            
				            
				            /////////////////////////////////////
				            
				            double currenttotaldeduct = currentmoney_lost +currentmachinery_damage+ +currentequipment_lost+ currenttardiness+ currentsss + currentphilhealth;
				            String ata = String.format("₱%.2f", currenttotaldeduct);
				            currenttotalTF.setText(ata);
				            
				            
				            double totaldeduct = totallost +totaldamage+totaleqlost+totaltardiness+ totalsss + totalph;
				            String at = String.format("₱%.2f", totaldeduct);
				            totalTF.setText(at);
				            
				            
				        
				            
				            
				            Connection con = Conn_DB.connect();
				            String sql = "UPDATE addemployee SET first_name=?, middle_name=?, "
				            		+ "last_name=?, job_title=?, rate=?, branch=?, money_lost=?,"
				            		+ "currentmoney_lost=?, machinery_damage=?, currentmachinery_damage=?,"
				            		+ " equipment_lost=?, currentequipment_lost=?,tardiness=?, currenttardiness=?, sss=?,"
				            		+ " currentsss=?, philhealth=?,currentphilhealth=?, totaldeduct=? WHERE id=?";
				            PreparedStatement pst = con.prepareStatement(sql);

				            // Set the values for the placeholders in the PreparedStatement
				            pst.setString(1, first_name);
				            pst.setString(2, middle_name);
				            pst.setString(3, last_name);
				            pst.setString(4, job_title);
				            pst.setString(5, rate);
				            pst.setString(6, branch);
				            
				            pst.setDouble(7, totallost);
				            pst.setDouble(8, currentmoney_lost);
				            
				            pst.setDouble(9, totaldamage);
				            pst.setDouble(10, currentmachinery_damage);
				            
				            pst.setDouble(11, totaleqlost);
				            pst.setDouble(12, currentequipment_lost);
				            
				            
				            pst.setDouble(13, totaltardiness);
				            pst.setDouble(14, currenttardiness);
				            
				            
				            
				            
				          

				            pst.setDouble(15, totalsss);
				            pst.setDouble(16, currentsss);


				            pst.setDouble(17, totalph);
				            pst.setDouble(18, currentphilhealth);

				            pst.setDouble(19, totaldeduct);

				            pst.setString(20, id);

				            int rowsUpdated = pst.executeUpdate();

				            if (rowsUpdated > 0) {
				                JOptionPane.showMessageDialog(null, "Record Updated");
				            } else {
				                JOptionPane.showMessageDialog(null, "No records were updated");
				            }

				            pst.close();
				            con.close();
				        } catch (Exception e1) {
				            JOptionPane.showMessageDialog(null, e1);
				        }
	    			}
	    		});
	   

			btnNewButton_2.setBounds(303, 670, 112, 30);
			frame.getContentPane().add(btnNewButton_2);
			
			totalTF = new JTextField();
			totalTF.setBounds(131, 634, 86, 20);
			frame.getContentPane().add(totalTF);
			totalTF.setColumns(10);
			
			lostTF = new JTextField();
			lostTF.setBounds(158, 379, 86, 20);
			frame.getContentPane().add(lostTF);
			lostTF.setColumns(10);
			
			JLabel lblNewLabel_1_2_1 = new JLabel("Job Title");
			lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_1_2_1.setBounds(25, 216, 83, 30);
			frame.getContentPane().add(lblNewLabel_1_2_1);
			
			JLabel lblNewLabel_2_2 = new JLabel("_________________________________________________");
			lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_2_2.setBounds(25, 318, 418, 30);
			frame.getContentPane().add(lblNewLabel_2_2);
			
			JLabel lblNewLabel_2_2_1 = new JLabel("_________________________________________________");
			lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
			lblNewLabel_2_2_1.setBounds(25, 529, 418, 30);
			frame.getContentPane().add(lblNewLabel_2_2_1);
			
			JLabel lblNewLabel_2_3_2_1 = new JLabel("Total:");
			lblNewLabel_2_3_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_2_3_2_1.setBounds(25, 632, 103, 20);
			frame.getContentPane().add(lblNewLabel_2_3_2_1);
			
			currentsssTF = new JTextField();
			currentsssTF.setColumns(10);
			currentsssTF.setBounds(303, 568, 86, 20);
			frame.getContentPane().add(currentsssTF);
			
			currentphTF = new JTextField();
			currentphTF.setColumns(10);
			currentphTF.setBounds(303, 601, 86, 20);
			frame.getContentPane().add(currentphTF);
			
			currenttotalTF = new JTextField();
			currenttotalTF.setColumns(10);
			currenttotalTF.setBounds(303, 634, 86, 20);
			frame.getContentPane().add(currenttotalTF);
			
			currentlostTF = new JTextField();
			currentlostTF.setColumns(10);
			currentlostTF.setBounds(315, 379, 86, 20);
			frame.getContentPane().add(currentlostTF);
			
			lblNewLabel_2_3 = new JLabel("TOTAL HISTORY");
			lblNewLabel_2_3.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_2_3.setBounds(148, 351, 118, 20);
			frame.getContentPane().add(lblNewLabel_2_3);
			
			lblNewLabel_2_4 = new JLabel("Input Current");
			lblNewLabel_2_4.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_2_4.setBounds(311, 351, 118, 20);
			frame.getContentPane().add(lblNewLabel_2_4);
			
			JLabel lblNewLabel_2_1_1 = new JLabel("Equipment Lost");
			lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_2_1_1.setBounds(22, 429, 165, 30);
			frame.getContentPane().add(lblNewLabel_2_1_1);
			
			JLabel lblNewLabel_2_1_1_1 = new JLabel("Machinery Damage");
			lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_2_1_1_1.setBounds(22, 400, 130, 30);
			frame.getContentPane().add(lblNewLabel_2_1_1_1);
			
			damageTF = new JTextField();
			damageTF.setColumns(10);
			damageTF.setBounds(158, 407, 86, 20);
			frame.getContentPane().add(damageTF);
			
			eqTF = new JTextField();
			eqTF.setColumns(10);
			eqTF.setBounds(158, 436, 86, 20);
			frame.getContentPane().add(eqTF);
			
			JLabel lblNewLabel_2_1_1_2 = new JLabel("Tardiness/Undertime");
			lblNewLabel_2_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
			lblNewLabel_2_1_1_2.setBounds(10, 498, 162, 30);
			frame.getContentPane().add(lblNewLabel_2_1_1_2);
			
			currenttardTF = new JTextField();
			currenttardTF.setEditable(true);
			currenttardTF.setColumns(10);
			currenttardTF.setBounds(315, 505, 86, 20);
			frame.getContentPane().add(currenttardTF);
			
			currentdamageTF = new JTextField();
			currentdamageTF.setEditable(true);
			currentdamageTF.setColumns(10);
			currentdamageTF.setBounds(315, 410, 86, 20);
			frame.getContentPane().add(currentdamageTF);
			
			currenteqTF = new JTextField();
			currenteqTF.setEditable(true);
			currenteqTF.setColumns(10);
			currenteqTF.setBounds(315, 436, 86, 20);
			frame.getContentPane().add(currenteqTF);
			
			JComboBox tardCombo = new JComboBox();
			tardCombo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					double salary=443;
                	double div =55.375;
                	double total=0;
                	double tots=0;
					 String selectedOption1 = (String) tardCombo.getSelectedItem();
		                
		                switch (selectedOption1) {
		                case "On-time":
		                	
		                	currenttardTF.setText("0");
		                    break;
		                    
		                case "16 mins to 1 hour":
		                	
		                	total = salary / 8;
		                    String peso = "₱" + String.format("%.2f", total);
		                    currenttardTF.setText(peso);
		                    break;
		                    
		                case "1 to 2 hour/s":
		                	total=salary/8;
		                	tots=total*2;
		                	String peso2 = "₱" + String.format("%.2f", tots);
		                    currenttardTF.setText(peso2);
		                    break;
		                    
		                case "2 to 3 hours":
		                	total=salary/8;
		                	tots=total*3;
		                	String peso3 = "₱" + String.format("%.2f", tots);
		                    currenttardTF.setText(peso3);
		                    break;
		                    
		                    
		                case "3 to 4 hours":
		                	total=salary/8;
		                	tots=total*4;
		                	String peso4 = "₱" + String.format("%.2f", tots);
		                    currenttardTF.setText(peso4);
		                    break;
		                    
		                case "4 to 5 hours":
		                	total=salary/8;
		                	tots=total*5;
		                	String peso5 = "₱" + String.format("%.2f", tots);
		                    currenttardTF.setText(peso5);
		                    break;
		                  
		                case "5 to 6 hours":
		                	total=salary/8;
		                	tots=total*6;
		                	String peso6 = "₱" + String.format("%.2f", tots);
		                    currenttardTF.setText(peso6);
		                    break;
		                    
		                case "6 to 7 hours":
		                	total=salary/8;
		                	tots=total*7;
		                	String peso7 = "₱" + String.format("%.2f", tots);
		                    currenttardTF.setText(peso7);
		                    break;
		                    
		                case "7 to 8 hours":
		                	total=salary/8;
		                	tots=total*8;
		                	String peso8 = "₱" + String.format("%.2f", tots);
		                    currenttardTF.setText(peso8);
		                    break;
		                    
		                    
		                default:
		                	currenttardTF.setText(""); 
		                    break;
						
					
					
					
					
		                }
					
				}
			});
			tardCombo.setModel(new DefaultComboBoxModel(new String[] {"On-time", "16 mins to 1 hour", "1 to 2 hour/s", "2 to 3 hours", "3 to 4 hours", "4 to 5 hours", "5 to 6 hours", "6 to 7 hours", "7 to 8 hours"}));
			tardCombo.setBounds(315, 476, 86, 22);
			frame.getContentPane().add(tardCombo);
			
			tardTF = new JTextField();
			tardTF.setColumns(10);
			tardTF.setBounds(158, 505, 86, 20);
			frame.getContentPane().add(tardTF);
			

			
			Object pass = null;
			
		

		    }
		

		public void setVisible(boolean b) {
			// TODO Auto-generated method stub


		}

		/**
		 * Parses a peso amount from a text field, tolerating a leading
		 * "₱" sign, commas and blank input (treated as 0). Avoids
		 * NumberFormatExceptions when a field already holds a formatted value.
		 */
		private static double money(String s) {
			if (s == null) return 0;
			s = s.replace("₱", "").replace(",", "").trim();
			if (s.isEmpty()) return 0;
			return Double.parseDouble(s);
		}
	}
