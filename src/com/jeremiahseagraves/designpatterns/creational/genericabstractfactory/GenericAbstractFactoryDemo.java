package com.jeremiahseagraves.designpatterns.creational.genericabstractfactory;

public class GenericAbstractFactoryDemo {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        CreditCardFactory creditCardFactory = GenericAbstractCreditCardFactory.getCreditCardFactory(AmexFactory.class, AmexGoldCreditCard.class).createCreditCardFactory();
        CreditCard card = creditCardFactory.getCreditCard();

        System.out.println(card.getClass());

        creditCardFactory = GenericAbstractCreditCardFactory.getCreditCardFactory(VisaFactory.class, VisaBlackCreditCard.class).createCreditCardFactory();

        CreditCard card2 = creditCardFactory.getCreditCard();

        System.out.println(card2.getClass());
    }

}
