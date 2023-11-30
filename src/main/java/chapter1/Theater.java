package chapter1;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        if (audience.getBag().hasInvitation()) {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().setTicket(ticket);
        } else {
            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            audience.getBag().setTicket(ticket);
        }

        /*
            소극장은 관람객의 가방을 열어 그 안에 초대장이 들어 있는지 살펴본다.
            가방 안에 초대장이 들어 있으면 판매원은 매표소에 보관돼 있는 티켓을 관람객의 가방안으로 옮긴다.
            가방 안에 초대장이 들어 있지 않다면 관람객의 가방에서 티켓 금액만큼의 현금을 꺼내 매표소에 적립한 후에
            매표소에 보관돼 있는 티켓을 관람객의 가방 안으로 옮긴다.

            문제점 : 관람객과 판매원이 소극장의 통제를 받는 수동적인 존재.

            coupling이 높다.
         */
    }
}
