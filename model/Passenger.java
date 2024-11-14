package model;
public class Passenger {
    private String passangerID;
    private String passangerName;
    private int passengerGender;
    private int passengerAge;


    
    
    public Passenger(String passangerID, String passangerName, int passengerGender, int passengerAge) {
        this.passangerID = passangerID;
        this.passangerName = passangerName;
        this.passengerGender = passengerGender;
        this.passengerAge = passengerAge;
    }


    public String getPassengerInfo(){
        String gender = (this.passengerGender == 0) ? "Male" : "Female";
        return "PassengerID: " + this.passangerID + "\nName: " + this.passangerName + "\nGender: " + gender + "\nAge: " + this.passengerAge + "\n";
    }

    
    public String getPassangerID() {
        return passangerID;
    }
    
    public void setPassangerID(String passangerID) {
        this.passangerID = passangerID;
    }
    
    
    public String getPassangerName() {
        return passangerName;
    }
    
    
    public void setPassangerName(String passangerName) {
        this.passangerName = passangerName;
    }
    
    
    public int getPassengerGender() {
        return passengerGender;
    }
    
    
    public void setPassengerGender(int passengerGender) {
        this.passengerGender = passengerGender;
    }
    
    
    public int getPassengerAge() {
        return passengerAge;
    }
    
    
    public void setPassengerAge(int passengerAge) {
        this.passengerAge = passengerAge;
    }
}
