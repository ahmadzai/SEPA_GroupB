package GUI;

import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import Controller.MainController;
import Helper.Menu;
import Helper.Printing;

import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
    	controller = new MainController();
    	setTitle("Address Book");
    	setResizable(false);
        initComponents();
       
       
    }
    /**
     * Get Selected Index of of JComboBox
     * @return Int
     */
    public int getIndex(){
    	
		return cmbSearch.getSelectedIndex()+1;
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
    	menu.getSave().setEnabled(false);
    	menu.getPrintItem().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tblContacts.getSelectedRow() != -1) {
        			
	        		Object objIndex=tblContacts.getModel().getValueAt(tblContacts.getSelectedRow(), 0);
	        		int index=Integer.parseInt(objIndex.toString())-1;
 
        			controller.printPerson(controller.getPerson(index));
        			
        		}
        		else{
        			JOptionPane.showMessageDialog(getParent(), "Please select a record then press print button!");
        		}
				
			}
		});
    	
    	
    	this.setJMenuBar(menuBar);
    	

        pnlSearch = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        
        jLabel5 = new javax.swing.JLabel();
        cmbSearch = new javax.swing.JComboBox();
        btnSearch = new javax.swing.JButton();
       
        pnlFunction = new javax.swing.JPanel();
        btnAddContact = new javax.swing.JButton();
        btnAddContact.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		controller.AddContact();
        	
        	}
        });
        btnEdite = new javax.swing.JButton();
        btnEdite.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(tblContacts.getSelectedRow()>-1){
        		Object objIndex=tblContacts.getModel().getValueAt(tblContacts.getSelectedRow(), 0);
        		int index=Integer.parseInt(objIndex.toString())-1;
        		
        		controller.editContact(index);
        		}
        		else{
        			JOptionPane.showMessageDialog(getParent(), "Please Select a record then press Edit!");
        		}
        	}
        });
        btnDelete = new javax.swing.JButton();
        btnDelete.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		
				 if(tblContacts.getSelectedRow()>-1){
					 Object objIndex= tblContacts.getModel().getValueAt(tblContacts.getSelectedRow(), 0);
						
					 int index=Integer.parseInt(objIndex.toString())-1;
					 int choice=JOptionPane.showConfirmDialog(getParent(), "Are you sure you want to delete this record?", "Delete", JOptionPane.YES_NO_OPTION);
					 if(JOptionPane.YES_OPTION==choice){
        				
          				controller.deletePerson(index);
        				
        				
        				
        			}
				 }
				 else{
					 JOptionPane.showMessageDialog(getParent(), "Pleae select a record then press Delete!");
				 }
        			
        			
        	}
        });
        
        pnlTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableModel model = controller.getTableModel();  
       
       
        final TableRowSorter<TableModel> sorter =
                new TableRowSorter<TableModel>(model);
       
        tblContacts = new javax.swing.JTable(model);
        tblContacts.revalidate();
        tblContacts.setRowSorter(sorter);
        tblContacts.setRowMargin(6);
        tblContacts.setFont(new Font("vardana", 0, 13));
        
        tblContacts.addMouseMotionListener(new MouseMotionListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
	        		if(tblContacts.columnAtPoint(e.getPoint())==5){
	        			tblContacts.setCursor(Cursor.getPredefinedCursor(HAND_CURSOR));
	        		}
	        		else
	        			tblContacts.setCursor(Cursor.getDefaultCursor());
	        		
	        	
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
        
      
        tblContacts.addMouseListener(new MouseAdapter() {
        	public void mouseClicked(MouseEvent e){
        		int colIndex=tblContacts.columnAtPoint(e.getPoint());
        		if(colIndex==5){
        			
        			Object objIndex=tblContacts.getModel().getValueAt(tblContacts.getSelectedRow(), 0);
        			int index=Integer.parseInt(objIndex.toString())-1;
        			controller.showDetails(index);
        			
        		}
        		
        		
        	}
        	
		});
        
        
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
        		
        		if(tblContacts.getSelectedRow()>-1){
        			Object objIndex=tblContacts.getModel().getValueAt(tblContacts.getSelectedRow(), 0);
            		int index=Integer.parseInt(objIndex.toString())-1;
        			controller.printPerson(controller.getPerson(index));
        			
        		}
        		else{
        			JOptionPane.showMessageDialog(getParent(), "Pleae select a record then press print!");
        		}
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
        pnlTable.setBorder(javax.swing.BorderFactory.createTitledBorder("Contacts List"));
        
       
     
       
      //  tblContacts.setAutoCreateColumnsFromModel(true);
        tblContacts.getColumnModel().getColumn(0).setPreferredWidth(10);
        tblContacts.getColumnModel().getColumn(1).setPreferredWidth(120);
        tblContacts.getColumnModel().getColumn(2).setPreferredWidth(120);
        tblContacts.getColumnModel().getColumn(3).setPreferredWidth(140);
        tblContacts.getColumnModel().getColumn(4).setPreferredWidth(200);
        tblContacts.getColumnModel().getColumn(5).setMinWidth(50);
		
        tblContacts.setRowSelectionAllowed(true);
        tblContacts.setShowGrid(true);
       
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
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 405, GroupLayout.PREFERRED_SIZE)
        			.addGap(19))
        );
        pnlTable.setLayout(gl_pnlTable);
   	 	tblContacts.setRowHeight(22);
        tblContacts.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
       // tblContacts.setAutoCreateRowSorter(true);
        //tblContacts.setRowMargin(5);

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

      
        btnSearch.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		//int x=JOptionPane.showConfirmDialog(getParent(), "Search Button");
        		if(!txtSearch.getText().isEmpty()) {
        				sorter.setRowFilter(
                        RowFilter.regexFilter(txtSearch.getText()));
        		
        		}
        		else 
        			JOptionPane.showMessageDialog(null, "Type in search box then click Search button");
        	}
        });
        
        menu.getSearchItem().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if(!txtSearch.getText().isEmpty()) {
    				sorter.setRowFilter(
                    RowFilter.regexFilter(txtSearch.getText()));
    		
	    		}
	    		else 
	    			JOptionPane.showMessageDialog(null, "Type in search box then click Search button");
					
			}
		});
        
        
        
     //   { "First Name","Last Name","Mobile","Email" }
        txtSearch.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyTyped(KeyEvent e) {
        		
        		sorter.setRowFilter(RowFilter.regexFilter(txtSearch.getText(),getIndex()));
        		
        	}
        });

        btnPrevious.setText("Previous");

        btnNext.setText("Next");

        btnPrint.setText("Print");
        
        btnPrintAll = new JButton();
        /**
         * Button print all
         */
        btnPrintAll.addActionListener(new Printing(tblContacts) {
        	
        });
        /**
         * Menu Print All 
         */
        menu.getPrintAll().addActionListener(new Printing(tblContacts) {
        	
        });
        btnPrintAll.setText("Print All");


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(btnPrevious, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnNext, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
        					.addGap(187)
        					.addComponent(btnPrint, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnPrintAll, GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
        				.addComponent(pnlTable, GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(pnlSearch, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(pnlFunction, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
        			.addGap(22))
        );
        tblContacts.getTableHeader().setPreferredSize(new Dimension(tblContacts.getTableHeader().getWidth(), 20));
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
        				.addComponent(btnPrint, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnPrintAll, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
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
    private MainController controller;
    private JButton btnPrintAll;
}