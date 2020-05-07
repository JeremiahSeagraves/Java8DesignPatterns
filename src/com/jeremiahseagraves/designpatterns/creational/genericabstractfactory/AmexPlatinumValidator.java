package com.jeremiahseagraves.designpatterns.creational.genericabstractfactory;

public class AmexPlatinumValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		
		return false;
	}

}
