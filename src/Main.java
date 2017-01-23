import javax.naming.ldap.UnsolicitedNotification;
import java.util.Random;

public class Main {

    static int x = 25;

    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();
        Unicecle unicecle = new Unicecle();
        Tricycle tricycle = new Tricycle();

        Cycle[] cycles = {bicycle, unicecle, tricycle};
        Bicycle b = (Bicycle) cycles[0];
        Unicecle u = (Unicecle) cycles[1];
        Tricycle t = (Tricycle) cycles[2];

        b.balance();
        u.balance();

        bicycle.ride();
        unicecle.ride();
        tricycle.ride();

        //getWheels(bicycle);
        //getWheels(unicecle);
        //getWheels(tricycle);

        bicycle.wheels();
        unicecle.wheels();
        tricycle.wheels();


        //t.balance();

        //  Tank t34 = new Tank("green", 2, 2, 2);
       // t34 = null;
        //System.gc();
    }

   // public static void getWheels(Cycle c){
     //   c.wheels();
    //}
}
