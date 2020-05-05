package com.jeremiahseagraves.designpatterns.creational.genericabstractfactory;

public class AmexFactory implements CreditCardFactory {

    private CreditCard creditCard;

    @Override
    public CreditCard getCreditCard() {
        return this.creditCard;
    }

    @Override
    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public Validator getValidator() {
        if (this.creditCard instanceof AmexGoldCreditCard)
            return new AmexGoldValidator();
        else if (this.creditCard instanceof AmexPlatinumCreditCard)
            return new AmexPlatinumValidator();
        else
            return null;
    }
}
