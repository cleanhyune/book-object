package com.object.chapter1.low_coupling;

public class Theater {

    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    /*
        Theater 은 더 이상  ticketOffice 에 접근하지 못한다.
        encapsulation (캡슐화)
     */
    public void enter(Audience audience) {
        // 아주 간단해졌다!
        ticketSeller.sellTo(audience);
    }
}
