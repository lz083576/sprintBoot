package com.product.common;


/**
 * 关于多态练习
 */
public class Income {

    protected double income;


    public double getTex() {
        return income * 0.1;
    }

    public Income(double income) {
        this.income = income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
}
