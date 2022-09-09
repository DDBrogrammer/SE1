package model;

public class Boat extends Vehicle{
    private double speed;

    public Boat(double weight, double length, String registrationNumber, double speed) throws InvalidSpeedException {
        super(weight, length, registrationNumber);
        if(!validateSpeed(weight)){
            throw new InvalidSpeedException("Invalid","Speed");
        }else{
            this.speed = speed;
        }

    }

    public void setSpeed(double speed) throws InvalidWeightException {
        if(!validateSpeed(speed)){
            throw new InvalidWeightException("Invalid","Speed");
        }else{
            this.speed = speed;
        }
    }

    public Boat(){}

    public boolean validateSpeed(Double speed){
        return speed<=17 && speed>0;
    }
}
