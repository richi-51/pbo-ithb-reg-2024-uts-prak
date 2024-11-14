package View;

import Controller.keretaController;
import model.Ticket;
import java.util.Date;

public class MainMenu {
    private keretaController ctrl;

    public MainMenu(keretaController ctrl) {
        this.ctrl = ctrl;
    }

    public void show(Ticket ticket, String gateway, Date lookDate){
        System.out.println(ticket.getPassenger().getPassengerInfo());
        printStatusMakePayment(ticket, gateway);
        printTotalRevenue(lookDate);
    }

    public void printStatusMakePayment(Ticket ticket, String gateway){
        System.out.println(ctrl.makePayment(ticket, gateway));
    }

    public void printTotalRevenue(Date lookDate){
        System.out.println("Total Revenue: " + ctrl.calculateTotalRevenue(lookDate));
    }


}
