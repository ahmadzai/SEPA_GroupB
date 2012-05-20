package GUI;

import java.awt.EventQueue;
import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;

import javax.swing.JFileChooser.*;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.JButton;
import javax.swing.JMenuBar;

import Helper.ContactImage;
import Helper.Menu;
import Helper.MyImageFilter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.ImageFilter;
import java.awt.Cursor;
import java.io.File;

public class AddEditContactForm {

	private JFrame frame;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JLabel lblDateOfBirth;
	private JTextField txtDateOfBirth;
	private JLabel lblMobileNr;
	private JLabel lblPhoneNr;
	private JLabel lblFax;
	private JTextField txtMobileNr;
	private JTextField txtPhoneNr;
	private JTextField txtFax;
	private JLabel lblEmail;
	private JTextField txtEmail;
	private JLabel lblCountry;
	private JTextField txtCountry;
	private JLabel lblCity;
	private JTextField txtCity;
	private JLabel lblAddress;
	private JLabel lblStreet;
	private JTextField txtStreet;
	private JLabel lblApnr;
	private JTextField txtApnr;
	private JLabel lblZipcode;
	private JTextField txtZipcode;
	private JLabel lblGroup;
	private JComboBox comboBox;
	private JLabel lblComents;
	private JTextArea txtrComents;
	private JLabel lblImage;
	private JButton btnSave;
	private JButton btnCancel;
	private JButton btnPrint;
	private JMenuBar menuBar;
	private Menu myMenu;
	private ContactImage image;
	private JFileChooser fileChooser;
	private File imgFile ;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddEditContactForm window = new AddEditContactForm();
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
	public AddEditContactForm() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Add Contact");
		frame.setBounds(100, 100, 550, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[118.00][188.00,grow][69.00,grow][152.00,center][]", "[][][][][][][][][9.00][][][][][][][][40.00]"));
		myMenu = new Menu(frame);
		JLabel lblFirstName = new JLabel("First Name:");
		frame.getContentPane().add(lblFirstName, "cell 0 1,alignx trailing");
		
		txtFirstName = new JTextField();
		txtFirstName.setText("");
		frame.getContentPane().add(txtFirstName, "cell 1 1,growx");
		txtFirstName.setColumns(6);
		
		
		lblImage = new JLabel("");
		lblImage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		// if there were no image we will change it later
		imgFile = new File("images/defaultUser.png");
		image = new ContactImage(imgFile);
		lblImage.setIcon(image.loadImage());
		lblImage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				fileChooser = new JFileChooser();
				FileFilter filter = new MyImageFilter("Images only png, jpg, gif, jpeg", new String[] {"png", "jpeg", "jpg", "gif"});
				fileChooser.setFileFilter(filter);
				fileChooser.setAcceptAllFileFilterUsed(false);
				int status = fileChooser.showDialog(frame, "Attach");
				if(status == JFileChooser.APPROVE_OPTION) {
					File selectedFile = fileChooser.getSelectedFile();
					//System.out.println(selectedFile.getParent());
					//System.out.println(selectedFile.getName());
					image = new ContactImage(selectedFile);
					lblImage.setIcon(image.loadImage());
					
				}
				
				if(status == JFileChooser.CANCEL_OPTION) {
					System.out.println("Cancel button pressed");
				}
				
				//System.out.print("Mouse Clicked");
			}
		});
		
		lblImage.setToolTipText("Click to load Contact Image");
		//java.net.URL url = AddEditContactForm.class.getResource("/Resources/defaultUser.png");
		
		
		frame.getContentPane().add(lblImage, "cell 3 1 1 6,growx,aligny center");
		
		JLabel lblLastName = new JLabel("Last Name:");
		frame.getContentPane().add(lblLastName, "cell 0 2,alignx trailing");
		
		txtLastName = new JTextField();
		txtLastName.setText("");
		frame.getContentPane().add(txtLastName, "cell 1 2,growx");
		txtLastName.setColumns(6);
		
		lblDateOfBirth = new JLabel("Date Of Birth:");
		frame.getContentPane().add(lblDateOfBirth, "cell 0 3");
		
		txtDateOfBirth = new JTextField();
		txtDateOfBirth.setText("");
		frame.getContentPane().add(txtDateOfBirth, "cell 1 3,growx");
		txtDateOfBirth.setColumns(10);
		
		lblMobileNr = new JLabel("Mobile Nr:");
		frame.getContentPane().add(lblMobileNr, "cell 0 4,alignx trailing");
		
		txtMobileNr = new JTextField();
		txtMobileNr.setText("");
		frame.getContentPane().add(txtMobileNr, "cell 1 4,growx,aligny top");
		txtMobileNr.setColumns(10);
		
		lblPhoneNr = new JLabel("Phone Nr:");
		frame.getContentPane().add(lblPhoneNr, "cell 0 5,alignx trailing");
		
		txtPhoneNr = new JTextField();
		txtPhoneNr.setText("");
		frame.getContentPane().add(txtPhoneNr, "cell 1 5,growx,aligny bottom");
		txtPhoneNr.setColumns(10);
		
		lblFax = new JLabel("Fax:");
		frame.getContentPane().add(lblFax, "cell 0 6,alignx trailing,aligny bottom");
		
		txtFax = new JTextField();
		txtFax.setText("");
		frame.getContentPane().add(txtFax, "cell 1 6,growx,aligny bottom");
		txtFax.setColumns(10);
		
		lblEmail = new JLabel("Email:");
		frame.getContentPane().add(lblEmail, "cell 0 7,alignx trailing,aligny bottom");
		
		txtEmail = new JTextField();
		txtEmail.setText("");
		frame.getContentPane().add(txtEmail, "cell 1 7 2 1,growx,aligny bottom");
		txtEmail.setColumns(10);
		
		lblCountry = new JLabel("Country:");
		frame.getContentPane().add(lblCountry, "cell 0 9,alignx trailing");
		
		txtCountry = new JTextField();
		txtCountry.setText("");
		frame.getContentPane().add(txtCountry, "cell 1 9,growx,aligny top");
		txtCountry.setColumns(10);
		
		lblCity = new JLabel("City:");
		frame.getContentPane().add(lblCity, "cell 0 10,alignx trailing,aligny top");
		
		txtCity = new JTextField();
		txtCity.setText("");
		frame.getContentPane().add(txtCity, "cell 1 10,growx,aligny top");
		txtCity.setColumns(10);
		
		lblStreet = new JLabel("Street");
		frame.getContentPane().add(lblStreet, "cell 1 11,aligny baseline");
		
		lblApnr = new JLabel("Ap.Nr");
		frame.getContentPane().add(lblApnr, "cell 2 11,aligny bottom");
		
		lblAddress = new JLabel("Address:");
		frame.getContentPane().add(lblAddress, "cell 0 12,alignx right");
		
		txtStreet = new JTextField();
		txtStreet.setText("");
		frame.getContentPane().add(txtStreet, "cell 1 12,growx,aligny top");
		txtStreet.setColumns(10);
		
		txtApnr = new JTextField();
		txtApnr.setText("");
		frame.getContentPane().add(txtApnr, "cell 2 12,growx,aligny top");
		txtApnr.setColumns(10);
		
		lblZipcode = new JLabel("ZipCode:");
		frame.getContentPane().add(lblZipcode, "cell 0 13,alignx right");
		
		txtZipcode = new JTextField();
		txtZipcode.setText("");
		frame.getContentPane().add(txtZipcode, "cell 1 13,growx");
		txtZipcode.setColumns(10);
		
		lblGroup = new JLabel("Group:");
		frame.getContentPane().add(lblGroup, "cell 0 14,alignx trailing");
		
		comboBox = new JComboBox();
		frame.getContentPane().add(comboBox, "cell 1 14,growx,aligny bottom");
		
		lblComents = new JLabel("Coments:");
		frame.getContentPane().add(lblComents, "cell 0 15,alignx right,aligny top");
		
		txtrComents = new JTextArea();
		txtrComents.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		txtrComents.setColumns(25);
		txtrComents.setWrapStyleWord(true);
		txtrComents.setRows(3);
		txtrComents.setText("");
		frame.getContentPane().add(txtrComents, "cell 1 15 2 1,growx,aligny bottom");
		
		btnSave = new JButton("Save");
		btnSave.setEnabled(false);
		frame.getContentPane().add(btnSave, "flowx,cell 1 16,growx");
		
		btnCancel = new JButton("Cancel");
		frame.getContentPane().add(btnCancel, "cell 1 16,alignx right");
		
		btnPrint = new JButton("Print");
		btnPrint.setEnabled(false);
		frame.getContentPane().add(btnPrint, "cell 2 16");
		
		menuBar = myMenu.createAppMenu();
		frame.setJMenuBar(menuBar);
		
		
		
		
		
	}
	
}
