import model.Bus;
import model.Car;
import model.IronSuit;
import model.Vehicle;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Vehicle vehicle1=new Car();
        vehicle1.travel("Ha Noi","Hai Phong");
        Vehicle vehicle2=new Bus();
        vehicle2.travel("Ha Noi","Hai Phong");
        IronSuit vehicle3=new IronSuit();
        vehicle3.fly("Hanoi","Sai Gon",1000);
    }


}
