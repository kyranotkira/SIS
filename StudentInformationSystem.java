package StudentInformationSystem;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class StudentInformationSystem {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private static Connection con = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 Class.forName("org.sqlite.JDBC");
					 con = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Von\\Desktop\\sql.db");
					StudentInformationSystem window = new StudentInformationSystem();
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
	public StudentInformationSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 204, 204));
		frame.getContentPane().setForeground(new Color(204, 153, 51));
		frame.setBounds(100, 100, 562, 389);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name : ");
		lblNewLabel.setBounds(20, 44, 70, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Middle Name :");
		lblNewLabel_1.setBounds(20, 69, 70, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name : ");
		lblNewLabel_2.setBounds(20, 90, 70, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Birthdate :");
		lblNewLabel_3.setBounds(20, 115, 59, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Age : ");
		lblNewLabel_4.setBounds(20, 140, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Gender :");
		lblNewLabel_5.setBounds(20, 163, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Mother's Name :");
		lblNewLabel_6.setBounds(20, 188, 86, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Father's Name :");
		lblNewLabel_7.setBounds(20, 213, 86, 14);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Cellphone Number : ");
		lblNewLabel_8.setBounds(20, 236, 103, 14);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Student ID :");
		lblNewLabel_9.setBounds(20, 25, 70, 14);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Address : ");
		lblNewLabel_10.setBounds(20, 261, 59, 14);
		frame.getContentPane().add(lblNewLabel_10);
		
		textField = new JTextField();
		textField.setBounds(83, 22, 180, 17);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(83, 44, 180, 17);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(93, 69, 170, 17);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(83, 90, 180, 17);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(73, 115, 190, 17);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(51, 137, 212, 17);
		frame.getContentPane().add(textField_5);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(100, 185, 163, 17);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(100, 210, 163, 17);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(120, 233, 143, 17);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(73, 258, 190, 17);
		frame.getContentPane().add(textField_10);
		
		table = new JTable();
		table.setBounds(367, 197, 26, -92);
		frame.getContentPane().add(table);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setBounds(304, 286, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("UPDATE");
		btnNewButton_1.setBounds(304, 320, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(421, 286, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DELETE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(421, 316, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Bading"}));
		comboBox.setBounds(76, 159, 187, 18);
		frame.getContentPane().add(comboBox);
		
		table_1 = new JTable();
		table_1.setBounds(483, 55, -154, 220);
		frame.getContentPane().add(table_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(485, 272, -167, -233);
		frame.getContentPane().add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(301, 25, 212, 250);
		frame.getContentPane().add(scrollPane_1);
		
		table_2 = new JTable();
		scrollPane_1.setViewportView(table_2);
	}
}
