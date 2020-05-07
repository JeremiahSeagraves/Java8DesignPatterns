package com.jeremiahseagraves.designpatterns.structural.facade;

import java.util.List;

public class FacadeJdbcDemo {

	public static void main (String args []) {
		
		JdbcAddressFacade jdbcAddressFacade = new JdbcAddressFacade();
		
		jdbcAddressFacade.createTable();
		
		System.out.println("Table created.");
		
		jdbcAddressFacade.insertIntoTable();
		
		System.out.println("Record inserted.");
		
		List<Address> addresses = jdbcAddressFacade.getAddresses();
		
		for (Address address : addresses) {
			System.out.println(address.getId() + " " + address.getStreetName() + " " + address.getCity());
		}
	}
}

