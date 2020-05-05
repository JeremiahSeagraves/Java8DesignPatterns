package com.jeremiahseagraves.designpatterns.creational.abstractfactory.generic;

public class VisaFactory implements CreditCardFactory {

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
        if (this.creditCard instanceof VisaGoldCreditCard)
            return new VisaGoldValidator();
        else if (this.creditCard instanceof VisaBlackCreditCard)
            return new VisaBlackValidator();
        else
            return null;
    }

}
