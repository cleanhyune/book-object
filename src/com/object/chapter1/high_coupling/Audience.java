package com.object.chapter1.high_coupling;

public class Audience {

    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return this.bag;
    }

}
