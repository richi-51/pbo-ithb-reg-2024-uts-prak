package Controller;

import model.*;
import model.Enum.ClassType;
import model.Enum.TicketStatus;
import model.Enum.TrainType;
import java.util.Date;

public class keretaController {
    private static int idTrans = 1;
    private Ticket tickets[];

    public keretaController(Ticket[] tickets) {
        this.tickets = tickets;
    }



    public String makePayment(Ticket ticket, String gateway){
        if (ticket.getStatus() == TicketStatus.PAID || ticket.getStatus() == TicketStatus.CANCELED || ticket.getStatus() == TicketStatus.AWAITING_PAYMENT) {
            if (gateway.equalsIgnoreCase("PayPal") || gateway.equalsIgnoreCase("DOKU") || gateway.equalsIgnoreCase("Xendit")) {
                
                if (ticket.getTrain().getTrainType() == TrainType.STANDARD) {
                    if (ticket.getClassType() == ClassType.FIRST_CLASS) {
                        OnlinePayment payment = new OnlinePayment(String.valueOf(idTrans), gateway);


                        ticket.setPayment(payment);

                        ticket.setPrice(350000);

                    }
                    else if (ticket.getClassType() == ClassType.BUSINESS_CLASS) {
                        OnlinePayment payment = new OnlinePayment(String.valueOf(idTrans), gateway);

                        ticket.setPayment(payment);
                        
                        
                        ticket.setPrice(250000);
                    }
                    else if (ticket.getClassType() == ClassType.ECONOMY_CLASS) {
                        OnlinePayment payment = new OnlinePayment(String.valueOf(idTrans), gateway);

                        ticket.setPayment(payment);
                        
                        
                        ticket.setPrice(175000);
                    }
                    else{
                        return "Tipe Class tidak tersedia";
                    }
                }
                else if (ticket.getTrain().getTrainType() == TrainType.FASTTRAIN) {
                    if (ticket.getClassType() == ClassType.FIRST_CLASS) {
                        OnlinePayment payment = new OnlinePayment(String.valueOf(idTrans), gateway);


                        ticket.setPayment(payment);

                        ticket.setPrice(600000);
                    }
                    else if (ticket.getClassType() == ClassType.BUSINESS_CLASS) {
                        OnlinePayment payment = new OnlinePayment(String.valueOf(idTrans), gateway);

                        ticket.setPayment(payment);
                        
                        
                        ticket.setPrice(500000);
                    }
                    else if (ticket.getClassType() == ClassType.ECONOMY_CLASS) {
                        OnlinePayment payment = new OnlinePayment(String.valueOf(idTrans), gateway);

                        ticket.setPayment(payment);
                        
                        
                        ticket.setPrice(400000);
                    }
                    else{
                        return "Tipe Class tidak tersedia";
                    }
                }else{
                    return "Metode payment tidak tersedia";
                }
            }

            return "Payment success!";
        }
        return "Payment failed!";


        // Set payment dan price ditetapkan dari make Payment dikarenakan payment baru tersedia ketika passenger melakukan pembayaran. Dengan asumsi bahwa awaiting payment adalah waktu delay dari pihak bank dalam proses pengiriman uang.
    }



    public double calculateTotalRevenue(Date dateSearch){
        double total = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getStatus() != TicketStatus.AWAITING_PAYMENT && ticket.getReservation().getReservationDate() == dateSearch) {
                total += ticket.getPrice();
            }
        }
        return total;


        // Asumsi semua dianggap sudah bayar kecuali yang Awaiting payment.
    }
}
