package com.jeremiahseagraves.designpatterns.creational.genericabstractfactory;

public class AmexGoldValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		
		return false;
	}

}
