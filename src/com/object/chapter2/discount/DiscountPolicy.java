package com.object.chapter2.discount;

import com.object.chapter2.Money;
import com.object.chapter2.Screening;

public interface DiscountPolicy {

    public Money calculateDiscountAmount(Screening screening);

}
