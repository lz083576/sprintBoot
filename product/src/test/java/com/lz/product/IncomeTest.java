package com.lz.product;

import com.product.common.Income;
import com.product.common.SaleIncome;
import com.product.common.SpecSaleIncome;
import org.junit.Test;

public class IncomeTest {

    @Test
    public void test() {
        Income[] incomes = new Income[]{
                new Income(5000),
                new SaleIncome(7500),
                new SpecSaleIncome(15000)
        };
        double v = totalTax(incomes);
    }

    public static double totalTax(Income... incomes) {
        double total = 0;
        for (Income income : incomes) {
            System.out.println(income.getTex());
            total = total + income.getTex();
        }
        return total;
    }

}
