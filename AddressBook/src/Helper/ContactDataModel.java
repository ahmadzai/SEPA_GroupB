package Helper;


import javax.swing.table.AbstractTableModel;

import org.eclipse.emf.common.util.EList;

import AddressBook.Person;

public class ContactDataModel extends AbstractTableModel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 368397545396223515L;
	private String[] columns = {"No",
								   "First Name",
								   "Last Name",
								   "Mobile Number",
								   "Email Address",
								   "Details"};
	private EList<Person> persons;
	
	/**
	 * constructor Inistialize person
	 * @param persons
	 */
	
	public ContactDataModel(EList<Person> persons) {
		this.persons = persons;
	}
	
	/**
	 * Method will set List of person 
	 * @param eList
	 */
	public void setPersons(EList<Person> eList) {
		persons = eList;
		fireTableStructureChanged();
	}
	
	/**
	 * Method set person to end of Elist
	 * @param eList
	 */
	public void setPerson(Person eList) {
		int index = persons.size();
		persons.add(index, eList);
		fireTableStructureChanged();
	}
	/**
	 * Return number of columns
	 */
	@Override
	
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columns.length;
	}

	/**
	 * Returns columns Name at Index
	 */
	public String getColumnName(int col) {
		
		return columns[col];
	}
	
	/**
	 * Return number of contacts or Row in Table
	 */
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		//System.out.println("ROWS: " + persons.size());
		return persons.size();
	}
	
	/**
	 * Add Person to specified Index
	 * @param index
	 */
	public void personAdded(int index) {
		//System.out.println("ADDED AT: " + index + " of " + persons.size());
		fireTableRowsInserted(index, index);
		fireTableDataChanged();
	}
	
	/**
	 * Delete Person at specified Index
	 * @param index
	 */
	public void personDeleted(int index) {
		fireTableRowsDeleted(index, index);
	}
	
	/**
	 * Update Person at specified Index
	 * @param index
	 */
	public void personChanged(int index) {
		fireTableRowsUpdated(index, index);
	}
	
	/**
	 * get Value at specified Row Index and Column Index
	 */
	@Override
	
	public Object getValueAt(int rowIndex, int colIndex) {
		// TODO Auto-generated method stub
		Person per = persons.get(rowIndex);
		String value = "";
		switch(colIndex) {
		case 0:
			value = Integer.toString(rowIndex+1);
			break;
		case 1:
			value = per.getFirstName();
			break;
		case 2:
			value = per.getLastName();
			break;
		case 3:
			value = per.getMobileNr();
			break;
		case 4:
			value = per.getEmail();
			break;
		case 5:
			value = "<html><font color='blue'><u>Details</u></font></html>";
			default:
				break;
			
		}
		return value;
		
	}
	@Override
	public Class<?> getColumnClass(int c) {
		// all column types is string so this is enough
		return persons.get(0).getFirstName().getClass();
		
	}
	
	/**
	 * get person at specified Index
	 * @param index
	 * @return Person
	 */
	public Person getPersonAt(int index) {
		return persons.get(index);
	}


}