package com.object.chapter1.low_coupling;

public class Audience {

    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticket) {
        if(this.bag.hasInvitation()) {
            this.bag.setTicket(ticket);
            return 0L;
        }
        this.bag.setTicket(ticket);
        this.bag.minusAmount(ticket.getFee());
        return ticket.getFee();
    }

}
