package com.pluralsight.demo.abstractfactory;

import lombok.Builder.ObtainVia;

public class VisaValidator implements Validator {
    
    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
