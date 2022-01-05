package com.object.chapter2;

import com.object.chapter2.discount.DefaultDiscountPolicy;
import com.object.chapter2.discount.DiscountPolicy;

import java.time.Duration;

public class Movie {

    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money calculateMovieFee(Screening screening) {
        Money discountAmount = this.discountPolicy.calculateDiscountAmount(screening);
        if(discountAmount.isGreaterThanOrEqual(Money.zero)) {
            return this.fee.minus(discountAmount);
        }
        return this.fee;
    }

    public void changeDiscountPolicy(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return this.fee;
    }

}
