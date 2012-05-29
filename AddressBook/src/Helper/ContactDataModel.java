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
	
	public ContactDataModel(EList<Person> persons) {
		this.persons = persons;
	}
	
	public void setPersons(EList<Person> eList) {
		persons = eList;
		fireTableStructureChanged();
	}
	
	public void setPerson(Person eList) {
		int index = persons.size();
		persons.add(index, eList);
		fireTableStructureChanged();
	}
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columns.length;
	}

	public String getColumnName(int col) {
		
		return columns[col];
	}
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		//System.out.println("ROWS: " + persons.size());
		return persons.size();
	}
	
	public void personAdded(int index) {
		//System.out.println("ADDED AT: " + index + " of " + persons.size());
		fireTableRowsInserted(index, index);
		fireTableDataChanged();
	}

	public void personDeleted(int index) {
		fireTableRowsDeleted(index, index);
	}

	public void personChanged(int index) {
		fireTableRowsUpdated(index, index);
	}
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
			value = "Details";
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
	 * 
	 * @param index
	 * @return Person
	 */
	public Person getPersonAt(int index) {
		return persons.get(index);
	}


}