package Helper;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import AddressBook.Person;

public class ContactDataModel extends AbstractTableModel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 368397545396223515L;
	private String[] columns = {"No",
								   "Full Name",
								   "Mobile Number",
								   "Email Address",
								   "Details"};
	private List<Person> persons;
	
	private ArrayList<ArrayList<String>> dataRow;
	private ArrayList<String> dataCol;
	public ContactDataModel(List<Person> persons) {
		this.persons = persons;
		dataRow = new ArrayList<ArrayList<String>>();
		setData();
	}
	
	private void setData() {
		
		int row = 0;
		//int no = 0;
		for(Person person : this.persons) {
			dataCol = new ArrayList<String>();
			//data[row][0] = ++no;											// Seting Number
			//dataRow.add(row, dataCol.add(""+no));
			dataCol.add(0, ""+(((int)this.persons.indexOf(person))+1));
			//data[row][1] = person.getFirstName()+" "+person.getLastName();  // seting name
			dataCol.add(1, person.getFirstName()+" "+person.getLastName());
			//data[row][2] = person.getMobileNr();
			dataCol.add(2, person.getMobileNr());
			//data[row][3] = person.getEmail();
			dataCol.add(3, person.getEmail());
			//data[row][5] = new JLabel("Details");
			dataCol.add(4, "Detail");
			
			dataRow.add(row, dataCol);
			
		row++;	
			
		}
		
	}
	
	public void setData(List<Person> persons) {
		int row = 0;
		int no = 0;
		for(Person person : this.persons) {
			dataCol = new ArrayList<String>();
			//data[row][0] = ++no;											// Seting Number
			//dataRow.add(row, dataCol.add(""+no));
			dataCol.add(0, ""+no);
			//data[row][1] = person.getFirstName()+" "+person.getLastName();  // seting name
			dataCol.add(1, person.getFirstName()+" "+person.getLastName());
			//data[row][2] = person.getMobileNr();
			dataCol.add(2, person.getMobileNr());
			//data[row][3] = person.getEmail();
			dataCol.add(3, person.getEmail());
			//data[row][5] = new JLabel("Details");
			dataCol.add(4, "Detail");
			
			dataRow.add(row, dataCol);
			
			row++;
			
		}
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
		return dataRow.size();
	}

	@Override
	public String getValueAt(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return dataRow.get(arg0).get(arg1);
	}
	@Override
	public Class<?> getColumnClass(int c) {
		
		return dataRow.get(0).get(c).getClass();
		
	}

	public void personAdded(int index) {
		this.fireTableRowsInserted(index,index);
		
	}
	
	public void DeletePerson(int index){
		
		this.fireTableRowsDeleted(index, index);
		this.fireTableDataChanged();
		
	}
	
	public void personChanged(int index){
		this.fireTableRowsUpdated(index, index);
		this.fireTableDataChanged();
	}
	
	
	
	
	


}
