package model;

import java.util.Date;

public class Reservation {
    private String reservationID;
    private Date reservationDate;




    public Reservation(String reservationID, Date reservationDate) {
        this.reservationID = reservationID;
        this.reservationDate = reservationDate;
    }

    public String getReservationID() {
        return reservationID;
    }

    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String reserveSeat(Train train){
        int seat [][] = train.getSeat();
        for (int i = 0; i < seat.length; i++) {
            for (int j = 0; j < seat[i].length; j++) {
                if (seat[i][j] == 0) {
                    seat[i][j] = 1;
                    train.setSeat(seat);
                    return "A-" + i + j;
                }
            }
        }
        
        return "All seat have reserved";
    }

    public String cancelReservation(String seatNum, Train train){
        int seat [][] = train.getSeat();
        String seatNo = "A";

        for (int i = 0; i < seat.length; i++) {
            for (int j = 0; j < seat[i].length; j++) {
                seatNo += i + j;
                if (seatNo.equalsIgnoreCase(seatNum)) {
                    seat[i][j] = 0;
                    train.setSeat(seat);
                    return "Cancel Success";
                }
            }
        }
        return "Cancel failed";
    }
}
