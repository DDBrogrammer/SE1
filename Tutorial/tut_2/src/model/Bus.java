package model;

public class Bus extends Vehicle {
    public Bus() {
    }
    public Bus(double weight, double length, String registrationNumber) throws InvalidWeightException, InvalidLengthException, InvalidRegistrationNumberException {
        super(weight, length, registrationNumber);
        if(!validateWeight(weight)){
            throw new InvalidWeightException("Invalid","Weight");
        }

        if(!validateLength(length)){
            throw new InvalidLengthException("Invalid","Length");
        }
        if(!validateRegistrationNumber(registrationNumber)){
            throw new InvalidRegistrationNumberException("Invalid","Registration Number");
        }
    }

    @Override
    public boolean validateRegistrationNumber(String registrationNumber){
        return registrationNumber.length()>=6 && registrationNumber.length() <= 8;
    }

    @Override
    public void setLength(double length) throws InvalidLengthException {
      if(!validateLength(length)){
          throw new InvalidLengthException("Invalid","Length");
      }else{
          super.setLength(length);
      }
    }

    @Override
    public void setWeight(double weight) throws InvalidWeightException {
        if(!validateLength(weight)){
            throw new InvalidWeightException("Invalid","Weight");
        }else{
            super.setWeight(weight);
        }
    }

    @Override
    public void setRegistrationNumber(String registrationNumber) throws InvalidRegistrationNumberException {
        if(!validateRegistrationNumber(registrationNumber)){
            throw new InvalidRegistrationNumberException("Invalid","Weight");
        }else{
            super.setRegistrationNumber(registrationNumber);
        }
    }
    private boolean validateWeight(double weight){
        return weight>5000.0 && weight<20000.0;
    }

    private boolean validateLength(double length){
        return length>4.0 && length<10.0;
    }

    @Override
    public void travel( String fromDestination, String toDestination){
        System.out.println("\uD83D\uDE8C " + fromDestination +" \uD83D\uDD1C "+toDestination);
    }
}
