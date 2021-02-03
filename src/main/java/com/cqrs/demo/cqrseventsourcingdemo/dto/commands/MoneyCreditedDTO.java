package com.cqrs.demo.cqrseventsourcingdemo.dto.commands;

public class MoneyCreditedDTO {

    private double creditAmount;

    private String currency;

    public double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
