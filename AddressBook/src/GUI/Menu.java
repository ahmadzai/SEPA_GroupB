package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Menu {
	
	private JMenuBar menuBar;
	private JMenu mnFile, mnEdit, mnView, mnHelp;
	private JMenuItem mntmSave, mntmPrint, mntmExit;
	private JMenuItem mntmCopy, mntmCut, mntmPaste, mntmSearch;
	private JMenuItem mntmComView, mntmClassicView, mntmFont;
	private JMenuItem mntmHowTo, mntmAbout;
	private JFrame form;
	
	/***
	 * @author wazir
	 * @param JFrame:form
	 * Pass frame object in constructor to set menuitem accourding to your form
	 */
	public Menu(JFrame form)
	{
		menuBar = new JMenuBar();
		this.form = form;
		
	}
	/**
	 * @author wazir
	 * @return JMenuBar
	 */
	public JMenuBar createAppMenu() {
		
		mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mntmSave = new JMenuItem("Save");
		mnFile.add(mntmSave);
		/**
		 * the code for save menuItem will added here
		 * but we will check that which form is this
		 */
		mntmSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//System.out.print("Acction taken");
				
			}
		});
		
		mntmPrint = new JMenuItem("Print");
		mnFile.add(mntmPrint);
		
		/**
		 * this event is for printing code will added latter
		 */
		mntmPrint.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		/**
		 * This event listener is for exit that code is already implemented
		 */
		mntmExit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				form.dispose();
				
				
			}
		});
		//---------------------------------
		
		mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		mntmCopy = new JMenuItem("Copy");
		
		/***
		 * this Event is for copy we will implement latter
		 */
		mntmCopy.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		mntmCut = new JMenuItem("Cut");
		
		/***
		 * this event for Cut write code here
		 */
		mntmCut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		mntmPaste = new JMenuItem("Paste");
		/**
		 * Event for paste 
		 */
		mntmPaste.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		mntmSearch = new JMenuItem("Search");
		
		/***
		 * Event listener for Searching contact
		 */
		mntmSearch.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		mnEdit.add(mntmCopy);
		mnEdit.add(mntmCut);
		mnEdit.add(mntmPaste);
		mnEdit.add(mntmSearch);
		//----------------------------------
		
		mnView = new JMenu("View");
		menuBar.add(mnView);
		
		mntmComView = new JMenuItem("Compact View");
		
		/**
		 * Event for changing print view
		 */
		mntmComView.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		mntmClassicView = new JMenuItem("Classic View");
		
		/***
		 * Event for changing view
		 */
		mntmClassicView.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		mntmFont = new JMenuItem("Change Font");
		
		/***
		 * event listener for changing font of the form
		 */
		mntmFont.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		mnView.add(mntmComView);
		mnView.add(mntmClassicView);
		mnView.add(mntmFont);
		//----------------------------------
		
		mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		mntmHowTo = new JMenuItem("How to use?");
		
		/***
		 * Event for Help, help text should write in a text file and load from it
		 */
		mntmHowTo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		mntmAbout = new JMenuItem("About");
		
		/***
		 * Event for about 
		 */
		mntmAbout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		mnHelp.add(mntmHowTo);
		mnHelp.add(mntmAbout);
		
		
		/***
		 * This section where we check that from which form the Menu called
		 * the we can decide that which menu item should be disable and which should be enable
		 */
		if(this.form.getTitle().equals("Login")) {
			mntmSave.setEnabled(false);
			mntmPrint.setEnabled(false);
			
			mntmCopy.setEnabled(false);
			mntmCut.setEnabled(false);
			mntmPaste.setEnabled(false);
			mntmSearch.setEnabled(false);
			
			mntmComView.setEnabled(false);
			mntmClassicView.setEnabled(false);
			mntmFont.setEnabled(false);
			
		}
		
		if(this.form.getTitle().equals("Add Contact")) {
			mntmPrint.setEnabled(false);
			mntmComView.setEnabled(false);
			mntmClassicView.setEnabled(false);
		}
		
		
		
		/***
		 * The whole menubar will return here 
		 */
		return menuBar;
		
	}

}
