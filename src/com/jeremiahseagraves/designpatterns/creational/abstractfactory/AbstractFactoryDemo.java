package com.jeremiahseagraves.designpatterns.creational.abstractfactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		
		AbstractCreditCardFactory abstractFactory = AbstractCreditCardFactory.getCreditCardFactory(775);
		
		CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);
		
		System.out.println(card.getClass());
		
		abstractFactory = AbstractCreditCardFactory.getCreditCardFactory(600);
		
		CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);
		
		System.out.println(card2.getClass());
	}

}
