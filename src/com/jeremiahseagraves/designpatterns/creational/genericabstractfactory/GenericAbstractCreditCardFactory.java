package com.jeremiahseagraves.designpatterns.creational.genericabstractfactory;

/**
 * This is the generic abstract factory
 */
public class GenericAbstractCreditCardFactory<H extends CreditCardFactory<F>, F extends CreditCard> {

    private final Class<H> creditCardFactoryClass;
    private final Class<F> creditCardClass;

    public GenericAbstractCreditCardFactory(final Class<H> creditCardFactoryClass, final Class<F> creditCardClass) {
        this.creditCardFactoryClass = creditCardFactoryClass;
        this.creditCardClass = creditCardClass;
    }

    public H createCreditCardFactory() throws InstantiationException, IllegalAccessException {
        H h = creditCardFactoryClass.newInstance();
        h.setCreditCard(creditCardClass.newInstance());
        return h;
    }


    public static <H extends CreditCardFactory<F>, F extends CreditCard> GenericAbstractCreditCardFactory<H, F> getCreditCardFactory(
            final Class<H> creditCardFactoryClass, final Class<F> creditCardClass) {
        return new GenericAbstractCreditCardFactory<>(creditCardFactoryClass, creditCardClass);
    }
}
