package com.object.chapter1.low_coupling;

public class Bag {

    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    public Bag(Long amount) {
        this(null, amount);
    }

    public Bag(Invitation invitation, Long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    public Long hold(Ticket ticket) {
        if(this.hasInvitation()) {
            this.setTicket(ticket);
            return 0L;
        }
        this.minusAmount(ticket.getFee());
        this.setTicket(ticket);
        return ticket.getFee();
    }

    private boolean hasInvitation() {
        return this.invitation != null;
    }

    private boolean hasTicket() {
        return this.ticket != null;
    }

    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private void minusAmount(Long amount) {
        this.amount -= amount;
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }

}
