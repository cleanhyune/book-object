package com.object.chapter2.discount;

import com.object.chapter2.Screening;

public interface DiscountCondition {

    boolean isSatisfiedBy(Screening screening);

}
