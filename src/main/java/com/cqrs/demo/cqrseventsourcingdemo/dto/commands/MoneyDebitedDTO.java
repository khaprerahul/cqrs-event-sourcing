package com.cqrs.demo.cqrseventsourcingdemo.dto.commands;

public class MoneyDebitedDTO {

    private double debitAmount;

    private String currency;

    public double getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(double debitAmount) {
        this.debitAmount = debitAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
