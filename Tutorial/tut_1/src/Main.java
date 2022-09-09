import ex_1.MaxMinIntList;
import ex_2.Counter;
import ex_3.Bus;
import ex_3.Car;
import ex_3.InvalidLengthException;
import ex_3.Vehicle;

public class Main {
    public static void main(String[] args) {
        runTut1();
        runTut2();
        try {
            runTut3();
        } catch (InvalidLengthException e) {
            e.printStackTrace();
        }

    }

    public static void runTut1(){
        MaxMinIntList<Integer> list = new MaxMinIntList();
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(1);
        list.add(5);
        System.out.println("max "+list.max());
        System.out.println("min "+list.min());
    }

    public static void runTut2(){
        Counter counter = new Counter();
        counter.incr();
        counter.incr();
        counter.incr();
        counter.incr();
        System.out.println("Couter: "+counter.get());
    }

    public static void runTut3() throws InvalidLengthException {
        Vehicle bus= new Bus();
        bus.setLength(10000);
    }
}
