package model;
import model.Enum.TrainType;

public class Train {
    private int trainNumber;
    private String trainName;
    private TrainType trainType;
    private int seat [][] = new int[2][2];
    

    public Train(int trainNumber, String trainName, TrainType trainType) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.trainType = trainType;
        

        for (int i = 0; i < seat.length; i++) {
            for (int j = 0; j < seat[i].length; j++) {
                seat[i][j] = 0;
            }
        }
    }

    public String getTrainDetails(){
        return "Train Number: " + this.trainNumber + "\nTrain Name: " + this.trainName + "\nTrain Type: " + this.trainType + "\n";
    }

    public int getTrainNumber() {
        return trainNumber;
    }
    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }
    public String getTrainName() {
        return trainName;
    }
    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }
    public TrainType getTrainType() {
        return trainType;
    }

    public void setTrainType(TrainType trainType) {
        this.trainType = trainType;
    }

    public int[][] getSeat() {
        return seat;
    }
    
    public void setSeat(int[][] seat) {
        this.seat = seat;
    }
    
}
