package com.jeremiahseagraves.designpatterns.creational.genericabstractfactory;

public class VisaGoldValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {

		return false;
	}

}
