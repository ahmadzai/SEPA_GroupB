package GUI;



import java.util.List;

import javax.swing.AbstractListModel;

import AddressBook.Person;


public class PersonListModel extends AbstractListModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2247374062666417439L;
	private List<Person> persons;

	public PersonListModel(List<Person> persons) {
		this.persons = persons;
	}
	
	public void setPersons(List<Person> persons) {
		this.persons = persons;
		fireContentsChanged(this, 0, persons.size());
	}
	
	@Override
	public int getSize() {
		return persons.size();
	}

	@Override
	public Person getElementAt(int index) {
		return persons.get(index);
	}

	public void PersonAdded(int index) {
		fireIntervalAdded(this, index, index);
	}

	public void PersonDeleted(int index) {
		fireIntervalRemoved(this, index, index);
	}

	public void PersonChanged(int index) {
		fireContentsChanged(this, index, index);
	}

}
