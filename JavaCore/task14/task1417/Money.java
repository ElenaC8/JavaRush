package com.javarush.task.task14.task1417;

public abstract class Money {

    public Money(double amount) {
        this.amount = amount;
    }

    //public abstract double getAmount();

    public abstract String getCurrencyName();

    private double amount;

    public double getAmount() {
        return amount;
    }


}

