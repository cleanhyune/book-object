package com.object.chapter2.discount;

import com.object.chapter2.Money;
import com.object.chapter2.Screening;

import java.util.ArrayList;
import java.util.List;

public abstract class DefaultDiscountPolicy implements DiscountPolicy {

    private List<DiscountCondition> conditionList = new ArrayList<>();

    public DefaultDiscountPolicy(DiscountCondition ...discountConditions) {
        this.conditionList.addAll(List.of(discountConditions));
    }

    public Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition discountCondition : conditionList) {
            if(discountCondition.isSatisfiedBy(screening)) {
                return this.getDiscountAmount(screening);
            }
        }
        return Money.zero;
    }

    abstract protected Money getDiscountAmount(Screening screening);

}
