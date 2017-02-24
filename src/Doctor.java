import java.util.Random;
import java.util.TimerTask;

/**
 * Created by java-1-04 on 24.02.2017.
 */
public class Doctor extends TimerTask {
    Random random = new Random();

    int veroyatnost = 4;

    @Override
    public void run() {
        if (veroyatnost == random.nextInt(5)){
            synchronized (Main.locker) {
                Main.room.enterDoctor();
                try {
                    Main.locker.wait(10000);
                    Main.room.exitDoctor();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
