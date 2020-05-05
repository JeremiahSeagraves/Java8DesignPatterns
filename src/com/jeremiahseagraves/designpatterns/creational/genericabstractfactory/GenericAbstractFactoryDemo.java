package com.jeremiahseagraves.designpatterns.creational.genericabstractfactory;

public class GenericAbstractFactoryDemo {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        GenericAbstractCreditCardFactory abstractFactory = GenericAbstractCreditCardFactory.getCreditCardFactory(AmexFactory.class, AmexGoldCreditCard.class);
        CreditCardFactory creditCardFactory = abstractFactory.createCreditCardFactory();

        CreditCard card = creditCardFactory.getCreditCard();

        System.out.println(card.getClass());

        GenericAbstractCreditCardFactory abstractFactory2 = GenericAbstractCreditCardFactory.getCreditCardFactory(VisaFactory.class, VisaBlackCreditCard.class);
        creditCardFactory = abstractFactory.createCreditCardFactory();

        CreditCard card2 = creditCardFactory.getCreditCard();

        System.out.println(card2.getClass());
    }

}
