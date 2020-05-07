package com.jeremiahseagraves.designpatterns.creational.genericabstractfactory;

/**
 * @author jeremiah.seagraves
 * @created 5/5/2020
 */
public interface CreditCardFactory<T extends CreditCard> {
    T getCreditCard();
    void setCreditCard(T creditCard);
    Validator getValidator();
}
