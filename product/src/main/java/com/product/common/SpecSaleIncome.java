package com.product.common;

import lombok.Data;

@Data
public class SpecSaleIncome extends Income {
    public SpecSaleIncome(double income) {
        super(income);
    }

    @Override
    public double getTex() {
        return 0;
    }
}
