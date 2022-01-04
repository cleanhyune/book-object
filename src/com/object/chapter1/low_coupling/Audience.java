package com.object.chapter1.low_coupling;

public class Audience {

    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticket) {
        return this.bag.hold(ticket);
    }

}
