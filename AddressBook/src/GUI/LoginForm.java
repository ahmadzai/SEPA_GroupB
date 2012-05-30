package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

import Controller.LoginController;
import Helper.ContactImage;
import Helper.Menu;

import java.awt.Dimension;
import java.awt.Color;
import java.io.File;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class LoginForm {

	private JFrame frame;
	private JTextField txtUserName;
	private JPasswordField pwdPassword;
	private JButton btnLogin;
	private JLabel lblErrorMessage;
	private JLabel lblIcon;
	private ContactImage icon;
	private JLabel lblForgetPassword;
	//private JMenuBar menuBar;
	//private Menu menu;
	private File imgFile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm window = new LoginForm();
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
	public LoginForm() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame("Login");
		frame.setResizable(false);
		frame.setBounds(150, 100, 450, 380);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[][40.00][][202.00][grow]", "[][][26.00][26.00][26.00][][][][]"));
		
		imgFile = new File("images/login.png");
		icon = new ContactImage();
		lblIcon = new JLabel("");
		lblIcon.setIcon(icon.convertToIcon(imgFile));
		frame.getContentPane().add(lblIcon, "cell 3 1,aligny bottom");
		
		JLabel lblUserName = new JLabel("User Name:");
		frame.getContentPane().add(lblUserName, "cell 2 2,alignx trailing,growy");
		
		txtUserName = new JTextField();
		txtUserName.setPreferredSize(new Dimension(4, 20));
		txtUserName.setMinimumSize(new Dimension(4, 20));
	//	txtUserName.setText("User Name");
		frame.getContentPane().add(txtUserName, "cell 3 2,grow");
		txtUserName.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		frame.getContentPane().add(lblPassword, "cell 2 3,alignx trailing,growy");
		
		pwdPassword = new JPasswordField();
		pwdPassword.setMinimumSize(new Dimension(4, 20));
		pwdPassword.setPreferredSize(new Dimension(4, 20));
		//pwdPassword.setText("Password");
		frame.getContentPane().add(pwdPassword, "cell 3 3,grow");
		
		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LoginController lgCtr=new LoginController();
				if(lgCtr.validatLogin(txtUserName.getText(), pwdPassword.getText())==true){
					AddressBookMain adrMain=new AddressBookMain();
					adrMain.setVisible(true);
					frame.dispose();
					
				}
			}
		});
		frame.getContentPane().add(btnLogin, "flowx,cell 3 4,alignx left,growy");
		
		lblErrorMessage = new JLabel("Error Message");
		lblErrorMessage.setVisible(false);
		frame.getContentPane().add(lblErrorMessage, "flowx,cell 3 5,aligny bottom");
		
		lblForgetPassword = new JLabel("Forget Password");
		lblForgetPassword.setVisible(false);
		lblForgetPassword.setForeground(Color.BLUE);
		frame.getContentPane().add(lblForgetPassword, "cell 3 4,alignx right,aligny bottom");
		
		//-------------------- just adding the menu bar
	//	menu = new Menu(frame);
		//menuBar = menu.createAppMenu();
		//frame.setJMenuBar(menuBar);
	}
}
