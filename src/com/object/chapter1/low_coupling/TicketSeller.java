package com.object.chapter1.low_coupling;

public class TicketSeller {

    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        Long buy = audience.buy(this.ticketOffice.getTicket());
        this.ticketOffice.plusAmount(buy);
    }

}
