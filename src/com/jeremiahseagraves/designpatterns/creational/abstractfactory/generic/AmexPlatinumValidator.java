package com.jeremiahseagraves.designpatterns.creational.abstractfactory.generic;

public class AmexPlatinumValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		
		return false;
	}

}
