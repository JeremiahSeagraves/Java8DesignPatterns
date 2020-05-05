package com.jeremiahseagraves.designpatterns.creational.abstractfactory.generic;

public class VisaGoldValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {

		return false;
	}

}
