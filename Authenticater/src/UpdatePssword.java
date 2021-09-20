import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class UpdatePssword extends JFrame {

	private JPanel contentPane;
	private JTextField textUsername;
	private JTextField textPassword;
	private JTextField textNewPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdatePssword frame = new UpdatePssword();
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
	public UpdatePssword() {
		setTitle("Password Uptade");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 345);
		contentPane = new JPanel();
		setContentPane(contentPane);
		
		JLabel lbUsername = new JLabel("Username");
		
		textUsername = new JTextField();
		textUsername.setColumns(10);
		
		JLabel lbPassword = new JLabel("Password");
		
		textPassword = new JTextField();
		textPassword.setColumns(10);
		
		JLabel lblNewPassword = new JLabel("New Password");
		
		textNewPassword = new JTextField();
		textNewPassword.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		
		JLabel lblJob = new JLabel("Job");
		
		JComboBox comboBoxJob = new JComboBox();
		comboBoxJob.setModel(new DefaultComboBoxModel(new String[] {"Soldier", "Police", "Prosecutor"}));
		
		JButton btnNewButton = new JButton("Password Change");
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(lblNewLabel)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(71)
					.addComponent(lbUsername)
					.addGap(46)
					.addComponent(textUsername, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(72)
					.addComponent(lbPassword)
					.addGap(47)
					.addComponent(textPassword, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(60)
					.addComponent(lblNewPassword)
					.addGap(35)
					.addComponent(textNewPassword, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(86)
					.addComponent(lblJob)
					.addGap(62)
					.addComponent(comboBoxJob, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(162)
					.addComponent(btnNewButton))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lbUsername))
						.addComponent(textUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lbPassword))
						.addComponent(textPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addComponent(lblNewPassword))
						.addComponent(textNewPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(4)
							.addComponent(lblJob))
						.addComponent(comboBoxJob, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addComponent(btnNewButton))
		);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(textUsername.getText().equals("") && textPassword.getText().equals("") && textNewPassword.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Username,New password and Password are Null...");	
				}
				else if(textUsername.getText().equals("") && textPassword.getText().equals("") ) {
					
					JOptionPane.showMessageDialog(null, "Username and password are Null...");	
				}
				else if(textUsername.getText().equals("")  ) {
					
					JOptionPane.showMessageDialog(null, "Username is Null...");	
				}
				
				else if(textPassword.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Password is Null...");	
				}
				else {
					PersonalInformation personalInformation = new PersonalInformation();
					personalInformation.setUsername(textUsername.getText());
					personalInformation.setPassword(textPassword.getText());
					personalInformation.setName(null);
					personalInformation.setSurname(null);
					personalInformation.setNewPassword(textNewPassword.getText());
					personalInformation.setjob((String) comboBoxJob.getSelectedItem());
					TableManagerFactory dataBaseManager = new TableManagerFactory();
					dataBaseManager.changePassword(personalInformation);
				}
			
			}
		});
		contentPane.setLayout(gl_contentPane);
	}

}
