import javax.naming.ldap.UnsolicitedNotification;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {

    static int x = 25;

    public static void main(String[] args) {

        Random random = new Random();

        int oneUp = 2;
        int oneDown = 1;

        int nowUlitkaOn = random.nextInt(100);
        int size = random.nextInt(100);

        boolean[] month = new boolean[30];
        for (int a = 0; a < 30; a++){
            month[a]=random.nextBoolean();
            if (month[a]){
                nowUlitkaOn += oneUp;
                if (nowUlitkaOn > size)
                    nowUlitkaOn = size;
            }else {
                nowUlitkaOn -= oneDown;
                if (nowUlitkaOn < 0)
                    nowUlitkaOn = 0;
            }
        }
        System.out.println("NOW ULITKA = " + nowUlitkaOn + " Size derevo = " + size);



        int[][] array = new int[6][7];
        for (int i = 0; i < 6; i++){
            for (int k = 0; k < 7; k++){
                int max = 0;
                array[i][k] = random.nextInt(9);
                if (array[i][0] < array[i][k]){
                    max = array[i][k];
                    array[i][k] = array[i][0];
                    array[i][0] = max;
                }
                System.out.print(array[i][k] + " ");
            }
            System.out.println();
        }

        double wes = 25;
        double obhs = 0;

        double[] mas = new double[10];

        for(int i = 0; i < 10; i++){
            mas[i] = random.nextDouble()*10;
            obhs=obhs+mas[i];
        }
        double result = obhs/mas.length;
        System.out.println( "sredniy from array = " + result);

        double inTheMoon = (17*wes)/100;
        System.out.println("wes on the Moon = " + inTheMoon);

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
