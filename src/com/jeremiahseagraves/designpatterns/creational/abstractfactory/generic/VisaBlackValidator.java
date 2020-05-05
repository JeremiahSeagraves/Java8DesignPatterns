package com.jeremiahseagraves.designpatterns.creational.abstractfactory.generic;

/**
 * @author jeremiah.seagraves
 * @created 5/5/2020
 */
public class VisaBlackValidator implements Validator {
    @Override
    public boolean isValid(CreditCard creditCard) {

        return false;
    }
}
