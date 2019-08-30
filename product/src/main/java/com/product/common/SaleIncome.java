package com.product.common;

public class SaleIncome extends Income {


    public SaleIncome(double income) {
        super(income);
    }

    @Override
    public double getTex() {
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.1; //大于该值则使用换算方式不一样
    }

}
