package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
//import java.awt.Component;
//import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
//import java.awt.LayoutManager;

//import javax.jws.WebParam.Mode;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
//import java.awt.GridBagConstraints;
import javax.swing.JComboBox;
//import java.awt.Insets; 

import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ListSelectionModel;

import net.miginfocom.swing.MigLayout;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;

import Controller.MainController;
import Helper.ContactDataModel;
import Helper.Menu;
import javax.swing.ScrollPaneConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {

	private JFrame frame;
	private JTextField txtSearchBy;
	private Menu myMenu;
	private MainController controller;
	private JTable table;
	private static JFrame instance = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		controller = new MainController();
		initialize();
	}

	public static JFrame getMainWindow() {
		return instance;
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame("Address Book");
		
		frame.setBounds(100, 100, 800, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		instance = frame;
		frame.getContentPane().setLayout(new MigLayout("", "[16.00,grow][75px][118px][130px][112.00px][120px][][][26.00]", "[24.00][25px][][grow][][25.00]"));
		
		JLabel lblSearchBy = new JLabel("Search By:");
		frame.getContentPane().add(lblSearchBy, "cell 1 1,alignx center,aligny center");
		
		String[] items = {"First Name", "Last Name", "Phone Nr", "Mobile Nr", "City", "Date of Birth"};
		JComboBox comboBox = new JComboBox(items);
		frame.getContentPane().add(comboBox, "cell 2 1,grow");
		
		txtSearchBy = new JTextField();
		txtSearchBy.setText("Search By");
		frame.getContentPane().add(txtSearchBy, "cell 3 1,grow");
		txtSearchBy.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		frame.getContentPane().add(btnSearch, "cell 4 1,alignx left,aligny top");
		
		JButton btnAddContact = new JButton("Add Contact");
		frame.getContentPane().add(btnAddContact, "cell 5 1,alignx left,aligny center");
		btnAddContact.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AddEditContactForm.main(null);
				
			}
		});
		
		JButton btnEdit = new JButton("Edit");
		frame.getContentPane().add(btnEdit, "cell 6 1");
		
		JButton btnDelete = new JButton("Delete");
		frame.getContentPane().add(btnDelete, "cell 7 1");
		
		JPanel panel = new JPanel( new BorderLayout());
		panel.setBorder(new TitledBorder(null, "Contacts", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frame.getContentPane().add(panel, "cell 1 3 7 1,grow");
		
		ContactDataModel model = controller.getTableModel();
		table = new JTable(model);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setAutoCreateColumnsFromModel(true);
		table.getColumnModel().getColumn(0).setPreferredWidth(70);
		table.getColumnModel().getColumn(1).setPreferredWidth(165);
		table.getColumnModel().getColumn(2).setPreferredWidth(160);
		table.getColumnModel().getColumn(3).setPreferredWidth(250);
		table.getColumnModel().getColumn(4).setMinWidth(70);
		
		table.setRowSelectionAllowed(true);
		table.setShowGrid(true);
		table.setShowHorizontalLines(true);
		table.setShowVerticalLines(true);
		table.setSelectionBackground(Color.blue);
		table.setAutoCreateRowSorter(true);
		table.setRowHeight(22);
		table.getTableHeader().setPreferredSize(new Dimension(table.getTableHeader().getWidth(), 20));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		
		//TableColumnModel tc = table.getColumnModel();
		//TableColumn col = tc.getColumn(model.getColumnCount()-1);
		table.setShowGrid(true);
		
		JScrollPane scrollPane = new JScrollPane(table);
		//scrollPane.setLayout(new GridBagLayout());
		
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(scrollPane);
		
		
		JButton btnPrevious = new JButton("Previous");
		frame.getContentPane().add(btnPrevious, "cell 3 4,alignx right");
		
		JButton btnNext = new JButton("Next");
		frame.getContentPane().add(btnNext, "cell 4 4");
		
		JButton btnPrint = new JButton("Print");
		frame.getContentPane().add(btnPrint, "cell 7 4,alignx right");
		
		myMenu = new Menu(frame);
		frame.setJMenuBar(myMenu.createAppMenu());
	}


}
