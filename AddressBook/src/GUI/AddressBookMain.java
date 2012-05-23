package GUI;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ListSelectionModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;

import Helper.Menu;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class AddressBookMain extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form AddressBookMain
     */
    public AddressBookMain() {
    	setTitle("Address Book");
    	setResizable(false);
        initComponents();
    }
    public void fillTableContact(){
    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
    	
    	Menu menu=new Menu(this);
    	JMenuBar menuBar=menu.createAppMenu();
    	this.setJMenuBar(menuBar);
    	

        pnlSearch = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbSearch = new javax.swing.JComboBox();
        btnSearch = new javax.swing.JButton();
        btnSearch.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		int x=JOptionPane.showConfirmDialog(getParent(), "Search Button");
        		System.out.println(x);
        	}
        });
        pnlFunction = new javax.swing.JPanel();
        btnAddContact = new javax.swing.JButton();
        btnAddContact.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		AddEditContactForm.main(null);
        	
        	}
        });
        btnEdite = new javax.swing.JButton();
        btnEdite.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnDelete = new javax.swing.JButton();
        btnDelete.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        pnlTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblContacts = new javax.swing.JTable();
      
        tblContacts.addMouseListener(new MouseAdapter() {
        	@Override
        	
        	public void mouseClicked(MouseEvent e) {
        		if(e.getClickCount()==2)
        		System.out.println(tblContacts.getSelectedRow());
        		
        	}
        	
       
        	
        });
        tblContacts.setRowHeight(22);
        tblContacts.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tblContacts.setAutoCreateRowSorter(true);
        
        btnPrevious = new javax.swing.JButton();
        btnPrevious.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        javax.swing.JButton btnNext = new javax.swing.JButton();
        btnNext.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnPrint = new javax.swing.JButton();
        btnPrint.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
       // jMenuBar1 = new javax.swing.JMenuBar();
        //jMenu1 = new javax.swing.JMenu();
        //jMenu2 = new javax.swing.JMenu();
        //jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlSearch.setBorder(javax.swing.BorderFactory.createTitledBorder(" Search "));

       // txtSearch.setText("John");

        jLabel5.setText("Search By");

        cmbSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "First Name","Last Name","Mobile","Email" }));

        btnSearch.setText("Search");

        javax.swing.GroupLayout gl_pnlSearch = new javax.swing.GroupLayout(pnlSearch);
        pnlSearch.setLayout(gl_pnlSearch);
        gl_pnlSearch.setHorizontalGroup(
            gl_pnlSearch.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_pnlSearch.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        gl_pnlSearch.setVerticalGroup(
            gl_pnlSearch.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_pnlSearch.createSequentialGroup()
                .addGroup(gl_pnlSearch.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlFunction.setBorder(javax.swing.BorderFactory.createTitledBorder(" Main Functions "));

        btnAddContact.setText("Add Contact");

        btnEdite.setText("Edit");

        btnDelete.setText("Delete");

        javax.swing.GroupLayout gl_pnlFunction = new javax.swing.GroupLayout(pnlFunction);
        pnlFunction.setLayout(gl_pnlFunction);
        gl_pnlFunction.setHorizontalGroup(
            gl_pnlFunction.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_pnlFunction.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAddContact, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdite, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gl_pnlFunction.setVerticalGroup(
            gl_pnlFunction.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gl_pnlFunction.createSequentialGroup()
                .addGroup(gl_pnlFunction.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddContact, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdite, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTable.setBorder(javax.swing.BorderFactory.createTitledBorder(" Contact List "));

        tblContacts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Frist Name", "Last Name", "Fax","Mobile Nummber", "Email Address","Details"
            }
        ));
        jScrollPane1.setViewportView(tblContacts);

        javax.swing.GroupLayout gl_pnlTable = new javax.swing.GroupLayout(pnlTable);
        gl_pnlTable.setHorizontalGroup(
        	gl_pnlTable.createParallelGroup(Alignment.LEADING)
        		.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        gl_pnlTable.setVerticalGroup(
        	gl_pnlTable.createParallelGroup(Alignment.TRAILING)
        		.addGroup(gl_pnlTable.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 416, GroupLayout.PREFERRED_SIZE)
        			.addGap(19))
        );
        pnlTable.setLayout(gl_pnlTable);

        btnPrevious.setText("Previous");

        btnNext.setText("Next");

        btnPrint.setText("Print");

    //    jMenu1.setText("File");
      //  jMenuBar1.add(jMenu1);
        
       // menuItem = new JMenuItem("New menu item");
        //jMenuBar1.add(menuItem);

        //jMenu2.setText("Edit");
        //jMenuBar1.add(jMenu2);

        //jMenu3.setText("Help");
        //jMenuBar1.add(jMenu3);

        //setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(pnlTable, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(pnlSearch, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addPreferredGap(ComponentPlacement.UNRELATED)
        							.addComponent(pnlFunction, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        					.addGap(22))
        				.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        					.addComponent(btnPrevious, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
        					.addGap(201)
        					.addComponent(btnPrint, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
        					.addGap(46))))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addComponent(pnlSearch, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(pnlFunction, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addComponent(pnlTable, GroupLayout.PREFERRED_SIZE, 454, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnPrevious, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnPrint, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(33, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pnlFunction.getAccessibleContext().setAccessibleName("name");

        pack();
    }// </editor-fold>

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddressBookMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddressBookMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddressBookMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddressBookMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new AddressBookMain().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnEdite;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnAddContact;
    private javax.swing.JComboBox cmbSearch;
    private javax.swing.JLabel jLabel5;
   // private javax.swing.JMenu jMenu1;
    //private javax.swing.JMenu jMenu2;
    //private javax.swing.JMenu jMenu3;
    //private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel pnlSearch;
    private javax.swing.JPanel pnlTable;
    private javax.swing.JPanel pnlFunction;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblContacts;
    private javax.swing.JTextField txtSearch;
    private JMenuItem menuItem;
    // End of variables declaration
}