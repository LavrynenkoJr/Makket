import java.util.Random;
import java.util.TimerTask;

/**
 * Created by java-1-04 on 24.02.2017.
 */
public class Visitor extends TimerTask{

    Random random = new Random();

    @Override
    public void run() {

        if (random.nextBoolean()){
            synchronized (Main.locker) {
                Main.room.enterVisitor();
                try {
                    Main.locker.wait(5000);
                    Main.room.exitVisitor();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
