import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignUpPage extends JFrame {

	private JPanel contentPane;
	private JTextField textName;
	private JTextField textSurname;
	private JTextField textId;
	private JTextField textPassword;

	/**
	 * Launch the application.
	 */
	public static void NewWindow() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpPage frame = new SignUpPage();
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
	public SignUpPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 559, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Name");
		
		JLabel lblName = new JLabel("Surname");
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		
		JLabel lblNewLabel_3 = new JLabel("Password");
		
		JLabel lblNewLabel_4 = new JLabel("Job");
		
		textName = new JTextField();
		textName.setColumns(10);
		
		textSurname = new JTextField();
		textSurname.setColumns(10);
		
		textId = new JTextField();
		textId.setColumns(10);
		
		textPassword = new JTextField();
		textPassword.setColumns(10);
		
		JButton btnNewButton = new JButton("Sign up");
		
		
		JComboBox comboBoxJob = new JComboBox();
		comboBoxJob.setModel(new DefaultComboBoxModel(new String[] {"Soldier", "Police", "Prosecutor"}));
		
		JLabel lblNewLabel_5 = new JLabel("Account");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(50)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel)
								.addComponent(lblName)
								.addComponent(lblNewLabel_2)
								.addComponent(lblNewLabel_3)
								.addComponent(lblNewLabel_4))
							.addGap(63)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textPassword, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
								.addComponent(textId, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
								.addComponent(textSurname, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
								.addComponent(textName, GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
								.addComponent(comboBoxJob, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(243)
							.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(209)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(236, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(17)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(textSurname, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(textId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(textPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(comboBoxJob, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
					.addGap(51))
		);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textId.getText().equals("") && textPassword.getText().equals("") && textName.getText().equals("") && textSurname.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null, "ID,name,surname and Password are Null...");	
				}
				else if(textId.getText().equals("") && textPassword.getText().equals("") ) {
					
					JOptionPane.showMessageDialog(null, "ID and password are Null...");	
				}
				else if(textId.getText().equals("")  ) {
					
					JOptionPane.showMessageDialog(null, "ID is Null...");	
				}
				
				else if(textPassword.getText().equals("")) {
					
					JOptionPane.showMessageDialog(null, "Password is Null...");	
				}
				else {
					PersonalInformation personalInformation = new PersonalInformation();
					personalInformation.setUsername(textId.getText());
					personalInformation.setPassword(textPassword.getText());
					personalInformation.setName(textName.getText());
					personalInformation.setSurname(textSurname.getText());
					personalInformation.setjob((String) comboBoxJob.getSelectedItem());
					TableManagerFactory dataBaseManager = new TableManagerFactory();
					dataBaseManager.singUp(personalInformation);
				}
			}
		});
		contentPane.setLayout(gl_contentPane);
	}
}
