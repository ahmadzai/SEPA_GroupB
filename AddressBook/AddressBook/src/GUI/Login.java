package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import javax.swing.ImageIcon;
import java.awt.Button;
import javax.swing.JToggleButton;
import java.awt.Color;

public class Login {

	private JFrame frame;
	private JTextField txtName;
	private JLabel lblPassword;
	private JPasswordField passwordField;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuItem mntmExit;
	private JMenu mnHelp;
	private JMenuItem mntmHowToUse;
	private JMenuItem mntmAbout;
	private JLabel lblLoginHere;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FormLayout(new ColumnSpec[] {
				ColumnSpec.decode("160px"),
				ColumnSpec.decode("170px"),},
			new RowSpec[] {
				RowSpec.decode("127px"),
				RowSpec.decode("17px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("24px"),
				FormFactory.UNRELATED_GAP_ROWSPEC,
				RowSpec.decode("17px"),
				FormFactory.UNRELATED_GAP_ROWSPEC,
				RowSpec.decode("24px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("24px"),}));
		
		lblLoginHere = new JLabel("Login to your account.");
		lblLoginHere.setFont(new Font("Dialog", Font.BOLD, 16));
		frame.getContentPane().add(lblLoginHere, "1, 1, 2, 1, center, center");
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("/home/tanin/Desktop/blog-site.jpg"));
		frame.getContentPane().add(lblNewLabel, "1, 2, 1, 9, center, default");
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Dialog", Font.BOLD, 14));
		frame.getContentPane().add(lblName, "2, 2, left, fill");
		
		txtName = new JTextField();
		txtName.setFont(new Font("Dialog", Font.PLAIN, 14));
		txtName.setToolTipText("");
		frame.getContentPane().add(txtName, "2, 4, fill, fill");
		txtName.setColumns(10);
		
		lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Dialong", Font.BOLD, 14));
		frame.getContentPane().add(lblPassword, "2, 6, left, top");
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		passwordField.setFont(new Font("Dialog", Font.PLAIN, 14));
		passwordField.setToolTipText("");
		frame.getContentPane().add(passwordField, "2, 8, fill, fill");
		
		JButton btnBtnlogin = new JButton("Login");
		btnBtnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBtnlogin.setFont(new Font("Dialog", Font.BOLD, 12));
		frame.getContentPane().add(btnBtnlogin, "2, 10, left, fill");
		
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		mntmHowToUse = new JMenuItem("How to use");
		mnHelp.add(mntmHowToUse);
		
		mntmAbout = new JMenuItem("About");
		mnHelp.add(mntmAbout);
	}

}
