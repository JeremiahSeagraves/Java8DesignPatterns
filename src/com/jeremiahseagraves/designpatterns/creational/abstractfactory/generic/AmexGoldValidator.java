package com.jeremiahseagraves.designpatterns.creational.abstractfactory.generic;

public class AmexGoldValidator implements Validator {

	@Override
	public boolean isValid(CreditCard creditCard) {
		
		return false;
	}

}
