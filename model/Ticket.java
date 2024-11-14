package model;
import model.Enum.ClassType;
import model.Enum.TicketStatus;

public class Ticket {
    private String ticketID;
    private String seatNumber;
    private ClassType classType;
    private TicketStatus status;
    private double price;


    private Train train;
    private Passenger passenger;
    private OnlinePayment payment;
    private Reservation reservation;



    public Ticket(String ticketID, ClassType classType, TicketStatus status,
            Train train, Passenger passenger, Reservation reservation) {
        this.ticketID = ticketID;
        this.classType = classType;
        this.status = status;
        this.train = train;
        this.passenger = passenger;
        this.reservation = reservation;

        // String seatNo = this.reservation.reserveSeat(train);
        // setSeatNumber(seatNo);
    }



    public String getTicketID() {
        return ticketID;
    }
    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }
    public String getSeatNumber() {
        return seatNumber;
    }
    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
    public ClassType getClassType() {
        return classType;
    }
    public void setClassType(ClassType classType) {
        this.classType = classType;
    }
    public TicketStatus getStatus() {
        return status;
    }
    public void setStatus(TicketStatus status) {
        this.status = status;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Train getTrain() {
        return train;
    }
    public void setTrain(Train train) {
        this.train = train;
    }
    public Passenger getPassenger() {
        return passenger;
    }
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
    public OnlinePayment getPayment() {
        return payment;
    }
    public void setPayment(OnlinePayment payment) {
        this.payment = payment;
    }
    public Reservation getReservation() {
        return reservation;
    }
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
