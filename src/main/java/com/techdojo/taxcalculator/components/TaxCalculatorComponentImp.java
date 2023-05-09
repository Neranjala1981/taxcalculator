package com.techdojo.taxcalculator.components;

import org.springframework.stereotype.Component;

@Component
public class TaxCalculatorComponentImp implements TaxcalculatorComponent {
    @Override
    public double calculateTax(double income) {
        if (income > 0 && income <= 14000) {
            return income * (10.5 / 100);

        }

       else if  (income > 14000 && income <= 48000) {
            return income * (17.5 / 100);
        }

        else if (income > 48000 && income <= 70000) {
            return income * (30.0 / 100);
        }

        else if (income > 70000 && income <= 180000) {
            return income * (33.0/ 100);
        }
        else {
            return income*(39.0/100);
        }
    }
}




