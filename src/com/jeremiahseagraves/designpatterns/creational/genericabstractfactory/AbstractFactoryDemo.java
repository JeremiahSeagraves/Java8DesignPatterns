package com.jeremiahseagraves.designpatterns.creational.genericabstractfactory;

public class AbstractFactoryDemo {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        AbstractCreditCardFactory abstractFactory = AbstractCreditCardFactory.getCreditCardFactory(AmexFactory.class, AmexGoldCreditCard.class);
        CreditCardFactory creditCardFactory = abstractFactory.createCreditCardFactory();

        CreditCard card = creditCardFactory.getCreditCard();

        System.out.println(card.getClass());

        abstractFactory = AbstractCreditCardFactory.getCreditCardFactory(VisaFactory.class, VisaBlackCreditCard.class);
        creditCardFactory = abstractFactory.createCreditCardFactory();

        CreditCard card2 = creditCardFactory.getCreditCard();

        System.out.println(card2.getClass());
    }

}
