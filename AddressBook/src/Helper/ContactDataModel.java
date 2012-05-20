package Helper;

import java.util.List;

import javax.swing.JLabel;
import javax.swing.table.AbstractTableModel;

import AddressBook.Person;

public class ContactDataModel extends AbstractTableModel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 368397545396223515L;
	private String[] columnName = {"No",
								   "Name",
								   "Mobile Number",
								   "Email Address",
								   "Details"};
	private List<Person> persons;
	
	private Object[][] data;
	public ContactDataModel(List<Person> persons) {
		this.persons = persons;
	}
	
	public void setData(List<Person> persons) {
		int row = 0;
		int no = 0;
		for(Person person : persons) {
			data[row][0] = ++no;											// Seting Number
			data[row][1] = person.getFirstName()+" "+person.getLastName();  // seting name
			data[row][2] = person.getMobileNr();
			data[row][3] = person.getEmail();
			data[row][5] = new JLabel("Details");
			row++;
			fireTableDataChanged();
			
		}
	}
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return columnName.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return data.length;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return data[arg0][arg1];
	}

}
