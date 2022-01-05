package com.object.chapter2.discount;

import com.object.chapter2.Money;
import com.object.chapter2.Screening;

public class NoneDiscountPolicy implements DiscountPolicy {

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.zero;
    }
}
