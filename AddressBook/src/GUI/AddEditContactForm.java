package GUI;

import java.awt.Dialog;
import java.awt.EventQueue;
import Controller.*;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.JButton;
import javax.swing.JMenuBar;

import Controller.MainController;
import Helper.ContactImage;
import Helper.Menu;
import Helper.MyImageFilter;
import Helper.Validation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.ImageFilter;
import java.awt.Cursor;
import java.io.File;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Color;

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
	private String btnSaveText = "Save";
	private Boolean btnSaveFlag = false;
	
	private JButton btnCancel;
	
	private JButton btnPrint;
	private Boolean btnPrintFlag = false;
	
	private JMenuBar menuBar;
	private Menu myMenu;
	private ContactImage image;
	private JFileChooser fileChooser;
	private File imgFile ;
	private String imgPath = null;
	private JLabel lblFirstNameError;
	private JLabel lblLastNameError;
	private JLabel lblDateError;
	private JLabel lblMobileError;
	private JLabel lblPhoneError;
	private JLabel lblFaxError;
	private JLabel lblEmailError;
	private JLabel lblCityError;
	private JLabel lblCountryError;
	private JLabel lblStreetError;
	private JLabel lblApNrError;
	private JLabel lblZipError;
	
	
	
	
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
		image = new ContactImage();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Add Contact");
		frame.getContentPane().setVisible(true);
		frame.setBounds(100, 100, 550, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[118.00][179.00,grow][69.00,grow][152.00,center][18.00]", "[][][][][][][][][9.00][][][][][][][][40.00]"));
		
		// helper classes
		myMenu = new Menu(frame);
		image = new ContactImage();
		
		JLabel lblFirstName = new JLabel("First Name:");
		frame.getContentPane().add(lblFirstName, "cell 0 1,alignx trailing");
		
		lblFirstNameError = new JLabel("");
		lblFirstNameError.setForeground(Color.RED);
		frame.getContentPane().add(lblFirstNameError, "cell 2 1,alignx left");
		
		txtFirstName = new JTextField();
		frame.getContentPane().add(txtFirstName, "cell 1 1,growx");
		txtFirstName.setColumns(6);
		txtFirstName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(Validation.checkName(txtFirstName.getText())) {
					btnSaveFlag = true;
					btnSave.setEnabled(btnSaveFlag);
				}
				
			}
		});
		
		
		
		lblImage = new JLabel("");
		lblImage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblImage.setBorder(new EtchedBorder());
		lblImage.setToolTipText("Click to load Contact Image");
		frame.getContentPane().add(lblImage, "cell 3 1 1 6,growx,aligny center");
		/*
		 * Here i want to check the frame title if it was "Add Contact" 
		 * then it will load with defaultUser image, otherwise it will take 
		 * the path of image from Person class getImage() method and if it was
		 * null than again it will show the defaultUser image
		 */
		if(frame.getTitle().equals("Add Contact") && imgPath == null) {
			
			imgFile = new File("images/defaultUser.png");
			lblImage.setIcon(image.convertToIcon(imgFile));
			
		}
		else if(frame.getTitle().equals("Edit Contact") && imgPath != null) {
			
			btnPrintFlag = true; // when frame called with Edit button
			
		}
		else if(frame.getTitle().equals("Print Contact") && imgPath != null) {
			
			btnSaveText = "Edit";
			btnSaveFlag = true;
			
		}
		
		lblImage.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(txtFirstName.getText().isEmpty() && txtLastName.getText().isEmpty()) {
					JOptionPane.showMessageDialog(null, "Please enter your first name, and last name\nthan choose a picture", "Error", JOptionPane.ERROR_MESSAGE);
				}
				else {
					fileChooser = new JFileChooser();
					FileFilter filter = new MyImageFilter("Images only png, jpg, gif, jpeg", new String[] {"png", "jpeg", "jpg", "gif"});
					fileChooser.setFileFilter(filter);
					fileChooser.setAcceptAllFileFilterUsed(false);
					int status = fileChooser.showDialog(frame, "Attach");
					if(status == JFileChooser.APPROVE_OPTION) {
						File selectedFile = fileChooser.getSelectedFile();
						//System.out.println(selectedFile.getParent());
						//System.out.println(selectedFile.getName());
						
						if(image.loadImageFile(selectedFile))
							lblImage.setIcon(image.convertToIcon());
						
					}
					
					if(status == JFileChooser.CANCEL_OPTION) {
						System.out.println("Cancel button pressed");
					}
				}
				
				//System.out.print("Mouse Clicked");
			}
		});
		
		
		JLabel lblLastName = new JLabel("Last Name:");
		frame.getContentPane().add(lblLastName, "cell 0 2,alignx trailing");
		
		lblLastNameError = new JLabel("");
		lblLastNameError.setForeground(Color.RED);
		frame.getContentPane().add(lblLastNameError, "cell 2 2");
		
		txtLastName = new JTextField();
		frame.getContentPane().add(txtLastName, "cell 1 2,growx");
		txtLastName.setColumns(6);
		txtLastName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(Validation.checkName(txtLastName.getText())) {
					btnSaveFlag = true;
				}
			}
		});
		
		
		lblDateOfBirth = new JLabel("Date Of Birth:");
		frame.getContentPane().add(lblDateOfBirth, "cell 0 3");
		
		lblDateError = new JLabel("");
		lblDateError.setForeground(Color.RED);
		frame.getContentPane().add(lblDateError, "cell 2 3");
		
		txtDateOfBirth = new JTextField();
		txtDateOfBirth.setText("");
		frame.getContentPane().add(txtDateOfBirth, "cell 1 3,growx");
		txtDateOfBirth.setColumns(10);
		/*
		txtDateOfBirth.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!Validation.checkDate(txtDateOfBirth.getText())) {
					txtDateOfBirth.setText("e.g. DD/MM/YYYY");
					txtDateOfBirth.selectAll();
					txtDateOfBirth.requestFocusInWindow();
					lblDateError.setText("*");
				}
				else
					lblDateError.setText("");
			}
		});
		*/
		
		lblMobileNr = new JLabel("Mobile Nr:");
		frame.getContentPane().add(lblMobileNr, "cell 0 4,alignx trailing");
		
		lblMobileError = new JLabel("");
		lblMobileError.setForeground(Color.RED);
		frame.getContentPane().add(lblMobileError, "cell 2 4");
		
		txtMobileNr = new JTextField();
		frame.getContentPane().add(txtMobileNr, "cell 1 4,growx,aligny top");
		txtMobileNr.setColumns(10);
		
		/*
		txtMobileNr.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!txtMobileNr.getText().isEmpty()) {
					if(!Validation.checkMobileNr(txtMobileNr.getText())) {
						txtMobileNr.selectAll();
						txtMobileNr.requestFocusInWindow();
						lblMobileError.setText("*");
						
					}
					else {
						lblMobileError.setText("");
						lblPhoneError.setText("");
					}
					
				}
				
			}
		});
		*/
	
		
		lblPhoneNr = new JLabel("Phone Nr:");
		frame.getContentPane().add(lblPhoneNr, "cell 0 5,alignx trailing");
		
		lblPhoneError = new JLabel("");
		lblPhoneError.setForeground(Color.RED);
		frame.getContentPane().add(lblPhoneError, "cell 2 5");
		
		txtPhoneNr = new JTextField();
		frame.getContentPane().add(txtPhoneNr, "cell 1 5,growx,aligny bottom");
		txtPhoneNr.setColumns(10);
		/*
		txtPhoneNr.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(txtMobileNr.getText().isEmpty() && txtPhoneNr.getText().isEmpty()) {
					txtMobileNr.setText("required phone or mob #");
					txtMobileNr.selectAll();
					lblMobileError.setText("*");
					lblPhoneError.setText("*");
					txtMobileNr.requestFocusInWindow();
				}
				else if(!txtPhoneNr.getText().isEmpty()){
					if(!Validation.checkPhoneNr(txtPhoneNr.getText())) {
						txtPhoneNr.selectAll();
						lblPhoneError.setText("*");
						txtPhoneNr.requestFocusInWindow();
					}
					else {
						lblPhoneError.setText("");
						lblMobileError.setText("");
					}
				}
				
			}
		});
		*/
		
		lblFax = new JLabel("Fax:");
		frame.getContentPane().add(lblFax, "cell 0 6,alignx trailing,aligny bottom");
		
		txtFax = new JTextField();
		txtFax.setText("");
		frame.getContentPane().add(txtFax, "cell 1 6,growx,aligny bottom");
		txtFax.setColumns(10);
		
		lblFaxError = new JLabel("");
		lblFaxError.setForeground(Color.RED);
		frame.getContentPane().add(lblFaxError, "cell 2 6");
		
		lblEmailError = new JLabel("");
		lblEmailError.setForeground(Color.RED);
		frame.getContentPane().add(lblEmailError, "cell 3 7,alignx left");
		
		lblEmail = new JLabel("Email:");
		frame.getContentPane().add(lblEmail, "cell 0 7,alignx trailing,aligny bottom");
		
		txtEmail = new JTextField();
		txtEmail.setText("");
		frame.getContentPane().add(txtEmail, "cell 1 7 2 1,growx,aligny bottom");
		txtEmail.setColumns(10);
		/*
		txtEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!Validation.checkEmail(txtEmail.getText())) {
					txtEmail.setText("e.g. example@example.com");
					txtEmail.selectAll();
					txtEmail.requestFocusInWindow();
					lblEmailError.setText("*");
				}
				else
					lblEmailError.setText("");
			}
		});
		*/
		
		
		lblCountry = new JLabel("Country:");
		frame.getContentPane().add(lblCountry, "cell 0 9,alignx trailing");
		
		txtCountry = new JTextField();
		txtCountry.setText("");
		frame.getContentPane().add(txtCountry, "cell 1 9,growx,aligny top");
		txtCountry.setColumns(10);
		
		lblCountryError = new JLabel("");
		lblCountryError.setForeground(Color.RED);
		frame.getContentPane().add(lblCountryError, "cell 2 9");
		
		lblCity = new JLabel("City:");
		frame.getContentPane().add(lblCity, "cell 0 10,alignx trailing,aligny top");
		
		txtCity = new JTextField();
		txtCity.setText("");
		frame.getContentPane().add(txtCity, "cell 1 10,growx,aligny top");
		txtCity.setColumns(10);
		
		lblCityError = new JLabel("");
		lblCityError.setForeground(Color.RED);
		frame.getContentPane().add(lblCityError, "cell 2 10");
		
		lblStreet = new JLabel("Street");
		frame.getContentPane().add(lblStreet, "flowx,cell 1 11,aligny baseline");
		
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
		
		lblApNrError = new JLabel("");
		lblApNrError.setForeground(Color.RED);
		frame.getContentPane().add(lblApNrError, "cell 3 12,alignx left");
		
		lblZipcode = new JLabel("ZipCode:");
		frame.getContentPane().add(lblZipcode, "cell 0 13,alignx right");
		
		txtZipcode = new JTextField();
		txtZipcode.setText("");
		frame.getContentPane().add(txtZipcode, "cell 1 13,growx");
		txtZipcode.setColumns(10);
		
		lblZipError = new JLabel("");
		lblZipError.setForeground(Color.RED);
		frame.getContentPane().add(lblZipError, "cell 2 13");
		
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
		
		btnSave = new JButton(btnSaveText);
		btnSave.setEnabled(btnSaveFlag);
		frame.getContentPane().add(btnSave, "flowx,cell 1 16,growx");
		// Event handler of Save button
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(btnSave.getText().equals("Save")) {
					MainController mn=new MainController();
					mn.save();
					clearErrorMessages(); // just to clear the error messages
					
					// here we will validate the whole data
					String message ="<html> The following enteries are not correct: <br>";
					if(!Validation.checkName(txtFirstName.getText())) {
						
						
						message +="<font color=\"red\">*</font> First Name: required (Alphabets)</<br>";
						lblFirstNameError.setText("*");
						
					}
					if(!Validation.checkName(txtLastName.getText())) {
						message +="<font color=\"red\">*</font> Last Name: required (Alphabets)<br>";
						lblLastNameError.setText("*");
					}
					if(!Validation.checkDate(txtDateOfBirth.getText())) {
						message +="<font color=\"red\">*</font> Date of birth required (dd/mm/yyyy) <br>";
						lblDateError.setText("*");
					}
					if(txtMobileNr.getText().isEmpty() && txtPhoneNr.getText().isEmpty()) {
						message +="<font color=\"red\">*</font> Mobile # or phone # requiered <br>";
						lblMobileError.setText("*");
						lblPhoneError.setText("*");
					}
					if(!Validation.checkMobileNr(txtMobileNr.getText()) && !txtMobileNr.getText().isEmpty()){
						
						message +="<font color=\"red\">*</font> Mobile # is wrong (12 or 15 digit) <br>";
						lblMobileError.setText("*");
					}
					if(!Validation.checkPhoneNr(txtPhoneNr.getText()) && !txtPhoneNr.getText().isEmpty()) {
						message +="<font color=\"red\">*</font> Phone # is not correct (8 or 12 digit) <br>";
						lblPhoneError.setText("*");
					}
					if(!Validation.checkFax(txtFax.getText()) && !txtFax.getText().isEmpty()) {
						message +="<font color=\"red\">*</font> Fax number is incorrect (12 digit) <br>";
						lblFaxError.setText("*");
						
					}
					if(!Validation.checkEmail(txtEmail.getText())) {
						message +="<font color=\"red\">*</font> Invalid Email address <br>";
						lblEmailError.setText("*");
					}
					if(!Validation.checkCountryCity(txtCountry.getText())) {
						message +="<font color=\"red\">*</font> Country field required <br>";
						lblCountryError.setText("*");
					}
					if(!Validation.checkCountryCity(txtCity.getText())) {
						message +="<font color=\"red\">*</font> City name required <br>";
						lblCityError.setText("*");
					}
					if(!Validation.checkStreet(txtStreet.getText())) {
						message +="<font color=\"red\">*</font> Street name should be string <br>";
						lblStreetError.setText("*");
					}
					if(!Validation.checkApNr(txtApnr.getText()) && !txtApnr.getText().isEmpty()) {
						message +="<font color=\"red\">*</font> Apartement number (3 digit) <br>";
						lblApNrError.setText("*");
					}
					if(!Validation.checkZipCode(txtZipcode.getText())) {
						message +="<font color=\"red\">*</font> Zip code is rquired (number) <br>";
						lblZipError.setText("*");
					}
					message +="</html>";
					if(message != null)
					JOptionPane.showMessageDialog(null, message, "Entry Error", JOptionPane.ERROR_MESSAGE);
					
					
				}
				else if(btnSave.getText().equals("Edit")) {
					System.out.print("Edit button Clicked");
				}
			}
			
		});
		
		btnCancel = new JButton("Cancel");
		frame.getContentPane().add(btnCancel, "cell 1 16,alignx right");
		
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// here we close this form and will setFocus of the main form
				
			}
		});
		
		btnPrint = new JButton("Print");
		btnPrint.setEnabled(btnPrintFlag);
		
		btnPrint.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Printing class will initialize here
				
			}
		});
		
		frame.getContentPane().add(btnPrint, "cell 2 16");
		
		lblStreetError = new JLabel("");
		lblStreetError.setForeground(Color.RED);
		frame.getContentPane().add(lblStreetError, "cell 1 11");
		
		menuBar = myMenu.createAppMenu();
		frame.setJMenuBar(menuBar);
		
		
		
		
		
	}
	
	public void clearErrorMessages() {
		
		lblFirstNameError.setText("");
		lblLastNameError.setText("");
		lblDateError.setText("");
		lblMobileError.setText("");
		lblPhoneError.setText("");
		lblFaxError.setText("");
		lblEmailError.setText("");
		lblCountryError.setText("");
		lblCityError.setText("");
		lblStreetError.setText("");
		lblApNrError.setText("");
		lblZipError.setText("");
	}
	
}
