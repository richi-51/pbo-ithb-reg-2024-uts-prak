import model.*;
import model.Enum.ClassType;
import model.Enum.TicketStatus;
import model.Enum.TrainType;

import java.util.Date;

import Controller.keretaController;
import View.MainMenu;

public class Main {
    public static Date date1 = new Date();
    public static Date date2 = new Date();
    public static void main(String[] args) {
        Train trains[] = new Train[2];
        Passenger passengers[] = new Passenger[2]; 
        Ticket tickets[] = new Ticket[2];
        Reservation reservations[] = new Reservation [2];

        createDummy(trains, passengers, tickets, reservations);
        keretaController ctrl = new keretaController(tickets);
        MainMenu showMenu = new MainMenu(ctrl);

        // untuk set harga tiket
        ctrl.makePayment(tickets[1], "Xendit");

        showMenu.show(tickets[0], "PayPal", date1);
    }


    public static void createDummy(Train trains[], Passenger passengers[], Ticket tickets[], Reservation reservation[]){
        trains[0] = new Train(1, "Train-1", TrainType.STANDARD);
        trains[1] = new Train(2, "Train-2", TrainType.FASTTRAIN);

        passengers[0] = new Passenger("A01", "Adrian", 0, 19);
        passengers[1] = new Passenger("A02", "Aloy", 0, 20);

        reservation[0] = new Reservation("R01", date1);
        reservation[1] = new Reservation("R02", date2);


        tickets[0] = new Ticket("T01", ClassType.ECONOMY_CLASS, TicketStatus.PAID, trains[0], passengers[0], reservation[0]);


        String seatNo = tickets[0].getReservation().reserveSeat(tickets[0].getTrain());
        tickets[0].setSeatNumber(seatNo);
        
        tickets[1] = new Ticket("T02", ClassType.FIRST_CLASS, TicketStatus.CANCELED, trains[1], passengers[1], reservation[1]);
        seatNo = tickets[1].getReservation().reserveSeat(tickets[1].getTrain());
        tickets[1].setSeatNumber(seatNo);

    }
}
