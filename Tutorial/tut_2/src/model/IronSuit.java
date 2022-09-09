package model;

public class IronSuit extends Vehicle{
    public void fly(String fromDestination, String toDestination,double distance){
        int time= (int) ( distance/136.891);
        System.out.print(fromDestination);
        for(int i=0;i< time; i++){
            System.out.print(".");
            System.out.print("\uD83D\uDE80");
             // 0.3 second
            try {
                Thread.sleep(300); // pause
                // wake up: do something
            } catch (InterruptedException e) {
                // Ignore Exception handling
            }

        }
        System.out.print(toDestination);
    }
}
