package com.jeremiahseagraves.designpatterns.structural.adapter;

/**
 * This is a specific adapter for instances of EmployeeLdap so they can be adapted to Employee legacy interface
 */
public class EmployeeAdapterLdap implements Employee {

	private EmployeeLdap instance;
	
	public EmployeeAdapterLdap(EmployeeLdap instance) {
		this.instance = instance;
	}
	
	@Override
	public String getId() {
		return instance.getCn();
	}

	@Override
	public String getFirstName() {
		return instance.getGivenName();
	}

	@Override
	public String getLastName() {
		return instance.getSurname();
	}

	@Override
	public String getEmail() {
		return instance.getMail();
	}

	/**
	 * Adding this method can be argued to be implementing a decorator pattern, nevertheless, this is a matter of perspective
	 * Being purists, we mustn't add any new method saying it's an adapter, but since its only a toString method we can also argue
	 * that this don't modify "any" legacy logic
	 * @return the string representation of the class
	 */
	public String toString() {
		return "ID: " + this.getId();
	}
	
}
