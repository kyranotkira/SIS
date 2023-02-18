package StudentInformationSystem;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

public class StudentInformationSystem {

	private JFrame frame;
	private JTextField sID;
	private JTextField fName;
	private JTextField mName;
	private JTextField lName;
	private JTextField Bdate;
	private JTextField Age;
	private JTextField mother;
	private JTextField father;
	private JTextField cp;
	private JTextField address;
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
					 con.setAutoCommit(false);
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
		JComboBox bading = new JComboBox();
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 204, 204));
		frame.getContentPane().setForeground(new Color(204, 153, 51));
		frame.setBounds(100, 100, 746, 474);
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
		
		sID = new JTextField();
		sID.setBounds(83, 22, 180, 17);
		frame.getContentPane().add(sID);
		sID.setColumns(10);
		
		fName = new JTextField();
		fName.setBounds(83, 44, 180, 17);
		frame.getContentPane().add(fName);
		fName.setColumns(10);
		
		mName = new JTextField();
		mName.setBounds(93, 69, 170, 17);
		frame.getContentPane().add(mName);
		mName.setColumns(10);
		
		lName = new JTextField();
		lName.setBounds(83, 90, 180, 17);
		frame.getContentPane().add(lName);
		lName.setColumns(10);
		
		Bdate = new JTextField();
		Bdate.setBounds(73, 115, 190, 17);
		frame.getContentPane().add(Bdate);
		Bdate.setColumns(10);
		
		Age = new JTextField();
		Age.setColumns(10);
		Age.setBounds(51, 137, 212, 17);
		frame.getContentPane().add(Age);
		
		mother = new JTextField();
		mother.setColumns(10);
		mother.setBounds(100, 185, 163, 17);
		frame.getContentPane().add(mother);
		
		father = new JTextField();
		father.setColumns(10);
		father.setBounds(100, 210, 163, 17);
		frame.getContentPane().add(father);
		
		cp = new JTextField();
		cp.setColumns(10);
		cp.setBounds(120, 233, 143, 17);
		frame.getContentPane().add(cp);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(73, 258, 190, 17);
		frame.getContentPane().add(address);
		
		table = new JTable();
		table.setBounds(367, 197, 26, -92);
		frame.getContentPane().add(table);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			
			
			public void mouseClicked(MouseEvent e) {
				
				String sid=sID.getText();
				String fname=fName.getText();
				String mname=mName.getText();
				String lname=lName.getText();
				String bday=Bdate.getText();
				String age=Age.getText();
				String gender = bading.getSelectedItem().toString();	
				String mtname=mother.getText(); 
				String ftname=father.getText(); 
				String cnum=cp.getText();
				String addr=address.getText();
				
				try {
					PreparedStatement stmt= con.prepareStatement( "INSERT INTO Students (StudentID, FirstName, MiddleName, LastName, Birthdate, Age, Gender, MothersnName, FathersName, CellphoneNumber, Address) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
					stmt.setString(1, sid);
					stmt.setString(2, fname);
					stmt.setString(3, mname);
					stmt.setString(4, lname);
					stmt.setString(5, bday); 
					stmt.setString(6, age);
					stmt.setString(7, gender);
					stmt.setString(8, mtname);
					stmt.setString(9, ftname);
					stmt.setString(10, cnum);
					stmt.setString(11, addr);
					
					stmt.executeUpdate();
					con.commit();
					
					stmt.close();
					String query = "Select * from Students";
	                PreparedStatement pst = con.prepareStatement(query);
	                ResultSet resultset = pst.executeQuery();
	                table_2.setModel (DbUtils.resultSetToTableModel(resultset));
					
			 }catch (Exception j) {
		            
		            j.printStackTrace();
		        }
			}
		});
		btnNewButton.setBounds(304, 317, 180, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("DELETE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(540, 317, 180, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		
		bading.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female", "Bading"}));
		bading.setBounds(76, 159, 187, 18);
		frame.getContentPane().add(bading);
		
		
		DefaultTableModel model = new DefaultTableModel();
	    model.addColumn("Name");
	    model.addColumn("Age");
	    model.addColumn("Gender");
	    
		table_1 = new JTable(model);
		table_1.setBounds(483, 55, -154, 220);
		frame.getContentPane().add(table_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(485, 272, -167, -233);
		frame.getContentPane().add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(304, 24, 416, 282);
		frame.getContentPane().add(scrollPane_1);
		
		table_2 = new JTable(model);
		scrollPane_1.setViewportView(table_2);
	}
}
