package com.jeremiahseagraves.designpatterns.creational.abstractfactory;

/**
 * This is the abstract factory
 */
public abstract class AbstractCreditCardFactory {

    public static AbstractCreditCardFactory getCreditCardFactory(int creditScore) {

        if (creditScore > 650) {
            return new AmexFactory();
        } else {
            return new VisaFactory();
        }
    }

    public abstract CreditCard getCreditCard(CardType cardType);

    public abstract Validator getValidator(CardType cardType);
}
